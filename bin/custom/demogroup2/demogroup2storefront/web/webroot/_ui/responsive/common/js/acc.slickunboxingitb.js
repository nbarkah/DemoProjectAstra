$(document).ready(function(){
    $(".homepage-unboxing-itb").slick({
      infinite: true,
      speed: 300,
      slidesToShow: 4,
      responsive: [
          {
            breakpoint: 768,
            settings: {
              slidesToShow: 3,
            }
          },
          {
            breakpoint: 480,
            settings: {
              slidesToShow: 2,
            }
          }
    ]});
});

