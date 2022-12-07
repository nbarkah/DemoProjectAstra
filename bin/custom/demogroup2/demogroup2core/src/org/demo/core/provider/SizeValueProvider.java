package org.demo.core.provider;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;
import org.demo.core.model.DemoVariantProductModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SizeValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider {

    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {
        if (model instanceof DemoVariantProductModel) {
            final DemoVariantProductModel product = (DemoVariantProductModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<>();
            fieldValues.addAll(createFieldValue(product, indexedProperty));
            return fieldValues;
        } else {
            throw new FieldValueProviderException("cannot get Size");
        }
    }

    protected List<FieldValue> createFieldValue(final DemoVariantProductModel product, final IndexedProperty indexedProperty) {
        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        final Collection<String> fieldNames = getFieldNameProvider().getFieldNames(indexedProperty, null);
        String indexName="";
        if (null != product.getSizeDimension()) {
            for (final String fieldName : fieldNames) {
                if (fieldName.contains("sizeDimension")) {
                    indexName = product.getSizeDimension().getDimension() + " x " + product.getHeight();
                } else if (fieldName.contains("sizeType")) {
                    indexName = product.getSizeDimension().getName();
                } else {
                    indexName = product.getSizeDimension().getName();
                }
                fieldValues.add(new FieldValue(fieldName, indexName));
            }
        }
        return fieldValues;
    }

    public FieldNameProvider getFieldNameProvider() {
        return fieldNameProvider;
    }

    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

}
