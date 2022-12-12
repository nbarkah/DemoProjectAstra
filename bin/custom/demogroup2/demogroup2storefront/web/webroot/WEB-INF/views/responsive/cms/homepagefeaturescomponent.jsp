<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<div class="container-unboxing-homepage">
   <h1 class="unboxing-title text-center">
        <c:out escapeXml="false" value="${title}" />
   </h1>
   <div class="unboxing-tile-homepage homepage-unboxing-itb">
       <c:if test="${not empty features}">
            <c:forEach items="${features}" var="feature">
                <cms:component component="${feature}" element="div" />
            </c:forEach>
      </c:if>
  </div>
</div>