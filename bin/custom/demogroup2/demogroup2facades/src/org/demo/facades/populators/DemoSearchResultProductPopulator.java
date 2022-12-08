package org.demo.facades.populators;

import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;

public class DemoSearchResultProductPopulator extends SearchResultProductPopulator {
    @Override
    public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException {
        target.setSizeDimension(this.<String>getValue(source, "sizeDimension"));
        target.setSizeType(this.<String>getValue(source, "sizeType"));
        target.setBrands(this.<String>getValue(source, "brands"));
    }

    @Override
    protected void populatePrices(SearchResultValueData source, ProductData target) {
        final Double priceValue = this.<Double>getValue(source, "price_idr_double");
        if (priceValue != null) {
            final PriceData priceData = getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(priceValue.doubleValue()),
                    getCommonI18NService().getCurrentCurrency());
            target.setPrice(priceData);
        }
    }
}
