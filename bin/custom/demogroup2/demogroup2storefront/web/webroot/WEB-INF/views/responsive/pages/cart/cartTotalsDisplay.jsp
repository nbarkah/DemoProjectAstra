<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Verified that there's a pre-existing bug regarding the setting of showTax; created issue  --%>
<div class="row justify-center">
    <div class="col-xs-12 col-sm-10 col-md-7 col-lg-6">
        <label for="message"
               class="block mb-2 text-lg font-medium text-gray-900 dark:text-white">
               <strong><spring:theme code="text.expresscheckout.title"/></strong>
        </label>
        <textarea id="message" rows="4"
                  class="block p-2.5 w-full text-xl text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                  placeholder="<spring:theme code="text.expresscheckout.placeholder"/>"></textarea>
    </div>
</div>
<div class="row justify-center">
    <div class="col-xs-12 col-md-7 col-lg-6">
        <div class="cart-totals">
            <cart:cartTotals cartData="${cartData}" showTax="false"/>
        </div>
    </div>
</div>