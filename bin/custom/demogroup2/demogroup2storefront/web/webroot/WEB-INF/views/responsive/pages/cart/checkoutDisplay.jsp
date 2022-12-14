<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />
<script src="https://cdn.tailwindcss.com"></script>
<c:url value="/cart/checkout" var="checkoutUrl" scope="session"/>

<div class="cart__actions  ">
    <div class="row justify-center">
        <div class="col-sm-4 col-md-3 pull-right">
            <button data-continue-shopping-url="${fn:escapeXml(continueShoppingUrl)}" class="js-continue-shopping-button w-full relative inline-flex items-center justify-center p-0.5 overflow-hidden text-2xl font-medium text-gray-900 rounded-lg group bg-gradient-to-br from-[#7fc5f9] to-[#7fc5f9] group-hover:from-[#7fc5f9] group-hover:to-[#7fc5f9] hover:text-white dark:text-white focus:ring-4 focus:outline-none focus:ring-[#7fc5f9] dark:focus:ring-[#7fc5f9]">
              <span class="w-full relative px-5 py-4 transition-all ease-in duration-75 bg-white dark:bg-gray-900 rounded-md group-hover:bg-opacity-0">
                  <spring:theme code="cart.page.continue"/>
              </span>
            </button>
        </div>

        <sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')">
            <c:if test="${not empty siteQuoteEnabled and siteQuoteEnabled eq 'true'}">
                <div class="col-sm-4 col-md-3 col-md-offset-3 pull-right">
                    <button class="btn btn-default btn-block btn--continue-shopping js-continue-shopping-button"    data-continue-shopping-url="${fn:escapeXml(createQuoteUrl)}">
                        <spring:theme code="quote.create"/>
                    </button>
                </div>
            </c:if>
        </sec:authorize>

        <div class="col-sm-4 col-md-3 pull-right">
            <ycommerce:testId code="checkoutButton">
                <button data-checkout-url="${fn:escapeXml(checkoutUrl)}" class="js-continue-checkout-button w-full text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300 dark:focus:ring-cyan-800 font-medium rounded-lg text-2xl px-5 py-[1.1rem] text-center">
                    <spring:theme code="checkout.checkout"/>
                </button>
            </ycommerce:testId>
        </div>
    </div>
</div>