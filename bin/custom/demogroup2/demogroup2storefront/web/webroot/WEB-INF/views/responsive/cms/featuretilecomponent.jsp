<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<div class="tile-container">
   <img src=${images.url} title="${title}" alt="${title}" />
   <div class="tile-title" ><c:out escapeXml="false" value="${ycommerce:sanitizeHTML(title)}" /></div>
   <p><c:out escapeXml="false" value="${ycommerce:sanitizeHTML(description)}" /></p>
</div>