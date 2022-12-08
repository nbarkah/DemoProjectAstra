/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.storefront.controllers.cms;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.demo.core.model.HomepageCardProductCarouselComponentModel;
import org.demo.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * Controller for CMS ProductReferencesComponent.
 */
@Controller("HomepageCardProductCarouselComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.HomepageCardProductCarouselComponent)
public class HomepageCardProductCarouselComponentController extends AbstractAcceleratorCMSComponentController<HomepageCardProductCarouselComponentModel>
{
    @Resource(name = "productConverter")
    private Converter <ProductModel, ProductData> productConverter;

    @Override
    protected void fillModel(HttpServletRequest request, Model model, HomepageCardProductCarouselComponentModel component) {
        final List<ProductData> products = new ArrayList<>();

        model.addAttribute("title", component.getTitle());
        model.addAttribute("productData", products);
    }
}
