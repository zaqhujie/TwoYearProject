$(function(){
    $("#username").blur(function () { //失去焦点
        var namestr = $(this).val();
        var regstr = /^[0-9A-Za-z]{4,10}$/;
        if (!regstr.test(namestr)) {
            $("#tips").val("用户名必须在4-10之间").css("color", "red");
            return false;
        }
        return true;
    })

    $("#username").focus(function () { //获得焦点
      $("#tips").val("");
    })
})

