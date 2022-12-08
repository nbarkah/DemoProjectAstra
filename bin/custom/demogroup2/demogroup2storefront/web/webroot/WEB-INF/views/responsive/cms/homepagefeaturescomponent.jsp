<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="homepage-container">
   <div class="title-container">
        <c:out escapeXml="false" value="${title}" />
   </div>
   <c:if test="${not empty features}" >
        <c:forEach items="${features}" var="feature">
            <cms:component component="${feature}" element="div" />
        </c:forEach>
   </c:if>
</div>