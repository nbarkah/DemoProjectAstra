<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="actionNameKey" required="true" type="java.lang.String"%>
<%@ attribute name="action" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>

<style>
    .regis-image{
       display:flex;
       justify-content:center;
       width:20em;
    }

    .regis-title {
        font-size:0.8em;
        font-weight:800;
        color:gray;
        text-align:center;
        margin-top:2em;
    }

    .regis-subtitle{
        font-size:0.6em;
        font-weight:600;
        text-align:center;
    }
</style>

<spring:htmlEscape defaultHtmlEscape="true" />

<spring:url value="/login/register/termsandconditions" var="getTermsAndConditionsUrl"/>

<div class="user-register__headline">
	<spring:theme code="" />
	<div class="regis-image">
    	<img src="https://inthebox.net/images/logo-inthebox-440x80.png" style="max-width: 300px">
    </div>
    <h1 class="regis-title">Daftar Sekarang </p>
    <p class="regis-subtitle">Masukan detail anda untuk menciptakan akun</p>
</div>

<form:form method="post" modelAttribute="registerForm" action="${action}" inputCSS="regis-width" >
	<formElement:formSelectBoxDefaultEnabled idKey="register.title"
		labelKey="register.title" selectCSSClass="form-control form-style"
		path="titleCode" mandatory="true" skipBlank="false"
		skipBlankMessageKey="form.select.none" items="${titles}" />
	<formElement:formInputBox idKey="register.firstName"
		labelKey="register.firstName" path="firstName" inputCSS="form-control form-style"
		mandatory="true" />
	<formElement:formInputBox idKey="register.lastName"
		labelKey="register.lastName" path="lastName" inputCSS="form-control form-style"
		mandatory="true" />
	<formElement:formInputBox idKey="register.email"
		labelKey="register.email" path="email" inputCSS="form-control form-style"
		mandatory="true" />
	<formElement:formPasswordBox idKey="password" labelKey="register.pwd"
		path="pwd" inputCSS="form-control password-strength form-style" mandatory="true" />
	<formElement:formPasswordBox idKey="register.checkPwd"
		labelKey="register.checkPwd" path="checkPwd" inputCSS="form-control form-style"
		mandatory="true" />

    <c:if test="${ not empty consentTemplateData }">
        <form:hidden path="consentForm.consentTemplateId" value="${consentTemplateData.id}" />
        <form:hidden path="consentForm.consentTemplateVersion" value="${consentTemplateData.version}" />
        <div class="checkbox">
            <label class="control-label uncased">
                <form:checkbox path="consentForm.consentGiven" disabled="true"/>
                <c:out value="${consentTemplateData.description}" />

            </label>
        </div>
		<div class="help-block">
			<spring:theme code="registration.consent.link" />
		</div>

    </c:if>

	<spring:theme code="register.termsConditions" arguments="${getTermsAndConditionsUrl}" var="termsConditionsHtml" htmlEscape="false" />
	<template:errorSpanField path="termsCheck">
		<div class="checkbox">
			<label class="control-label uncased">
				<form:checkbox id="registerChkTermsConditions" path="termsCheck" disabled="true"/>
				${ycommerce:sanitizeHTML(termsConditionsHtml)}
			</label>
		</div>
	</template:errorSpanField>

	<input type="hidden" id="recaptchaChallangeAnswered"
		value="${fn:escapeXml(requestScope.recaptchaChallangeAnswered)}" />
	<div class="form_field-elements control-group js-recaptcha-captchaaddon"></div>
	<div class="form-actions clearfix">
		<ycommerce:testId code="register_Register_button">
			<button type="submit" class="daftar-button btn-default btn-block" disabled="disabled">
				<spring:theme code='${actionNameKey}' />
			</button>
		</ycommerce:testId>
	</div>
</form:form>
