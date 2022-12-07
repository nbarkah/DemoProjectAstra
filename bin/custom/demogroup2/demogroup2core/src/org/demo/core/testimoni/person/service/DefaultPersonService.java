package org.demo.core.testimoni.person.service;

import org.demo.core.model.TestiPersonModel;
import org.demo.core.testimoni.person.dao.PersonDao;

import javax.annotation.Resource;
import java.util.List;

public class DefaultPersonService implements PersonService{
    @Resource(name = "personDao")
    private PersonDao personDao;

    @Override
    public List<TestiPersonModel> getAllPerson() {
        return personDao.getAllPerson();
    }
}
