package org.demo.storefront.controllers.cms;


import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import org.apache.commons.lang.StringUtils;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.model.ProductUpsellComponentModel;
import org.demo.facades.productUpsellComponent.ProductUpsellFacade;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ProductUpsellComponentController extends AbstractAcceleratorCMSComponentController<ProductUpsellComponentModel>{

    protected static final List<ProductOption> PRODUCT_OPTIONS = Arrays.asList(ProductOption.BASIC, ProductOption.PRICE);
    @Resource(name = "defaultProductUpsellFacade")
    private ProductUpsellFacade productUpsellFacade;

    @Resource(name = "productFacade")
    private ProductFacade productFacade;


    @Override
    protected void fillModel(HttpServletRequest request, Model model, ProductUpsellComponentModel component) {
        final DemoVariantProductModel currentProduct = (DemoVariantProductModel) getRequestContextData(request).getProduct();

        List<ProductData> upsellProducts;
        List<ProductData> products = new ArrayList<>();
        if(currentProduct != null){
            upsellProducts = productUpsellFacade.getVariantProductPdp(String.valueOf(currentProduct));

            for(final ProductData productData : upsellProducts){
                if(StringUtils.isNotBlank(productData.getCode())){
                    ProductData productDataTemp = productFacade.getProductForCodeAndOptions(productData.getCode(), PRODUCT_OPTIONS);
                    products.add(productDataTemp);
                }
            }

            model.addAttribute("upsellProducts", products);

        }

    }
}
