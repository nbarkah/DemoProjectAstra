 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
 <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <template:page pageTitle="${pageTitle}">
 <script src="https://cdn.tailwindcss.com"></script>
      <!-- banner image -->
             <div class="w-full flex justify-center -mt-8">
                     <div class="xl:w-[100em]">
                        <img class="w-full" src="https://inthebox.net/images/layout-v2/about-header.png">
                     </div>
             </div>

             <!-- container about -->
             <div class="w-full text-center p-10 xl:p-16 space-y-5 flex justify-center " style="background-color: #6086c2 ;">
                 <div class="xl:w-1/2 xl:space-y-5">
                        <h1 class="text-2xl md:text-3xl xl:text-5xl font-semibold text-white">Tentang INTHEBOX</h1>
                        <p class="text-white text-md md:text-2xl md:px-20 xl:text-3xl">INTHEBOX adalah merek kasur berkualitas dan perlengkapan tidur dengan material premium. Produk
                                             lainnya terdiri dari bantal, guling, dan sofa bed. Semua pilihan produk menggunakan material berkualitas.</p>
                 </div>
             </div>


             <!-- container-info -->
             <div class="w-full p-8 space-y-10 md:p-12 lg:p-16 xl:px-96 xl:py-32 xl:space-y-32" style="background-color: #7fc5f9 ;">
                 <div class="w-full space-y-5 flex flex-col md:flex-row-reverse">
                     <div class="w-full h-96 xl:h-[28em] bg-cover" style=" background-image: url('https://inthebox.net/images/layout-v2/about-what-image.png');" >
                     </div>
                     <div class="w-full space-y-5 xl:space-y-28 md:pr-10 xl:pr-32">
                         <h1 class="text-2xl font-semibold xl:text-5xl">Apa Itu Kasur INTHEBOX?</h1>
                         <p class="text-md xl:text-3xl">Kasur INTHEBOX adalah spring bed yang dikemas dalam box dan akan langsung mengembang sempurna ketika dibuka. Kini sudah ada banyak pilihan produk dengan harga yang terjangkau. Ketahui lebih lanjut agar kamu bisa memiliki tidur yang berkualitas.</p>
                         <div>
                            <a href="aboutUsDetailIntheboxPage">
                               <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                            </a>
                         </div>
                     </div>
                 </div>
                 <div class="w-full space-y-5 flex flex-col md:flex-row">
                     <div class="w-full h-96 xl:h-[28em] bg-cover" style=" background-image: url('https://inthebox.net/images/layout-v2/about-image-2.png');" >
                     </div>
                     <div class="w-full space-y-5 xl:space-y-28 md:pr-10 xl:pl-32">
                          <h1 class="text-2xl font-semibold xl:text-5xl">Kenapa Harus Pilih INTHEBOX?</h1>
                          <p class="text-md xl:text-3xl">Ada banyak kelebihan kasur INTHEBOX, khususnya bisa meningkatkan kualitas tidur dan istirahat kamu. Semua produk INTHEBOX dibuat dengan material premium, teknologi modern, dan desain yang elegan. Bisa dapat bantal gratis, free ongkir, dan garansi 10 tahun.</p>
                          <div>
                              <a href="aboutUsWhyIntheboxPage">
                                  <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                              </a>
                          </div>
                     </div>
                 </div>
                  <div class="w-full space-y-5 flex flex-col md:flex-row-reverse">
                                      <div class="w-full h-96 xl:h-[28em] bg-cover" style=" background-image: url('https://inthebox.net/images/layout-v2/about-image-3.png');" >
                                      </div>
                                      <div class="w-full space-y-5 xl:space-y-28 md:pr-10 xl:pr-32">
                                          <h1 class="text-2xl font-semibold xl:text-5xl">Cara Beli Kasur INTHEBOX</h1>
                                          <p class="text-md xl:text-3xl">Bisa dibeli melalui website dengan cara cek daftar produk, masukkan ke keranjang, dan lakukan pembayaran. Mau lebih praktis? Segera WhatsApp ke 0819234659. Bisa juga dibeli online di marketplace kesayangan kamu atau langsung ke supermarket besar di kotamu.</p>
                                          <div>
                                                                        <a href="aboutUsBuyIntheboxPage">
                                                                            <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                                                                        </a>
                                                                    </div>
                                      </div>
                                  </div>
             </div>


             <div class="w-full text-center space-y-4 xl:space-y-10 py-5 xl:py-20">
                 <h1 class="text-xl font-semibold md:text-2xl xl:text-5xl">
                     Pertanyaan yang Sering Ditanyakan
                 </h1>
                 <p class="md:text-lg xl:text-3xl">+ Apakah INTHEBOX Hanya Menjual Spring Bed?</p>
                 <p class="md:text-lg xl:text-3xl" >+ Berapa Harga Kasur INTHEBOX?</p>
                 <p class="md:text-lg xl:text-3xl">+ Bagaimana Cara Beli di Website?</p>
                 <p class="md:text-lg xl:text-3xl">+ Bagaimana Cara Dapat Garansi Kasur?</p>

             </div>
</template:page>