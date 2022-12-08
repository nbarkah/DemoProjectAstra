package org.demo.core.ITBCarousel.impl;

import org.demo.core.ITBCarousel.ITBCarouselService;
import org.demo.core.ITBCarousel.dao.ITBCarouselDao;
import org.demo.core.model.HomepageUnboxingITBCarouselComponentModel;


import javax.annotation.Resource;
import java.util.List;

public class DefaultITBCarouselService implements ITBCarouselService {
    @Resource(name = "ITBCarouselDao")
    private ITBCarouselDao ITBCarouselDao;

    @Override
    public List<HomepageUnboxingITBCarouselComponentModel> getAllITBCarousel() {
        return ITBCarouselDao.getAllITBCarousel();
    }
}
