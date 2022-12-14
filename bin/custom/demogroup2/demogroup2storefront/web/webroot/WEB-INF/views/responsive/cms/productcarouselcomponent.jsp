<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<spring:htmlEscape defaultHtmlEscape="true" />

<c:choose>
	<c:when test="${not empty productData}">
		<div class="carousel__component">
			<div class="carousel__component--headline">
			    BELI <span style="color:#d4effc"> KASUR </span> INTHEBOX
			</div>
			<h4 class="carousel__component--subtitle">
			    Tersedia beragam jenis kasur INTHEBOX dengan kualitas premium. </br>
			    Pilih spring bed berkualitas dengan ukuran kasur sesuai kebutuhan.
			</h4>

			<c:choose>
				<c:when test="${component.popup}">
					<div class="carousel__component--carousel homepage-card-product ">
						<div id="quickViewTitle" class="quickView-header display-none">
							<div class="headline">
								<span class="headline-text"><spring:theme code="popup.quick.view.select"/></span>
							</div>
						</div>
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}/quickView" var="productQuickViewUrl"/>
							<div class="carousel__item">
								<div href="${productQuickViewUrl}" class="js-reference-item">
									<div class="carousel__item--thumb">
										<product:productPrimaryReferenceImage product="${product}" format="product"/>
									</div>
									<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
                                    <div >${fn:escapeXml(product.description)}</div>
									<div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>
                                    <a href="${productUrl}" class="carousel__item--btn">
                                       Beli Sekarang
                                    </a>
								</div>
							</div>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="carousel__component--carousel homepage-card-product">
						<c:forEach items="${productData}" var="product">
                            <div>
                                <c:url value="${product.url}" var="productUrl"/>
                                    <div class="carousel__item">
                                        <div >
                                            <div class="carousel__item--thumb">
                                                <product:productPrimaryImage  product="${product}" format="product"/>
                                            </div>
                                            <div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
                                            <div >${fn:escapeXml(product.description)}</div>
                                            <div class="carousel__item--price"><format:fromPrice priceData="${product.price}"/></div>
                                            <a href="${productUrl}" class="carousel__item--btn">
                                               Beli Sekarang
                                            </a>
                                        </div>
                                    </div>
                            </div>
						</c:forEach>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</c:when>

	<c:otherwise>
		<component:emptyComponent/>
	</c:otherwise>
</c:choose>

