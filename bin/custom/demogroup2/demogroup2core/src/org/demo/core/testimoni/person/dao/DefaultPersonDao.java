package org.demo.core.testimoni.person.dao;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.TestiPersonModel;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultPersonDao implements PersonDao{

    @Resource(name="flexibleSearchService")
    private FlexibleSearchService flexibleSearchService;

    final private static String ALL_PERSON = "SELECT {pk} FROM {TestiPerson}";

    @Override
    public List<TestiPersonModel> getAllPerson() {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(ALL_PERSON);
        final SearchResult<TestiPersonModel> searchResult = flexibleSearchService.search(flexibleSearchQuery);
        final List<TestiPersonModel> result = searchResult.getResult();
        if (CollectionUtils.isNotEmpty(result)) {
            return result;
        }
        return Collections.emptyList();
    }
}
