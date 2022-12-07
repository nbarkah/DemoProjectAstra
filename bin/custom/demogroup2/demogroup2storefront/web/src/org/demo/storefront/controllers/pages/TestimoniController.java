package org.demo.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.demo.facades.person.PersonFacade;
import org.demo.facades.testimoni.TestiFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;


@Controller
@RequestMapping("/testimony")
public class TestimoniController extends AbstractPageController {
    @Resource(name = "defaultTestiFacade")
    private TestiFacade testiFacade;

    @Resource(name = "defaultPersonFacade")
    private PersonFacade personFacade;
    private static final String TEMPLATE_PAGE = "testimony";
    private static final String LOGOUT = "logout";
    private static final String ACCOUNT_CONFIRMATION_SIGNOUT_TITLE = "account.confirmation.signout.title";
    private static final String ACCOUNT_CONFIRMATION_CLOSE_TITLE = "account.confirmation.close.title";

    @RequestMapping(method = RequestMethod.GET)
    public String testi(@RequestParam(value = WebConstants.CLOSE_ACCOUNT, defaultValue = "false") final boolean closeAcc,
                       @RequestParam(value = LOGOUT, defaultValue = "false") final boolean logout, final Model model,
                       final RedirectAttributes redirectModel) throws CMSItemNotFoundException
    {
        if (logout)
        {
            String message = ACCOUNT_CONFIRMATION_SIGNOUT_TITLE;
            if (closeAcc)
            {
                message = ACCOUNT_CONFIRMATION_CLOSE_TITLE;
            }
            GlobalMessages.addFlashMessage(redirectModel, GlobalMessages.INFO_MESSAGES_HOLDER, message);
            return REDIRECT_PREFIX + ROOT;
        }
        final ContentPageModel contentPage = getContentPageForLabelOrId(TEMPLATE_PAGE);
        storeCmsPageInModel(model, contentPage);
        setUpMetaDataForContentPage(model, contentPage);
        updatePageTitle(model, contentPage);
        model.addAttribute("personList", personFacade.getAllPerson());
        model.addAttribute("testimoni",testiFacade.getAllTestimoni());
        return getViewForPage(model);
    }
    protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
    {
        storeContentPageTitleInModel(model, getPageTitleResolver().resolveHomePageTitle(cmsPage.getTitle()));
    }

}