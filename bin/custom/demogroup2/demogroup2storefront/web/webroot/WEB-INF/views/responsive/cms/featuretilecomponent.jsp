<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<div class="text-center">
   <img src=${images.url} title="${title}" alt="${title}" style="width:100%;margin:0 auto;"/>
   <h4 class="tile-title" ><c:out escapeXml="false" value="${ycommerce:sanitizeHTML(title)}" /></h4>
   <h5 class="tile-desc"><c:out escapeXml="false" value="${ycommerce:sanitizeHTML(description)}" /></h5>
</div>