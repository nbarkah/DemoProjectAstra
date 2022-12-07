package org.demo.facades.testimoni;


import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.apache.commons.collections.CollectionUtils;
import org.demo.core.model.TestimoniModel;
import org.demo.core.testimoni.message.service.TestiService;
import org.demo.facades.testi.data.TestiData;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

public class DefaultTestiFacade implements TestiFacade{
    @Resource(name = "defaultTestiService")
    private TestiService testiService;

    @Resource(name = "testiConverter")
    private Converter<TestimoniModel, TestiData> testiConverter;



    @Override
    public List<TestiData> getAllTestimoni() {
        final List<TestimoniModel> testiMessages = testiService.getAllTestimoni();
        if (CollectionUtils.isNotEmpty(testiMessages)) {
            return testiConverter.convertAll(testiMessages);
        }

        return Collections.emptyList();
    }
}
