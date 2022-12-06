package org.demo.facades.person;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.TestiPersonModel;

import org.demo.core.testimoni.person.service.PersonService;
import org.demo.facades.person.data.PersonData;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultPersonFacade implements PersonFacade{

    @Resource(name = "defaultPersonService")
    private PersonService personService;

    @Resource(name = "personConverter")
    private Converter<TestiPersonModel, PersonData> personConverter;

    @Override
    public List<PersonData> getAllPerson() {
        final List<TestiPersonModel> personModels = personService.getAllPerson();
        if (CollectionUtils.isNotEmpty(personModels)) {
            return personConverter.convertAll(personModels);
        }

        return Collections.emptyList();
    }
}
