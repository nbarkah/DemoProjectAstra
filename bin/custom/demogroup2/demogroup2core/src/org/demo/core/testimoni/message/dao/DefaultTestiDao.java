package org.demo.core.testimoni.message.dao;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.TestimoniModel;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultTestiDao implements  TestiDao{
    @Resource(name="flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    final private static String ALL_MESSAGE = "SELECT {pk} FROM {Testimoni}";

    @Override
    public List<TestimoniModel> getAllTestimoni() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ALL_MESSAGE);
        final SearchResult<TestimoniModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<TestimoniModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result;
        }
        return Collections.emptyList();
    }
}
