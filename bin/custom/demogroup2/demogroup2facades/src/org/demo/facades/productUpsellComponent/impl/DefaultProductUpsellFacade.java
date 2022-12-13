package org.demo.facades.productUpsellComponent.impl;


import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.pdp.service.PdpService;
import org.demo.facades.productUpsellComponent.ProductUpsellFacade;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultProductUpsellFacade implements ProductUpsellFacade {
    @Resource(name = "defaultPdpService")
    private PdpService pdpService;

    @Resource(name = "demoGroup2ProductConverter")
    private Converter<DemoVariantProductModel, ProductData> demoGroup2ProductConverter;

    @Resource(name = "productVariantFacade")
    private ProductFacade productFacade;

    @Override
    public List<ProductData> getVariantProductPdp(String code) {
        final List<ProductOption> options = new ArrayList<>(Arrays.asList(ProductOption.VARIANT_FIRST_VARIANT, ProductOption.BASIC,
                ProductOption.URL, ProductOption.PRICE, ProductOption.SUMMARY, ProductOption.DESCRIPTION, ProductOption.GALLERY,
                ProductOption.CATEGORIES, ProductOption.REVIEW, ProductOption.PROMOTIONS, ProductOption.CLASSIFICATION,
                ProductOption.VARIANT_FULL, ProductOption.STOCK, ProductOption.VOLUME_PRICES, ProductOption.PRICE_RANGE,
                ProductOption.DELIVERY_MODE_AVAILABILITY,ProductOption.SIZE_DIMENSION));

        final List<ProductData> productDataList = new ArrayList<>();
        final List<DemoVariantProductModel> demoVariantProductModels = pdpService.getVariantProductPdp(code);
        if (CollectionUtils.isNotEmpty(demoVariantProductModels)){
            for (DemoVariantProductModel demoVariantProductModel : demoVariantProductModels) {
               productDataList.add(productFacade.getProductForCodeAndOptions(demoVariantProductModel.getCode(), options));
            }
        }
        return productDataList;
    }



}
