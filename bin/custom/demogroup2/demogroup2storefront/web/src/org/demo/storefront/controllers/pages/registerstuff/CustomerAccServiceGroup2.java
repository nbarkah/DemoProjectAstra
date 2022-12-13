//package org.demo.storefront.controllers.pages.registerstuff;
//
//import de.hybris.platform.basecommerce.enums.ReturnStatus;
//import de.hybris.platform.cms2.data.PageableData;
//import de.hybris.platform.commerceservices.customer.DuplicateUidException;
//import de.hybris.platform.commerceservices.customer.PasswordMismatchException;
//import de.hybris.platform.commerceservices.customer.TokenInvalidatedException;
//
//import de.hybris.platform.core.enums.OrderStatus;
//import de.hybris.platform.core.model.order.OrderModel;
//import de.hybris.platform.core.model.order.payment.CreditCardPaymentInfoModel;
//import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
//import de.hybris.platform.core.model.user.AddressModel;
//import de.hybris.platform.core.model.user.TitleModel;
//import de.hybris.platform.core.model.user.UserModel;
//import de.hybris.platform.core.servicelayer.data.SearchPageData;
//import de.hybris.platform.payment.dto.BillingInfo;
//import de.hybris.platform.payment.dto.CardInfo;
//import de.hybris.platform.returns.model.ReturnRequestModel;
//import de.hybris.platform.store.BaseStoreModel;
//
//import java.util.Collection;
//import java.util.List;
//
//public interface CustomerAccServiceGroup2 {
//    CreditCardPaymentInfoModel createPaymentSubscription(CustomerModelGroup2 var1, CardInfo var2, BillingInfo var3, String var4, String var5, boolean var6);
//
//    void setDefaultPaymentInfo(CustomerModelGroup2 var1, PaymentInfoModel var2);
//
//    List<CreditCardPaymentInfoModel> getCreditCardPaymentInfos(CustomerModelGroup2 var1, boolean var2);
//
//    CreditCardPaymentInfoModel getCreditCardPaymentInfoForCode(CustomerModelGroup2 var1, String var2);
//
//    void deleteCCPaymentInfo(CustomerModelGroup2 var1, CreditCardPaymentInfoModel var2);
//
//    /** @deprecated */
//    @Deprecated(
//            since = "6.7",
//            forRemoval = true
//    )
//    void unlinkCCPaymentInfo(CustomerModelGroup2 var1, CreditCardPaymentInfoModel var2);
//
//    Collection<TitleModel> getTitles();
//
//    List<AddressModel> getAllAddressEntries(CustomerModelGroup2 var1);
//
//    List<AddressModel> getAddressBookEntries(CustomerModelGroup2 var1);
//
//    List<AddressModel> getAddressBookDeliveryEntries(CustomerModelGroup2 var1);
//
//    AddressModel getAddressForCode(CustomerModelGroup2 var1, String var2);
//
//    AddressModel getDefaultAddress(CustomerModelGroup2 var1);
//
//    void saveAddressEntry(CustomerModelGroup2 var1, AddressModel var2);
//
//    void deleteAddressEntry(CustomerModelGroup2 var1, AddressModel var2);
//
//    void setDefaultAddressEntry(CustomerModelGroup2 var1, AddressModel var2);
//
//    void clearDefaultAddressEntry(CustomerModelGroup2 var1);
//
//    void register(CustomerModelGroup2 var1, String var2) throws DuplicateUidException;
//
//    void updateProfile(CustomerModelGroup2 var1, String var2, String var3, String var4) throws DuplicateUidException;
//
//    void changePassword(UserModel var1, String var2, String var3) throws PasswordMismatchException;
//
//    void forgottenPassword(CustomerModelGroup2 var1);
//
//    void updatePassword(String var1, String var2) throws TokenInvalidatedException;
//
//    OrderModel getOrderForCode(CustomerModelGroup2 var1, String var2, BaseStoreModel var3);
//
//    List<OrderModel> getOrderList(CustomerModelGroup2 var1, BaseStoreModel var2, OrderStatus[] var3);
//
//    SearchPageData<OrderModel> getOrderList(CustomerModelGroup2 var1, BaseStoreModel var2, OrderStatus[] var3, PageableData var4);
//
//    SearchPageData<ReturnRequestModel> getReturnRequestsByCustomerAndStore(CustomerModelGroup2 var1, BaseStoreModel var2, ReturnStatus[] var3, PageableData var4);
//
//    void changeUid(String var1, String var2) throws DuplicateUidException, PasswordMismatchException;
//
//    OrderModel getGuestOrderForGUID(String var1, BaseStoreModel var2);
//
//    void registerGuestForAnonymousCheckout(CustomerModelGroup2 var1, String var2) throws DuplicateUidException;
//
//    OrderModel getOrderDetailsForGUID(String var1, BaseStoreModel var2);
//
//    void convertGuestToCustomer(String var1, String var2) throws DuplicateUidException;
//
//    OrderModel getOrderForCode(String var1, BaseStoreModel var2);
//
//    CustomerModelGroup2 closeAccount(CustomerModelGroup2 var1);
//
//    default void setPopulatingConsentsInSessionEnabled(boolean populatingConsentsInSessionEnabled) {
//        throw new UnsupportedOperationException("Default implementation for backward compatibility");
//    }
//}
