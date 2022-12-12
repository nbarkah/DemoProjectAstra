<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="cartData" required="true" type="de.hybris.platform.commercefacades.order.data.CartData" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="storepickup" tagdir="/WEB-INF/tags/responsive/storepickup" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>

<spring:htmlEscape defaultHtmlEscape="true" />
<script src="https://cdn.tailwindcss.com"></script>
<c:set var="errorStatus" value="<%= de.hybris.platform.catalog.enums.ProductInfoStatus.valueOf(\"ERROR\") %>" />

<ul class="item__list item__list__cart">
    <li class="hidden-xs hidden-sm ">
        <ul class="flex justify-between px-20 text-3xl font-semibold pb-4 ">
            <li class=""><spring:theme code="basket.page.item"/></li>
            <div class=" w-[14em] flex justify-end" >
                <li class=""><spring:theme code="basket.page.qty"/></li>
            </div>
            <li class=""><spring:theme code="basket.page.total"/></li>
        </ul>
    </li>

	<c:forEach items="${cartData.rootGroups}" var="group" varStatus="loop">
    	<cart:rootEntryGroup cartData="${cartData}" entryGroup="${group}"/>
        <p></p>
    </c:forEach>
</ul>

<product:productOrderFormJQueryTemplates />
<storepickup:pickupStorePopup />
