package org.demo.core.pdp.service.impl;

import org.demo.core.model.DemoVariantProductModel;
import org.demo.core.pdp.dao.PdpDao;
import org.demo.core.pdp.service.PdpService;

import javax.annotation.Resource;
import java.util.List;

public class DefaultPdpService implements PdpService {

    @Resource(name = "pdpDao")
    private PdpDao pdpDao;
    @Override
    public List<DemoVariantProductModel> getVariantProductPdp(String code) {
        return pdpDao.getVariantProductPdp(code);
    }
}
