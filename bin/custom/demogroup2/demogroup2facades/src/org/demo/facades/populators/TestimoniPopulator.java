package org.demo.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.demo.core.model.TestiPersonModel;
import org.demo.core.model.TestimoniModel;
import org.demo.facades.person.data.PersonData;
import org.demo.facades.testi.data.TestiData;

import javax.annotation.Resource;

public class TestimoniPopulator implements Populator<TestimoniModel, TestiData> {

    @Resource(name = "personBasicConverter")
    private Converter<TestiPersonModel, PersonData> personBasicConverter;

    @Override
    public void populate(final TestimoniModel source, final TestiData target) throws ConversionException {
        target.setIdTesti(source.getIdTesti());
        target.setHeadMsg(source.getHeadMsg());
        target.setMessage(source.getMessage());
        target.setDate(source.getDate());

        if(null != source.getPerson()) {
            target.setPerson(personBasicConverter.convert(source.getPerson()));
        }
    }
}
