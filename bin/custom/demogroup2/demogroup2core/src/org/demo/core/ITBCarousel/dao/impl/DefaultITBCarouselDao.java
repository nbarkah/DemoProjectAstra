package org.demo.core.ITBCarousel.dao.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.ITBCarousel.dao.ITBCarouselDao;
import org.demo.core.model.HomepageUnboxingITBCarouselComponentModel;


import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultITBCarouselDao implements ITBCarouselDao {
    @Resource(name = "flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    final private static String ALL_ITB_CAROUSEL_QUERY = "SELECT {pk} FROM {HomepageUnboxingITBCarouselComponent}";

    @Override
    public List<HomepageUnboxingITBCarouselComponentModel> getAllITBCarousel() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ALL_ITB_CAROUSEL_QUERY);
        final SearchResult<HomepageUnboxingITBCarouselComponentModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<HomepageUnboxingITBCarouselComponentModel> ITBCarouselModels = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(ITBCarouselModels)) {
            return ITBCarouselModels;
        }

        return Collections.emptyList();
    }
}
