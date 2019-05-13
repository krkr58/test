jQuery(function(){
    $("h1").css("color","red");
    //$("p").fadeOut();
    $("h2").text("おやすみ")
    
    $("#aa,#bb").css("color","red");
    $("#aa,#bb").css("color","red");
    
    //$(".aa .bb").fadeOut();
    
});

$(function(){
    $("h1").click(function(){
        $("p").fadeOut();
    });
});

$(function(){
    $("div").click(function(){
        $("p").css("color","blue");
    });
});

$(function(){
    $(".total").click(function(){
        $("p").text("20");
    });
});

$(function(){
    $(".boxa").click(function(){
        $(".boxb").hide();
    });
});

$(function(){
    $("p").hover(
      function(){
          $("img").fadeIn();
      },
    function(){
        $("img").fadeOut();
    });
});

$(function(){
    $("img").hover(
      function(){
          $(this).animate({width:"220px"});
      },
    function(){
        $(this).animate({width:"200px"});
    });
});

$(function(){
    $("p").click(function(){
        $(this).css("color","red");
    });
});

$(function(){
    $("p").mouseover(function(){
        $(this).css("color","red");
    });
});