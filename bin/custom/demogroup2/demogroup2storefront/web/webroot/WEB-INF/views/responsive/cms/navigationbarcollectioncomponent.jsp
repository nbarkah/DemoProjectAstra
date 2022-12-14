<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<c:if test="${component.visible}">
	<nav class="navigation navigation--bottom js_navigation--bottom js-enquire-offcanvas-navigation" role="navigation">
        <ul class="sticky-nav-top hidden-lg hidden-md js-sticky-user-group hidden-md hidden-lg">
                <%--Dynamically generated by 'acc.navigation.js"--%>
        </ul>

       <div class="navigation__overflow">
           <ul data-trigger="#signedInUserOptionsToggle" class="nav__links nav__links--products nav__links--mobile js-userAccount-Links js-nav-collapse-body offcanvasGroup1 collapse in hidden-md hidden-lg">
                   <%--Dynamically generated by 'acc.navigation.js"--%>
           </ul>
           <ul class="nav__links nav__links--products js-offcanvas-links">
               <c:forEach items="${components}" var="component">
                   <c:if test="${component.navigationNode.visible}">
                       <cms:component component="${component}" evaluateRestriction="true" class="nav__links--primary" element="li"
                                      navigationType="offcanvas" />
                   </c:if>
               </c:forEach>
           </ul>
       </div>
	</nav>
</c:if>
