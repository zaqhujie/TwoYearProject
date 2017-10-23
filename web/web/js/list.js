$(function(){
    $("#btn").click(function(){
        var userName = $("#text").val().trim();
        if (userName == '') {
            alert("搜索框不能为空呐");
            return false;
        }
        $.ajax({
            type:"get",
            url:"AdminajaxQueryAdmin.action",
            data:"aid="+$("#text").val(),
            dataType:"json",
            success:function(data){
                $("#tbl tr:gt(1)").remove();
                $(".aid").html(data.a.aid);
                $(".ausername").html(data.a.ausername);
                $(".apassword").html(data.a.apassword);
            }
        })
    })
})