<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="actionNameKey" required="true" type="java.lang.String"%>
<%@ attribute name="action" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<style>
    .login-image{
        display:flex;
        justify-content:center;
        width:20em;
    }

    .login-headline-text{
        font-size:0.8em;
        margin-top:1em;
        color:gray;
        text-align:center;
    }

    .forget-pass{
        text-align:right;
    }

    .form-style{
        background-color: rgba(235, 237, 242, 0.6);
        border:none;
        border-radius:1em;
        height:2.5em;
    }

    .button-login{
        border-radius:2em;
        height:2.5em;
        font-size:1.2em;
    }
</style>

<spring:htmlEscape defaultHtmlEscape="true" />

<c:set var="hideDescription" value="checkout.login.loginAndCheckout" />

<div class="login-page__headline" >
    <div class="login-image">
	    <img src="https://inthebox.net/images/logo-inthebox-440x80.png" style="max-width: 300px">
    </div>
    <p class="login-headline-text">Masuk</p>
</div>

<c:if test="${actionNameKey ne hideDescription}">
	<p>
		<spring:theme code="" />
	</p>
</c:if>

<form:form action="${action}" method="post" modelAttribute="loginForm">
	<c:if test="${not empty message}">
		<span class="has-error"> <spring:theme code="${message}"/>
		</span>
	</c:if>
	
		<formElement:formInputBox idKey="j_username" labelKey="email"
			path="j_username" mandatory="true" inputCSS="form-style" />
		<formElement:formPasswordBox idKey="j_password"
			labelKey="login.password" path="j_password" inputCSS="form-control form-style"
			mandatory="true" />
	
			<div class="forgotten-password forget-pass">
				<ycommerce:testId code="login_forgotPassword_link">
					<a href="#" data-link="<c:url value='/login/pw/request'/>" class="js-password-forgotten" data-cbox-title="<spring:theme code="forgottenPwd.title"/>">
						<spring:theme code="login.link.forgottenPwd" />
					</a>
				</ycommerce:testId>
			</div>
		<ycommerce:testId code="loginAndCheckoutButton">
			<button type="submit" class="btn-primary btn-block button-login">
				<spring:theme code="${actionNameKey}" />
			</button>
		</ycommerce:testId>

	
	<c:if test="${expressCheckoutAllowed}">
		<button type="submit" class="btn btn-default btn-block expressCheckoutButton"><spring:theme code="text.expresscheckout.header" /></button>
		<input id="expressCheckoutCheckbox" name="expressCheckoutEnabled" type="checkbox" class="form left doExpressCheckout display-none" />
	</c:if>

</form:form>

