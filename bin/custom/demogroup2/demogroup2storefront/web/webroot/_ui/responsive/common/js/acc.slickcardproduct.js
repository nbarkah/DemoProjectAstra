$(document).ready(function(){
    $(".homepage-card-product").slick({
      infinite: true,
      speed: 300,
      slidesToShow: 3,
      responsive: [
                {
                  breakpoint: 768,
                  settings: {
                    slidesToShow: 2,
                  }
                },
                {
                  breakpoint: 480,
                  settings: {
                    slidesToShow: 1,
                  }
                }
          ]
    });
});

