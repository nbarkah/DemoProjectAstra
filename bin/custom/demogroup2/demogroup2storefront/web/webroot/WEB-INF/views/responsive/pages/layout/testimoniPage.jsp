 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
 <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
 <template:page pageTitle="${pageTitle}">

 <div class="container testii">

        <div class="heading">
            <div class="headertesti text-center">
            <div class="headertesti text-center">
                <h1>TESTIMONI PEMBELI INTHEBOX</h1>
                <p>Banyak pembeli yang merasa puas dengan kualitas kasur INTHEBOX</p>
            </div>
            <div class="head-msg">
                <p>Kami menerima beragam komentar positif dari pembeli di seluruh Indonesia, bahkan dari kalangan artis. Bukan hanya pengalaman membeli kasur sping bed atau kasur busa, banyak juga yang merasa puas dengan produk INTHEBOX lainnya yang terdiri dari bantal, guling, dan sofa bed.<br/><br/>
                Kami selalu berinovasi menghadirkan beragam jenis kasur dan produk penunjang istirahat lainnya. Kami paham bahwa istirahat yang cukup dan tidur berkualitas adalah hal yang penting. Oleh karena itu, kami selalu menggunakan material berkualitas premium, namun kamu bisa memilikinya dengan harga terjangkau.
                </p>
            </div>
        </div>
                <div class="main-content">
                    <div class="row">
                        <c:forEach var="person" items="${testiData}">
                            <div class="main-testi col-md-4">
                                <div class="testi-container">
                                    <div class="head-testi">
                                        <p class="nama">${person.personName}</p>
                                        <img src="${fn:escapeXml(commonResourcePath)}/images/avatar.png" class="avatar"/>
                                    </div>
                                    <div class="bintang">

                                        <c:set var="star" value="0"/>
                                        <c:set var="half" value="0"/>
                                        <c:choose>
                                           <c:when test ="${person.rating == 'BINTANGLIMA'}"> <c:set var="star" value="5"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGEMPAT'}"> <c:set var="star" value="4"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGTIGA'}"> <c:set var="star" value="3"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGDUA'}"> <c:set var="star" value="2"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGSATU'}"> <c:set var="star" value="1"/> </c:when>

                                           <c:when test ="${person.rating == 'BINTANGEMPATSTG'}"> <c:set var="star" value="4"/> <c:set var="half" value="1"/></c:when>
                                           <c:when test ="${person.rating == 'BINTANGTIGASTG'}"> <c:set var="star" value="3"/><c:set var="half" value="1"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGDUASTG'}"> <c:set var="star" value="2"/><c:set var="half" value="1"/> </c:when>
                                           <c:when test ="${person.rating == 'BINTANGSATUSTG'}"> <c:set var="star" value="1"/> <c:set var="half" value="1"/></c:when>
                                         </c:choose>
                                             <c:forEach var="i" begin ="1" end ="${star}">
                                            <img src="${fn:escapeXml(commonResourcePath)}/images/star-full.png" class="star"/>
                                         </c:forEach>
                                          <c:choose>
                                              <c:when test="${half == 1}">  <img src="${fn:escapeXml(commonResourcePath)}/images/star-half.png" class="star"/>   </c:when>
                                          </c:choose>
                                </div>
                                    <c:forEach var="testimoni" items="${person.testi}">
                                    <p class="testi-bold">${testimoni.headMsg}</p>
                                    <p class="testi-msg">
                                        ${testimoni.message} </p>
                                    <p class="testi-date">${testimoni.date}</p>
                                    </c:forEach>
                                </div>
                            </div>

                        </c:forEach>
                        </div>
                          <div class="next-page">
                             <c:set var="page" value="${number}"/>
                             <c:set var="maxPage" value="${max}"/>
                                 <c:if test="${page > 1}">
                                      <a href="?page=${page-1}">
                                      <button>
                                          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M41.4 233.4c-12.5 12.5-12.5 32.8 0 45.3l192 192c12.5 12.5 32.8 12.5 45.3 0s12.5-32.8 0-45.3L109.3 256 278.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0l-192 192z"/></svg>    Halaman Sebelumnya
                                      </button>
                                      </a>
                                 </c:if>
                              <c:if test="${page < maxPage }">
                                <a href="?page=${page+1}">
                                  <button>
                                      Halaman Berikutnya <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M342.6 233.4c12.5 12.5 12.5 32.8 0 45.3l-192 192c-12.5 12.5-32.8 12.5-45.3 0s-12.5-32.8 0-45.3L274.7 256 105.4 86.6c-12.5-12.5-12.5-32.8 0-45.3s32.8-12.5 45.3 0l192 192z"/></svg>
                                  </button>
                                     </a>
                              </c:if>

                           </div>
                    </div>
                    </div>
                    </div>
</template:page>