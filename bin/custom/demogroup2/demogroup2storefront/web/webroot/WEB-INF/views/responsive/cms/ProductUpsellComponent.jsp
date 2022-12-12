<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:forEach items="${upsellProducts}" var="product">
    <div>
        <c:url value="${product.url}" var="productUrl"/>
            <div class="carousel__item">
                <div >
                    <div class="carousel__item--thumb">
                        <product:productPrimaryImage  product="${product}" format="product"/>
                    </div>
                    <div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
                    <div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>
                    <a href="${productUrl}" class="carousel__item--btn">
                       Beli Sekarang
                    </a>
                </div>
            </div>
    </div>
</c:forEach>

