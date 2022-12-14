package org.demo.facades.productUpsellComponent;



import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

public interface ProductUpsellFacade {

    List<ProductData> getVariantProductPdp (final String code);
}
