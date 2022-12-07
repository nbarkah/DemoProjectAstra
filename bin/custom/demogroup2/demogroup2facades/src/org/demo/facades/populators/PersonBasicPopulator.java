package org.demo.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.demo.core.model.TestiPersonModel;
import org.demo.facades.person.data.PersonData;

public class PersonBasicPopulator implements Populator<TestiPersonModel, PersonData> {
    @Override
    public void populate(final TestiPersonModel source,final PersonData target) throws ConversionException {
        target.setId(source.getIdPerson());
        target.setPersonName(source.getPersonName());
        target.setRating(source.getRating());

    }
}
