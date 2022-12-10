$(document).ready(function(){
    $(".homepage-unboxing-itb").slick({
      infinite: true,
      speed: 300,
      slidesToShow: 4,
      responsive: [
          {
            breakpoint: 900,
            settings: {
              slidesToShow: 2,
              slidesToScroll: 2
            }
          },
          {
            breakpoint: 480,
            settings: {
              slidesToShow: 1,
              slidesToScroll: 1
            }
          }
    ]});
});

