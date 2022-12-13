package org.demo.core.pdp.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.pdp.dao.PdpDao;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultPdpDao implements PdpDao {

    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;
    @Override
    public List<DemoVariantProductModel> getVariantProductPdp(final String code) {
        final String query = "select {v.pk} from {DemoVariantProduct as v JOIN Product as p ON {v.baseProduct} = {p.pk} JOIN CatalogVersion as cv ON {v.catalogVersion} = {cv.pk}} where {p.code} = ?code AND {cv.version}= 'Online'";
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter("code", code);
        final SearchResult<DemoVariantProductModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        List<DemoVariantProductModel> demoVariantProductModels = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(demoVariantProductModels)) {
            return demoVariantProductModels;
        }
        return Collections.emptyList();
    }
}
