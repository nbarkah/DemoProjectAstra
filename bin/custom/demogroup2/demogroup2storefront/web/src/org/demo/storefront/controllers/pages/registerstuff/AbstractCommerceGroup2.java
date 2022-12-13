//package org.demo.storefront.controllers.pages.registerstuff;
//
//import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
//import de.hybris.platform.core.model.c2l.CurrencyModel;
//import de.hybris.platform.core.model.c2l.LanguageModel;
//import de.hybris.platform.servicelayer.event.events.AbstractEvent;
//import de.hybris.platform.store.BaseStoreModel;
//
//public class AbstractCommerceGroup2 <T extends BaseSiteModel> extends AbstractEvent {
//
//    private BaseStoreModel baseStore;
//    private T site;
//    private CustomerModelGroup2 customer;
//    private LanguageModel language;
//    private CurrencyModel currency;
//
//    public AbstractCommerceGroup2() {
//    }
//
//    public BaseStoreModel getBaseStore() {
//        return this.baseStore;
//    }
//
//    public void setBaseStore(BaseStoreModel baseStore) {
//        this.baseStore = baseStore;
//    }
//
//    public T getSite() {
//        return this.site;
//    }
//
//    public void setSite(T site) {
//        this.site = site;
//    }
//
//    public CustomerModelGroup2 getCustomer() {
//        return this.customer;
//    }
//
//    public void setCustomer(CustomerModelGroup2 customer) {
//        this.customer = customer;
//    }
//
//    public LanguageModel getLanguage() {
//        return this.language;
//    }
//
//    public void setLanguage(LanguageModel language) {
//        this.language = language;
//    }
//
//    public CurrencyModel getCurrency() {
//        return this.currency;
//    }
//
//    public void setCurrency(CurrencyModel currency) {
//        this.currency = currency;
//    }
//}
