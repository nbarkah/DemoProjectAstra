package org.demo.facades.populators;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.TestiPersonModel;
import org.demo.core.model.TestimoniModel;
import org.demo.facades.person.data.PersonData;
import org.demo.facades.testi.data.TestiData;

import javax.annotation.Resource;

public class PersonPopulator extends PersonBasicPopulator {

    @Resource(name = "testiConverter")
    private Converter<TestimoniModel, TestiData> testiConverter;

    @Override
    public void populate(final TestiPersonModel source, final PersonData target) {
        super.populate(source,target);
        if (CollectionUtils.isNotEmpty(source.getTestimoni())) {
            target.setTesti(testiConverter.convertAll(source.getTestimoni()));
        }
    }
}
