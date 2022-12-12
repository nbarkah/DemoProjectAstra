package org.demo.core.pdp.service;

import org.demo.core.model.DemoVariantProductModel;

import java.util.List;

public interface PdpService {

    List<DemoVariantProductModel> getVariantProductPdp(String code);
}
