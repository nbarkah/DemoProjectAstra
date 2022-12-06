package org.demo.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.demo.facades.person.PersonFacade;
import org.demo.facades.testimoni.TestiFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/testimoniPage")
public class TestimoniController extends AbstractPageController {
    @Resource(name = "defaultTestiFacade")
    private TestiFacade testiFacade;

    @Resource(name = "defaultPersonFacade")
    private PersonFacade personFacade;
    private static final String TEMPLATE_PAGE = "testimoniPage";

    @RequestMapping(value=TEMPLATE_PAGE, method = RequestMethod.GET)
    public String getTrainingAccountPage(final Model model) throws CMSItemNotFoundException {
        final ContentPageModel contentPage = getContentPageForLabelOrId(TEMPLATE_PAGE);
        storeCmsPageInModel(model, contentPage);
        setUpMetaDataForContentPage(model, contentPage);
        model.addAttribute("personList", personFacade.getAllPerson());
        model.addAttribute("testimoni",testiFacade.getAllTestimoni());
        return getViewForPage(model);
    }
}