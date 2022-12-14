package org.demo.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.apache.commons.lang.StringUtils;
import org.demo.core.model.DemoVariantProductModel;


public class DemoGroup2ProductPopulator implements Populator<ProductModel, ProductData> {
    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        if (productModel instanceof DemoVariantProductModel){
            final DemoVariantProductModel variantProductModel = (DemoVariantProductModel) productModel;

            if(variantProductModel.getSizeDimension() != null){

                productData.setSizeType(variantProductModel.getSizeDimension().getName());

                if (StringUtils.isNotEmpty(variantProductModel.getHeight()) ){
                      productData.setSizeDimension(variantProductModel.getSizeDimension().getDimension() + " x " + variantProductModel.getHeight());
                } else {
                      productData.setSizeDimension(variantProductModel.getSizeDimension().getDimension());
                }
            }


        }
    }
}

