/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.demo.storefront.controllers.cms;

import org.demo.core.model.FeatureTileComponentModel;
import org.demo.core.model.HomepageFeaturesComponentModel;
import org.demo.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * Controller for CMS ProductFeatureComponent
 */
@Controller("HomepageFeaturesComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.HomepageFeaturesComponent)
public class HomepageFeaturesComponentController extends AbstractAcceleratorCMSComponentController<HomepageFeaturesComponentModel>
{

	@Override
	protected void fillModel(HttpServletRequest request, Model model, HomepageFeaturesComponentModel component) {
		model.addAttribute("title", component.getTitle());
		model.addAttribute("subtitle", component.getSubtitle());
		model.addAttribute("features", component.getFeatureTiles());
	}
}
