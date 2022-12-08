//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.demo.core.provider;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.product.PriceService;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import org.apache.commons.collections4.CollectionUtils;

public class PriceValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {
    private FieldNameProvider fieldNameProvider;
    private PriceService priceService;

    public PriceValueProvider() {
    }

    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (!(model instanceof ProductModel)) {
            throw new FieldValueProviderException("Cannot evaluate price of non-product item");
        } else {
            Collection<FieldValue> fieldValues = new ArrayList();
            ProductModel product = (ProductModel)model;
            if (indexedProperty.isCurrency() && CollectionUtils.isNotEmpty(indexConfig.getCurrencies())) {
                CurrencyModel sessionCurrency = this.i18nService.getCurrentCurrency();

                try {
                    Iterator var8 = indexConfig.getCurrencies().iterator();

                    while(var8.hasNext()) {
                        CurrencyModel currency = (CurrencyModel)var8.next();
                        this.i18nService.setCurrentCurrency(currency);
                        this.addFieldValues(fieldValues, product, indexedProperty, currency.getIsocode());
                    }
                } finally {
                    this.i18nService.setCurrentCurrency(sessionCurrency);
                }
            } else {
                this.addFieldValues(fieldValues, product, indexedProperty, (String)null);
            }

            return fieldValues;
        }
    }

    protected void addFieldValues(Collection<FieldValue> fieldValues, ProductModel product, IndexedProperty indexedProperty, String currency) throws FieldValueProviderException {
        List<PriceInformation> prices = this.priceService.getPriceInformationsForProduct(product);
        if (!CollectionUtils.isEmpty(prices)) {
            Double value = ((PriceInformation)prices.get(0)).getPriceValue().getValue();
            Collection<String> fieldNames = this.fieldNameProvider.getFieldNames(indexedProperty, currency == null ? null : currency.toLowerCase(Locale.ROOT));
            Iterator var10 = fieldNames.iterator();

            while(true) {
                while(var10.hasNext()) {
                    String fieldName = (String) var10.next();
                    fieldValues.add(new FieldValue(fieldName, value));
                }
                return;
            }
        }
    }

    public void setFieldNameProvider(FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

    public void setPriceService(PriceService priceService) {
        this.priceService = priceService;
    }

}
