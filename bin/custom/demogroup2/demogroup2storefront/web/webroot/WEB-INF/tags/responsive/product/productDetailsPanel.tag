<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<div class="row" style="width:80%; justify-content:center;margin:0 auto;">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}"/>
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-6">
		<div class="product-main-info">
			<div class="row">
				<div>
                    <div class="product-details">
                        <h2 class="headline">${fn:escapeXml(product.baseProduct)}</h2>
                        <h3 class="sub-headline">${fn:escapeXml(product.name)}</h3>
                        <product:productPricePanel product="${product}" />
                        <h4 class="size-dimension">${fn:escapeXml(product.sizeDimension)}</h4>
						<h4 class="description" style="">${ycommerce:sanitizeHTML(product.description)}</h4>
					</div>
				</div>

				<div class="col-sm-12 col-md-12 col-lg-12">
					<cms:pageSlot position="AddToCart" var="component" element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div" class="yComponentWrapper page-details-add-to-cart-component"/>
					</cms:pageSlot>
				</div>



			</div>
		</div>
	</div>
</div>


<div class = "catalog-product">
    <div class="container" >
        <div class = "row">
            <c:forEach items="${upsellProduct}" var="product">
               <div class="catalog-product-block" >
                    <div class="product-details-image">
                        <a class="thumb" href="${fn:escapeXml(productUrl)}">
                            <product:productPrimaryImage product="${product}" format="product"/>
                        </a>
                    </div>
                        <h2 class="product-details-name" style = "width: 390px; margin-top : 2px ; font-size : 25px; margin-bottom : 0">
                            <ycommerce:testId code="product_productName">
                                <a class="name" href="${fn:escapeXml(productUrl)}" style = "color : black">
                                    <c:out escapeXml="false" value="${ycommerce:sanitizeHTML(product.name)}" />
                                </a>
                            </ycommerce:testId>
                        </h2>
                    <div class="product-details-size">
                        <h4 style = "width: 390px; margin-top : 2px ; margin-bottom : 0 ">
                           <ycommerce:testId code="product_productName">
                               <a class="name" href="${fn:escapeXml(productUrl)}">
                                   <c:out escapeXml="false" value="${ycommerce:sanitizeHTML(product.sizeDimension)}" />
                               </a>
                           </ycommerce:testId>
                        </h4>
                    </div>
                    <div class="product-details-size">
                        <h4 style = "width: 390px; margin-top : 2px ; margin-bottom : 0 ">
                            <ycommerce:testId code="product_productName">
                                <a class="name" href="${fn:escapeXml(productUrl)}">
                                    <c:out escapeXml="false" value="${ycommerce:sanitizeHTML(product.sizeType)}" />
                                </a>
                            </ycommerce:testId>
                        </h4>
                    </div>
                    <div class="product-details-price">
                        <h3 style = "width: 390px; margin-top : 2px ; margin-bottom : 0; font-size : 20px">
                        <ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
                            <product:productPricePanel product="${product}" />
                        </ycommerce:testId>
                        </h2>
                    </div>
               </div>
           </c:forEach>
        </div>
    </div>
</div>
