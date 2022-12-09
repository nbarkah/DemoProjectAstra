<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/responsive/common/footer"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:if test="${component.visible}">
	<div class="container">
	    <div class="footer__top">
	        <div class="row">

	           <div class="footer__right col-xs-12 col-md-6">
	               <c:if test="${showLanguageCurrency}">
	                   <div class="row">
	                         <div class="logo-itb">
                                   <cms:pageSlot position="SiteLogo" var="feature">
                                       <cms:component component="${feature}" element="div" class="banner"/>
                                   </cms:pageSlot>
                               </div>
                               <div class="input-email">
									<input type="text" placeholder="Masukkan Alamat Email"/>
									<button>Tambah</button>
							   </div>
							   <div class="social-icon">
								  <a href="#a">  <svg class="ikon fesbuk" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M279.14 288l14.22-92.66h-88.91v-60.13c0-25.35 12.42-50.06 52.24-50.06h40.42V6.26S260.43 0 225.36 0c-73.22 0-121.08 44.38-121.08 124.72v70.62H22.89V288h81.39v224h100.17V288z"/></svg> </a>
								 <a href="#b">	<svg  class="ikon ige" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.7 102.7-9 132.1z"/></svg> </a>
								 <a href="#c">	<svg class="ikon amplop" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M48 64C21.5 64 0 85.5 0 112c0 15.1 7.1 29.3 19.2 38.4L236.8 313.6c11.4 8.5 27 8.5 38.4 0L492.8 150.4c12.1-9.1 19.2-23.3 19.2-38.4c0-26.5-21.5-48-48-48H48zM0 176V384c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V176L294.4 339.2c-22.8 17.1-54 17.1-76.8 0L0 176z"/></svg> </a>
								</div>
	                       <div class="col-xs-6 col-md-6 footer__dropdown">
	                           <footer:languageSelector languages="${languages}" currentLanguage="${currentLanguage}" />
	                       </div>
	                       <div class="col-xs-6 col-md-6 footer__dropdown">
	                           <footer:currencySelector currencies="${currencies}" currentCurrency="${currentCurrency}" />
	                       </div>
	                   </div>
	               </c:if>
	            </div>
	            <div class="footer__left col-xs-12 col-sm-12 col-md-6">
	                <div class="row">
	                	<c:forEach items="${component.navigationNode.children}" var="childLevel1">
		                	<c:forEach items="${childLevel1.children}" step="${component.wrapAfter}" varStatus="i">
							   <div class="footer__nav--container col-xs-12 col-sm-3">
		                	       <c:if test="${component.wrapAfter > i.index}">
	                                   <div class="title">${fn:escapeXml(childLevel1.title)}</div>
	                               </c:if>
	                               <ul class="footer__nav--links">
	                                   <c:forEach items="${childLevel1.children}" var="childLevel2" begin="${i.index}" end="${i.index + component.wrapAfter - 1}">
	                                        <c:forEach items="${childLevel2.entries}" var="childlink" >
		                                        <cms:component component="${childlink.item}" evaluateRestriction="true" element="li" class="footer__link"/>
	                                        </c:forEach>
	                                   </c:forEach>
	                               </ul>
	                		   </div>
						    </c:forEach>
	                	</c:forEach>
	               </div>
	           </div>

	        </div>
	    </div>
	</div>

	<div class="footer__bottom">
	    <div class="footer__copyright">
	        <div class="container foot-contact">
				<div class="contactc col-xs-12 col-sm-12 col-md-6">
					<div class="telepon">
						    <img src="${fn:escapeXml(commonResourcePath)}/images/footer-icon-call.png"/>
							<span>(021) 30306286</span>
					</div>
					<div class="handphone">
						<img src="${fn:escapeXml(commonResourcePath)}/images/footer-icon-message.png"/>
							<span>+62 819 234 659</span>
					</div>
				</div>
				<div class="copyright col-xs-12 col-md-6">
					<span>Copyright &copy; 2019-2022 PT Duta Mas Mandiri </span>
				</div>
			</div>

	    </div>
	</div>
</c:if>