package org.demo.core.testimoni.message.service;

import org.demo.core.model.TestimoniModel;
import org.demo.core.testimoni.message.dao.TestiDao;

import javax.annotation.Resource;
import java.util.List;

public class DefaultTestiService implements TestiService{
    @Resource(name = "testiDao")
    private TestiDao testiDao;

    @Override
    public List<TestimoniModel> getAllTestimoni() {
        return testiDao.getAllTestimoni();
    }
}
