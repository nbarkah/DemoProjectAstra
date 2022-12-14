$(document).ready(function(){
    $(".homepage-testimoni--slick").slick({

      infinite: true,
      speed: 300,
      slidesToShow: 3,
      responsive: [
              {
                breakpoint: 768,
                settings: {
                  arrows: false,
                  slidesToShow: 2,
                }
              },
              {
                breakpoint: 480,
                settings: {
                  arrows: false,
                  slidesToShow: 1,
                }
              }
        ]
    });
});

