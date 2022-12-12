/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.storefront.controllers.cms;

import de.hybris.platform.acceleratorcms.model.components.ProductFeatureComponentModel;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import org.demo.core.model.FeatureTileComponentModel;
import org.demo.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;


/**
 * Controller for CMS ProductFeatureComponent
 */
@Controller("FeatureTileComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.FeatureTileComponent)
public class FeatureTileComponentController extends AbstractAcceleratorCMSComponentController<FeatureTileComponentModel>
{

	@Override
	protected void fillModel(HttpServletRequest request, Model model, FeatureTileComponentModel component) {
		model.addAttribute("title", component.getTitle());
		model.addAttribute("subtitle", component.getSubtitle());
		model.addAttribute("description", component.getDescription());
		model.addAttribute("images", component.getImage());
	}
}
