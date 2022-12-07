 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
 <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


 <template:page pageTitle="${pageTitle}">

 <div class="container-md">


        <div class="test">
             <p>tess</p>
                    <c:set var="count" value="1"/>
                         <c:set var="count" value="1"/>
                         <c:forEach var="person" items="${personList}">
                         <span>${count}</span>
                         <p>${person.personName}</p>
                           <div class="bintang">
                             <c:set var="star" value="0"/>
                              <c:choose>
                                 <c:when test ="${person.rating == 'BINTANGLIMA'}"> <c:set var="star" value="5"/> </c:when>
                                 <c:when test ="${person.rating == 'BINTANGEMPAT'}"> <c:set var="star" value="4"/> </c:when>
                                 <c:when test ="${person.rating == 'BINTANGTIGA'}"> <c:set var="star" value="3"/> </c:when>
                                 <c:when test ="${person.rating == 'BINTANGDUA'}"> <c:set var="star" value="2"/> </c:when>
                                 <c:when test ="${person.rating == 'BINTANGSATU'}"> <c:set var="star" value="1"/> </c:when>
                               </c:choose>

                                    <c:forEach var="i" begin ="1" end ="${star}">
                                         <p>hehe</p>
                                      </c:forEach>
                                  </div>

                  </c:forEach>
        </div>





        <div class="heading">
            <div class="header text-center">
                <h1>TESTIMONI PEMBELI INTHEBOX</h1>
                <p>Banyak pembeli yang merasa puas dengan kualitas kasur INTHEBOX</p>
            </div>
            <div class="head-msg">
                <p>Kami menerima beragam komentar positif dari pembeli di seluruh Indonesia, bahkan dari kalangan artis. Bukan hanya pengalaman membeli kasur sping bed atau kasur busa, banyak juga yang merasa puas dengan produk INTHEBOX lainnya yang terdiri dari bantal, guling, dan sofa bed.</p>
                <p>Kami selalu berinovasi menghadirkan beragam jenis kasur dan produk penunjang istirahat lainnya. Kami paham bahwa istirahat yang cukup dan tidur berkualitas adalah hal yang penting. Oleh karena itu, kami selalu menggunakan material berkualitas premium, namun kamu bisa memilikinya dengan harga terjangkau.
                </p>
            </div>
        </div>
        <div class="main-content">
            <div class="row">
                <div class="main-testi col-md-4">
                    <div class="testi-container1">
                        <div class="head-testi">
                            <p class="nama">Baim Wong</p>
                            <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                        </div>
                        <div class="bintang">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                           <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                        </div>
                        <p class="testi-bold">Mantap Banget</p>
                        <p class="testi-msg">
                            Kasur baru yang packing nya simple banget, masuk ke dalam box! Kasur @inthebox.id dengan teknologi Pocket Springbed ini enak banget, nyaman dan empuk! Ada Free Bantal dan Free Ongkirnya juga lhoo! Mantap banget
                        </p>
                        <p class="testi-date">9 Sep 2020 - 6:22 pm</p>
                    </div>
                </div>
                <div class="main-testi col-md-4">
                    <div class="testi-container1">
                        <div class="head-testi">
                            <p class="nama">Raffi Ahmad</p>
                            <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                        </div>
                        <div class="bintang">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                        </div>
                        <p class="testi-bold">Pilih kasur INTHEBOX aja!</p>
                        <p class="testi-msg">
                            Pokoknya kalau mau beli spring bed yang bagus, materialnya berkualitas, nyaman, dan harganya murah, langsung pilih kasur INTHEBOX aja. Apalagi INTHEBOX+ ini nih bagus banget. Selama gue pakai kasur INTHEBOX di rumah itu bikin tidur jadi nyenyak, pas bangun langsung segar badannya.
                        </p>
                        <p class="testi-date">10 Aug 2020 - 11:41 pm</p>
                    </div>
                </div>
                <div class="main-testi col-md-4">
                    <div class="testi-container1">
                        <div class="head-testi">
                            <p class="nama">Melaney Ricardo</p>
                            <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                        </div>
                        <div class="bintang">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                            <img src="https://inthebox.net/images/star-full.png"
                            class="star" alt="Star">
                        </div>
                        <p class="testi-bold">Terima kasih Inthebox!</p>
                        <p class="testi-msg">
                            Produk memuaskaan sekalii.. dan seru waktu unboxing ya :-D Nyaman sekalii. Pas dapet harga ﬂash sale lagi. Mantap banget sihh klo ini Semoga aweet ya. Trimakasih Inthebox. Trimakasih Tokopedia
                        </p>
                        <p class="testi-date">8 Jun 2020 - 8:00 pm</p>
                    </div>
                </div>
            </div>
                <div class="row">
                    <div class="main-testi col-md-4">
                        <div class="testi-container2">
                            <div class="head-testi">
                                <p class="nama">novika stefani</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">worth the quality, worth the price</p>
                            <p class="testi-msg">
                                awalnya bingung mau beli spring bed keq gimana blm lagi masalah harga kan, tkt beli yang murah tapi cepet rusak, tkt dpt barang jelek, akhirnya keinget sama iklan kasur yang datang nya in the box, akhirnya carilah di shopee eehh nemu donk, harganya juga ok bgt plus yang penting itu free ongkir, proses nya cepet and ga pake lama, tgl 1 pesen, tgl 5 uda sampe dengan aman. langsung deh bongkar, ga pake ribet loohh beb, eh gt digunting plastik nya, instantly ngembang donk, awal dibuka paling baru ngembang halfnya ajah, but after 60 minute ngembang full and bener - bener empuk donk busa nya, pegasnya mantul, gt dicoba bener - bener beda sama spring bed merk lain. ga nyesel beli nya and recommended banget deh. dari pada beli yang ga jelas better langsung aja beli in the box.
                            </p>
                            <p class="testi-date">6 Mar 2019 - 11:37 am</p>
                        </div>
                    </div>
                    <div class="main-testi col-md-4">
                        <div class="testi-container2">
                            <div class="head-testi">
                                <p class="nama">Ramhatullah Rahmatullah</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">Mantap Banget</p>
                            <p class="testi-msg">
                                Sangat senang dan unik, pengalaman beli kasur pertama kali langsung penasaran kepada in.the.box. Kemudian saya cari2 info produk, rata2 memuaskan. Beli dapet harga promo 1.349k (160x180) dan gratis ongkir. Sangat memuaskan dan unik saat unboxing. :D
                            </p>
                            <p class="testi-date">23 Nov 2018 - 11:02 am</p>
                        </div>
                    </div>
                    <div class="main-testi col-md-4">
                        <div class="testi-container2">
                            <div class="head-testi">
                                <p class="nama">Diana Veronica</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">Love in the box</p>
                            <p class="testi-msg">
                                Awalny sempet ragu , ternyata pas brg dtg plastiknya dibuka.. Langsung ngembang keren bgt
                            </p>
                            <p class="testi-date">9 Sep 2020 - 6:22 pm</p>
                        </div>
                    </div>
                </div>
            </div>
                <div class="row">
                    <div class="main-testi col-md-4">
                        <div class="testi-container3">
                            <div class="head-testi">
                                <p class="nama">Andika R</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">Mantap!!</p>
                            <p class="testi-msg">
                                Kasur dan bantalnya empuk...Dan sejauh ini hanya in.the.box yang menyediakan kasur dengan teknologi pocket spring dengan harga yang sangat terjangkau.
                            </p>
                            <p class="testi-date">7 Oct 2018 - 12:34 pm</p>
                        </div>
                    </div>
                    <div class="main-testi col-md-4">
                        <div class="testi-container3">
                            <div class="head-testi">
                                <p class="nama">rinaldo fitra</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">Matras lembut, bantal empuk</p>
                            <p class="testi-msg">
                                matras busa, empuk lembut, enak dipakai tidur, tapi jangan duduk karena langsung terbenam. di dalam matrasnya ada per jadi ada support sehingga ketika dipakai tidur tidak terbenam dan sebelah bergerak gerak kita tidak terganggu. saya beli king size, ternyata beratnya minta ampun, perlu 2 org untuk menggotong boxnya. Dapat 2 bantal empuk sebagai bonus, dan gratis ongkos kirim. Sejauh ini puas dengan kualitas dan harganya. Ini bukan Kasur busa biasa .. top deh
                            </p>
                            <p class="testi-date">27 Sep 2018 - 1:28 pm</p>
                        </div>
                    </div>
                    <div class="main-testi col-md-4">
                        <div class="testi-container3">
                            <div class="head-testi">
                                <p class="nama">Yunni Hikmah</p>
                                <img src="https://inthebox.net/images/review-avatar.png" data-src="https://inthebox.net/images/review-avatar.png" class="avatar" alt="Avatar">
                            </div>
                            <div class="bintang">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                                <img src="https://inthebox.net/images/star-full.png"
                                class="star" alt="Star">
                            </div>
                            <p class="testi-bold">Ga pake ribet</p>
                            <p class="testi-msg">
                                Bingung cari matras yang nyaman....pas nemu bedinthebox...langsung pesan...praktis, cepat sampai, gratis ongkir....ga pakai ribet....
                            </p>
                            <p class="testi-date">24 Aug 2018 - 4:46 pm</p>
                        </div>
                    </div>
                </div>
                <div class="next-page">
                    <button>
                        Halaman Berikutnya <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M342.6 233.4c12.5 12.5 12.5 32.8 0 45.3l-192 192c-12.5 12.5-32.8 12.5-45.3 0s-12.5-32.8 0-45.3L274.7 256 105.4 86.6c-12.5-12.5-12.5-32.8 0-45.3s32.8-12.5 45.3 0l192 192z"/></svg>
                    </button>
                </div>
        </div>
</template:page>