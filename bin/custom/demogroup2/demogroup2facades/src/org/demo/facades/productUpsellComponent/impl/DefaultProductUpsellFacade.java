package org.demo.facades.productUpsellComponent.impl;


import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.pdp.service.PdpService;
import org.demo.facades.productUpsellComponent.ProductUpsellFacade;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultProductUpsellFacade implements ProductUpsellFacade {
    @Resource(name = "defaultPdpService")
    private PdpService pdpService;

    @Resource(name = "demoGroup2ProductConverterr")
    private Converter<DemoVariantProductModel, ProductData> productUpsellConverter;

    @Override
    public List<ProductData> getVariantProductPdp(String code) {
        final List<DemoVariantProductModel> demoVariantProductModels = pdpService.getVariantProductPdp(code);
        if (CollectionUtils.isNotEmpty(demoVariantProductModels)){
            return  productUpsellConverter.convertAll(demoVariantProductModels);
        }
        return Collections.emptyList();
    }

}
