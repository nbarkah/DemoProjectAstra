<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="multi-checkout" tagdir="/WEB-INF/tags/responsive/checkout/multi"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
				<ycommerce:testId code="checkoutStepTwo">
					<div class="checkout-shipping">
						<multi-checkout:shipmentItems cartData="${cartData}" showDeliveryAddress="true" />
						<div class="checkout-indent">
							<div class="headline"><spring:theme code="checkout.summary.deliveryMode.selectDeliveryMethodForOrder" /></div>
							<spring:url var="selectDeliveryMethodUrl" value="{contextPath}/checkout/multi/delivery-method/select" htmlEscape="false" >
								<spring:param name="contextPath" value="${request.contextPath}" />
							</spring:url>
							<form id="selectDeliveryMethodForm" action="${fn:escapeXml(selectDeliveryMethodUrl)}" method="get">
								<div class="form-group">
									<multi-checkout:deliveryMethodSelector deliveryMethods="${deliveryMethods}" selectedDeliveryMethodId="${cartData.deliveryMode.code}"/>
								</div>
							</form>
							<spring:theme var="deliveryMethodMessageHtml" code="checkout.multi.deliveryMethod.message" htmlEscape="false"/>
							<p>${ycommerce:sanitizeHTML(deliveryMethodMessageHtml)}</p>
						</div>
					</div>
				    <button id="deliveryMethodSubmit" type="button" class="w-full text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300 dark:focus:ring-cyan-800 font-medium rounded-lg text-3xl px-5 py-2.5 text-center mr-2 mb-8">
                        <spring:theme code="checkout.multi.deliveryMethod.continue"/>
                    </button>
				</ycommerce:testId>
			</jsp:body>
		</multi-checkout:checkoutSteps>
    </div>

    <div class="col-sm-6 hidden-xs">
		<multi-checkout:checkoutOrderDetails cartData="${cartData}" showDeliveryAddress="true" showPaymentInfo="false" showTaxEstimate="false" showTax="true" />
    </div>

    <div class="col-sm-12 col-lg-12">
        <cms:pageSlot position="SideContent" var="feature" element="div" class="checkout-help">
            <cms:component component="${feature}"/>
        </cms:pageSlot>
    </div>
</div>

</template:page>
