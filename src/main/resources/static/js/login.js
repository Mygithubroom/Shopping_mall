$(function () {
    //警告提示和取消
    $("input[name='loginname']").click(function () {
        $(this).css("border","1px solid #bdbdbd");
        $(".c_lable").eq(0).css("border-right","1px solid #bdbdbd")

    })
    $("input[name='loginpw']").click(function () {
        $(this).css("border","1px solid #bdbdbd");
        $(".c_lable").eq(1).css("border-right","1px solid #bdbdbd")

    })
    $(".loginbutton").click(function () {
        if(($("input[name='loginname']").val()=='')&&($("input[name='loginpw']").val()=='')){
            $(".msg-error").show();
            $(".c_lable").css("border-right","1px solid #c81623");
            $("input[name='loginname']").css("border","1px solid #c81623");
            $("input[name='loginpw']").css("border","1px solid #c81623");
            vm.msgerror="密码和账户名为空"
        }else if($("input[name='loginname']").val()==''){
            $(".msg-error").show();
            $(".c_lable").eq(0).css("border-right","1px solid #c81623");
            $("input[name='loginname']").css("border","1px solid #c81623");
            vm.msgerror="账户名为空"
        }else if($("input[name='loginpw']").val()==''){
            $(".msg-error").show();
            $(".c_lable").eq(1).css("border-right","1px solid #c81623")
            $("input[name='loginpw']").css("border","1px solid #c81623");
            vm.msgerror="密码为空"
        }else {
            $.ajax({
                url:"http://localhost:8080/jdlogin",
                data:{account:$("input[name='loginname']").val(),password:$("input[name='loginpw']").val()},
                dataType:"json",
                type:"post",
                success:function (data) {
                    if(data){
                        location.href="http://localhost:8080/index.html";

                    }else {
                        $(".msg-error").show();
                        vm.msgerror="账号或密码错误";
                        $("input[name='loginpw']").val('');
                    }
                }
            })
        }
    })
    var vm =new Vue({
        el:".msg-error",
        data:{
            msgerror:"请输入密码和账户名"
        }
    })
})
//登录方式切换
$(function () {
    $(".c_loginw").click(function () {
        $(".c_wh").show();
        $(".c_wr").hide();
    })
    $("#c_loginw").click(function () {
        $(".c_wh").hide();
        $(".c_wr").show();
    })
    $(".www").click(function () {
        $(this).animate({right:"40px"},1000);
    })
})