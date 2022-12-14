<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="address" tagdir="/WEB-INF/tags/responsive/address"%>
<%@ taglib prefix="multi-checkout" tagdir="/WEB-INF/tags/responsive/checkout/multi"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<template:page pageTitle="${pageTitle}" hideHeaderLinks="true">
<script src="https://cdn.tailwindcss.com"></script>
<div class="row">
    <div class="col-sm-6">
	    <div class="checkout-headline">
            <span class="glyphicon glyphicon-lock"></span>
            <spring:theme code="checkout.multi.secure.checkout" />
        </div>
        <multi-checkout:checkoutSteps checkoutSteps="${checkoutSteps}" progressBarId="${progressBarId}">
            <jsp:body>
                <ycommerce:testId code="checkoutStepOne">
                    <div class="checkout-shipping">
                            <multi-checkout:shipmentItems cartData="${cartData}" showDeliveryAddress="false" />

                            <div class="checkout-indent">
                                <div class="headline"><spring:theme code="checkout.summary.shippingAddress" /></div>


                                    <address:addressFormSelector supportedCountries="${countries}"
                                        regions="${regions}" cancelUrl="${currentStepUrl}"
                                        country="${country}" />

                                        <div id="addressbook">

                                            <spring:url var="selectDeliveryAddressUrl" value="{contextPath}/checkout/multi/delivery-address/select" htmlEscape="false">
                                                <spring:param name="contextPath" value="${request.contextPath}" />
                                            </spring:url>

                                            <c:forEach items="${deliveryAddresses}" var="deliveryAddress" varStatus="status">
                                                <div class="addressEntry">
                                                    <form action="${fn:escapeXml(selectDeliveryAddressUrl)}" method="GET">
                                                        <input type="hidden" name="selectedAddressCode" value="${fn:escapeXml(deliveryAddress.id)}" />
                                                        <ul>
                                                            <li>
                                                                <strong><c:if test="${ not empty deliveryAddress.title }"> ${fn:escapeXml(deliveryAddress.title)}&nbsp;</c:if>
                                                                ${fn:escapeXml(deliveryAddress.firstName)}&nbsp;
                                                                ${fn:escapeXml(deliveryAddress.lastName)}</strong>
                                                                <br>
                                                                ${fn:escapeXml(deliveryAddress.line1)}&nbsp;
                                                                ${fn:escapeXml(deliveryAddress.line2)}
                                                                <br>
                                                                ${fn:escapeXml(deliveryAddress.town)}
                                                                <c:if test="${not empty deliveryAddress.region.name}">
                                                                    &nbsp;${fn:escapeXml(deliveryAddress.region.name)}
                                                                </c:if>
                                                                <br>
                                                                ${fn:escapeXml(deliveryAddress.country.name)}&nbsp;
                                                                ${fn:escapeXml(deliveryAddress.postalCode)}
                                                            </li>
                                                        </ul>
                                                        <button type="submit" class="w-full text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300 dark:focus:ring-cyan-800 font-medium rounded-lg text-3xl px-5 py-2.5 text-center mr-2 mb-8">
                                                            <spring:theme code="checkout.multi.deliveryAddress.useThisAddress" />
                                                        </button>
                                                    </form>
                                                </div>
                                            </c:forEach>
                                        </div>

                                        <address:suggestedAddresses selectedAddressUrl="/checkout/multi/delivery-address/select" />
                            </div>

                                <multi-checkout:pickupGroups cartData="${cartData}" />
                    </div>

                <button id="addressSubmit" type="button" class="w-full mt-8 text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300 dark:focus:ring-cyan-800 font-medium rounded-lg text-3xl px-5 py-2.5 text-center mr-2 mb-8">
                    <spring:theme code="checkout.multi.deliveryAddress.continue"/>
                </button>
                </ycommerce:testId>
            </jsp:body>
        </multi-checkout:checkoutSteps>
    </div>

    <div class="col-sm-6 hidden-xs">
		<multi-checkout:checkoutOrderDetails cartData="${cartData}" showDeliveryAddress="false" showPaymentInfo="false" showTaxEstimate="false" showTax="true" />
    </div>

    <div class="col-sm-12 col-lg-12">
        <cms:pageSlot position="SideContent" var="feature" element="div" class="checkout-help">
            <cms:component component="${feature}"/>
        </cms:pageSlot>
    </div>
</div>

</template:page>
