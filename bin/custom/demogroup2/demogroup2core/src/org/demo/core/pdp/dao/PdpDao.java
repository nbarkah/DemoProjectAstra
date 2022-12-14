package org.demo.core.pdp.dao;

import de.hybris.platform.core.model.product.ProductModel;
import org.demo.core.model.DemoVariantProductModel;

import java.util.List;

public interface PdpDao {

    List<DemoVariantProductModel> getVariantProductPdp(final String code);
}
