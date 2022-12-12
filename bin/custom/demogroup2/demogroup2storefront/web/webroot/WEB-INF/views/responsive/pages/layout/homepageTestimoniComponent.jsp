 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
 <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




 <div class="container-testimoni-homepage">
        <div class="text-center" style="margin:20px 0;">
            <h1 class="testi-headline">TESTIMONI</h1>
            <h4 class="testi-subheadline">
                Banyak pembeli yang merasa puas dengan kualitas kasur INTHEBOX </br>
                Kami menerima beragam komentar positif dari pembeli di seluruh Indonesia, bahkan dari kalangan artis. Bukan hanya pengalaman membeli kasur sping bed atau kasur busa, banyak juga yang merasa puas dengan produk INTHEBOX lainnya yang terdiri dari bantal, guling, dan sofa bed.
            </h4>
        </div>
        <div class="star-reviews">
            <c:set var="star" value="4"/>
            <c:set var="half" value="1"/>
            <c:forEach var="i" begin ="1" end ="${star}">
                 <img src="https://inthebox.net/images/star-full.png" data-src="https://inthebox.net/images/star-full.png" class="star-homepage" alt="Star">
             </c:forEach>
            <c:choose>
                 <c:when test="${half == 1}"> <img src="https://inthebox.net/images/star-half.png" data-src="https://inthebox.net/images/star-half.png" class="star-homepage" alt="Star"></c:when>
            </c:choose>
            <h5 class="text-reviews"> 4.95/5 (268 Reviews) </h5>
        </div>


                <div class="main-content">
                    <div class="row homepage-testimoni--slick">
                        <c:forEach var="person" items="${personList}" begin="1" end="6">
                            <div class="main-testi col-md-4" >
                                <div class="testi-container" style="background-color:#fff;">
                                    <div class="card-testi-head">
                                        <p class="testi-person--name">${person.personName}</p>
                                        <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                                    </div>
                                    <div class="bintang" style="display:flex;">

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
                                                 <img src="https://inthebox.net/images/star-full.png" data-src="https://inthebox.net/images/star-full.png" class=" star-homepage" alt="Star">
                                             </c:forEach>
                                          <c:choose>
                                              <c:when test="${half == 1}"> <img src="https://inthebox.net/images/star-half.png" data-src="https://inthebox.net/images/star-half.png" class="star-homepage" alt="Star"></c:when>
                                          </c:choose>
                                </div>
                                    <c:forEach var="testimoni" items="${person.testi}">
                                    <h5 class="testi-homepage-head-msg" >${testimoni.headMsg}</h5>
                                    <h5 class="testi-msg-homepage" style=" ">
                                        ${testimoni.message} </h5>
                                    <h5 class="testi-date-homepage">${testimoni.date}</h5>
                                    </c:forEach>
                                </div>
                            </div>

                        </c:forEach>
                        </div>
                          <div class="next-page-homepage">
                              <a href="testimony" class="btn-testi-homepage">
                                  Lihat Semua Testimoni
                              </a>
                           </div>
                    </div>
