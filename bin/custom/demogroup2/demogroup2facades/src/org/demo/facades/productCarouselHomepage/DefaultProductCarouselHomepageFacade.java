package org.demo.facades.productCarouselHomepage;

import de.hybris.platform.acceleratorfacades.productcarousel.impl.DefaultProductCarouselFacade;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2lib.model.components.ProductCarouselComponentModel;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.session.SessionExecutionBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultProductCarouselHomepageFacade extends DefaultProductCarouselFacade {

    protected static final List<ProductOption> PRODUCT_OPTIONS = Arrays.asList(ProductOption.BASIC, ProductOption.URL, ProductOption.PRICE, ProductOption.SUMMARY, ProductOption.DESCRIPTION, ProductOption.GALLERY,
            ProductOption.CATEGORIES, ProductOption.REVIEW, ProductOption.PROMOTIONS, ProductOption.CLASSIFICATION,
            ProductOption.VARIANT_FULL, ProductOption.STOCK, ProductOption.VOLUME_PRICES, ProductOption.PRICE_RANGE,
            ProductOption.DELIVERY_MODE_AVAILABILITY,ProductOption.SIZE_DIMENSION);

    protected List<ProductData> fetchProductsForNonPreviewMode(final ProductCarouselComponentModel component)
    {

        final List<ProductData> products = new ArrayList<>();

        for (final ProductModel productModel : component.getProducts())
        {
            products.add(getProductFacade().getProductForCodeAndOptions(productModel.getCode(), PRODUCT_OPTIONS));
        }

        for (final CategoryModel categoryModel : component.getCategories())
        {
            for (final ProductModel productModel : categoryModel.getProducts())
            {
                products.add(getProductFacade().getProductForCodeAndOptions(productModel.getCode(), PRODUCT_OPTIONS));
            }
        }

        return products;

    }

    protected List<ProductData> fetchProductsForPreviewMode(final ProductCarouselComponentModel component)
    {

        return getSessionService().executeInLocalView(new SessionExecutionBody()
        {

            @Override
            public Object execute()
            {
                try
                {
                    getSearchRestrictionService().disableSearchRestrictions();

                    final List<ProductData> products = new ArrayList<>();

                    for (final ProductModel productModel : getDisplayableProductsForProductCarousel(component))
                    {
                        products.add(getProductForOptions(productModel, PRODUCT_OPTIONS));
                    }

                    for (final CategoryModel categoryModel : getListOfCategoriesForProductCarousel(component))
                    {
                        for (final ProductModel productModel : getDisplayableProductsForCategory(categoryModel))
                        {
                            products.add(getProductForOptions(productModel, PRODUCT_OPTIONS));
                        }
                    }

                    return products;


                }
                finally
                {
                    getSearchRestrictionService().enableSearchRestrictions();
                }
            }

        });

    }
}
