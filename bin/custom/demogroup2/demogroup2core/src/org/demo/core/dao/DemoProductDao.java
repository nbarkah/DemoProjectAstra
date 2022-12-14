package org.demo.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import org.demo.core.model.DemoProductModel;
import org.demo.core.model.DemoVariantProductModel;

import java.util.List;

public interface DemoProductDao {
    List<ProductModel> getAllProduct();
}
