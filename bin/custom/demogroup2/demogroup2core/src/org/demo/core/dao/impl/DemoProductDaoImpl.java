package org.demo.core.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.dao.DemoProductDao;
import org.demo.core.model.DemoProductModel;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DemoProductDaoImpl extends AbstractItemDao implements DemoProductDao {
    @Resource
    FlexibleSearchService flexibleSearchService;

    @Override
    public List<ProductModel> getAllProduct() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery("SELECT {pk} from {Product}");
        final SearchResult<ProductModel> result = this.search(flexibleSearchQuery);
        if (CollectionUtils.isNotEmpty(result.getResult())) {
            return result.getResult();
        }
        return Collections.emptyList();
    }
}
