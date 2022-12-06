package org.demo.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DemoSearchResultProductPopulator extends SearchResultProductPopulator {
    @Override
    public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException {
        target.setSizeDimension(this.<String>getValue(source, "sizeDimension"));
        target.setSizeType(this.<String>getValue(source, "sizeType"));
    }
}
