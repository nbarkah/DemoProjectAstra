 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
 <%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <template:page pageTitle="${pageTitle}">
 <script src="https://cdn.tailwindcss.com"></script>
     <div class="w-full flex flex-col justify-center">
        <div class="space-y-10">
            <h1 class="text-center font-bold text-3xl xl:text-6xl">Cara Beli Kasur INTHEBOX</h1>
            <img class="mx-auto"  src="https://inthebox.net/images/layout-v2/about-what-image.png">
        </div>
        <div class="flex justify-center">
                    <div class="w-[90em] text-justify space-y-4 xl:space-y-8 mt-10 px-10">
                                <p class="text-2xl xl:text-4xl">INTHEBOX bisa dibeli melalui website dengan cara cek daftar produk, masukkan ke keranjang, dan lakukan pembayaran. Mau lebih praktis? Segera WhatsApp ke 0819234659. Bisa juga dibeli online di marketplace kesayangan kamu atau langsung ke supermarket besar di kotamu.</p>
                                <p class="text-2xl xl:text-4xl font-semibold">Cara Beli Melalui Website atau Situs Resmi :</p>
                                <ul class="list-disc px-10 xl:px-20 space-y-4">
                                    <li class="text-2xl xl:text-4xl">
                                        Login atau masuk ke situs INTHEBOX (buat akun jika belum punya dan isi data diri lengkap).</p>
                                    </li>
                                    <li class="text-2xl xl:text-4xl">Cek halaman Produk dan pilih jenis kasur yang disukai atau dibutuhkan.</li>
                                    <li class="text-2xl xl:text-4xl">Masukkan produk ke dalam keranjang pembelian.</li>
                                    <li class="text-2xl xl:text-4xl">Cek ulang produk (jenis, ukuran, harga).</li>
                                    <li class="text-2xl xl:text-4xl">Cek ulang detail pengiriman (nama penerima dan alamat) an lakukan pembayaran.</li>
                                    <li class="text-2xl xl:text-4xl">Lakukan konfirmasi pembayaran agar pesanan segera dirposes.</li>
                                    <li class="text-2xl xl:text-4xl">Tunggu pesanan diterima</li>
                                    <li class="text-2xl xl:text-4xl">Segera lakukan aktivasi garansi ketika produk sudah diterima.</li>
                                </ul>

                                <p class="text-2xl xl:text-4xl font-semibold">Cara Beli Melalui WhatsApp:</p>
                                <ul class="list-disc px-10 xl:px-20 space-y-4">
                                    <li class="text-2xl xl:text-4xl">Pastikan sudah tahu mau beli jenis kasur apa, ukuran, dan sudah lihat harganya.</li>
                                    <li class="text-2xl xl:text-4xl">Kirim chat ke admin INTHEBOX melalui WhatsApp 0819234659.</li>
                                    <li class="text-2xl xl:text-4xl">Lakukan pemesanan</li>
                                    <li class="text-2xl xl:text-4xl">Segera lakukan pembayaran sesuai dengan pesanan kamu.</li>
                                    <li class="text-2xl xl:text-4xl">Tunggu hingga pesanan dari INTHEBOX sampai di rumah.</li>
                                    <li class="text-2xl xl:text-4xl">Segera lakukan aktivasi garansi melalui website INTHEBOX</li>
                                </ul>

                                 <p class="text-2xl xl:text-4xl font-semibold">Cara Beli Melalui Marketplace :</p>
                                 <ul class="list-disc px-10 xl:px-20 space-y-4">
                                    <li class="text-2xl xl:text-4xl">Buka marketplace kesayangan kamu (Shopee, Bibli, Tokopedia, JD.ID, dll)</li>
                                    <li class="text-2xl xl:text-4xl">Cari toko resmi atau official store INTHEBOX yang ada di marketplace.</li>
                                    <li class="text-2xl xl:text-4xl">Cari dan piih produk INTHEBOX di marketplace.</li>
                                    <li class="text-2xl xl:text-4xl">Masukkan ke keranjang dan segera lakukan pembayaran.</li>
                                    <li class="text-2xl xl:text-4xl">Tunggu pesanan kamu sampai di rumah.</li>
                                    <li class="text-2xl xl:text-4xl">Segera lakukan aktivasi garansi melalui website INTHEBOX.</li>
                                 </ul>


                                <p class="text-2xl xl:text-4xl">Selain bisa beli kasur online, kamu yang masih penasaran juga bisa beli langsung di supermarket besar, seperti di LotteMart Cek daftar toko offline INTHEBOX di kotamu!</p>
                                <div class="w-full flex xl:flex-row flex-col justify-between xl:space-x-6 xl:space-y-0 space-y-12">
                                    <div class="xl:w-1/3 space-y-8 flex flex-col justify-center">
                                        <img src="https://inthebox.net/images/layout-v2/about-image-3.png">
                                        <h1 class="text-3xl xl:text-4xl font-semibold text-center">Apa Itu Kasur INTHEBOX?</h1>
                                        <div class="flex justify-center">
                                           <div>
                                                                         <a href="aboutUsDetailIntheboxPage">
                                                                             <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                                                                         </a>
                                                                     </div>
                                        </div>
                                    </div>
                                    <div class="xl:w-1/3 space-y-8 flex flex-col justify-center">
                                         <img src="https://inthebox.net/images/layout-v2/about-image-2.png">
                                         <h1 class="text-3xl xl:text-4xl font-semibold text-center">Kenapa Harus Pilih INTHEBOX?</h1>
                                         <div class="flex justify-center">
                                             <div>
                                                                           <a href="aboutUsWhyIntheboxPage">
                                                                               <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                                                                           </a>
                                                                       </div>
                                         </div>
                                    </div>
                                    <div class="xl:w-1/3 space-y-8 flex flex-col justify-center">
                                         <img src="https://inthebox.net/images/layout-v2/about-image-0.png">
                                         <h1 class="text-3xl xl:text-4xl font-semibold text-center">Tentang INTHEBOX</h1>
                                         <div class="flex justify-center">
                                            <div>
                                                                          <a href="aboutUsPage">
                                                                              <button class="p-2 xl:p-5 xl:px-10 px-5 rounded-full bg-blue-400 text-white hover:bg-white font-semibold hover:text-blue-500 xl:text-2xl">Selengkapnya</button>
                                                                          </a>
                                                                      </div>
                                         </div>
                                    </div>
                                </div>
                            <div>
                </div>
     </div>

</template:page>