
$(function () {
    // $("#form_1").hide();
    // $("#form_2").show();
    // $("#end").show();
    var flag=1;
    $("#form_2>div").css("margin-top","30px");
    //validate
    $("#myForm").validate({
        errorPlacement:'span',
        errorPlacement: function(error, element){
            error.appendTo(element.parent());
            error.addClass("red");
        },
        rules:{
            phone:{
                required: true,
                regex: /^1\d{10}$/,
                maxlength:11
            },
            username:{
                required: true,
                minlength:2,
                maxlength:6,
                // checkUsername:true
            },
            password:{
                regex: /^[A-z]+\w+$/,
                required: true,
                minlength:7,
                maxlength:16,

            },
            passcheck:{
                required: true,
                equalTo: "#password"
            },
            phonecheck:{
                required: true
            },
            agree:{
                required: true
            }
        },
        messages:{
            phone:{
                required: "请输入内容",
                regex: "手机号码为11位数字"
            },
            username:{
                required: " ",
                minlength:"最小两位",
                maxlength:"最大6位",
                // checkUsername:"该用户名已被注册"
            },
            password:{
                regex: "密码以字母为首，以任意字母和数字组成",
                required: " ",
                minlength:"最小7位",
                maxlength:"最大16位",

            },
            passcheck:{
                required: " ",
                equalTo: "两次密码不同"
            },
            phonecheck:{
                required: " "
            },
            agree:{
                required:""
            }
        },
        submitHandler:function(form){
            $.ajax({
                url:"/register",
                dataType:"text",
                type:"post",
                data:{"phoneNum":$("input[name='phone']").val(),"username":$("input[name='username']").val(),
                    "password":$("input[name='password']").val()},
                success:function () {
                    // form.submit();
                    $("#main_head").hide()
                    $("#main_form").hide()
                    $("#end").show()
                    $("#main_body").css("margin-bottom","-150px")
                    $("#congratulation").append("恭喜"+$("input[name='username']").val()+"，注册成功")
                },
                err:function () {
                    alert("注册失败，请确认信息正确性！")
                }
            })
        }
    });
    $.validator.addMethod("checkUsername",function(value,element){
        var flag=true;
        $.ajax({
            url:"/sameUsername",
            dataType:"text",
            type:"post",
            data:{"username":$("input[name='username']").val()},
            success:function (data) {
                temp=data;
                if(temp>=1){
                    flag=false;
                }
                else{
                    flag=true;
                }
            }
        })
        return flag;
    });

    //function
    $("input[name='phone']").click(function (){
        $(this).val("")
    });
    $("input[name='phone']").focus(function (){
        $("#main_form #phonec").show()
    });
    $("input[name='phone']").blur(function (){
        $("#main_form #phonec").hide()
    });
    $("input[name='username']").blur(function (){
        $.ajax({
            url:"/sameUsername",
            dataType:"text",
            type:"post",
            data:{"username":$("input[name='username']").val()},
            success:function (data) {
                var temp=data;
                if(temp>=1){
                    var errserr=$("input[name='username']").parent().children().eq(2)
                    errserr.remove()
                    $("input[name='username']").parent().append("<span>该用户名已被注册</span>")
                    var err=$("input[name='username']").parent().children().eq(2)
                    err.addClass("red")
                }
            }
        })
    });
    $("input[name='username']").focus(function (){
        var err=$("input[name='username']").parent().children().eq(2)
        err.remove()
    });
    $("button[id='checkphone']").click(function (){
        var num=$(".choose1").children().length;
        var t1=$(".choose1").children().eq(2).text();
        if(num>2 && t1!=""){
            alert("请确认格式正确")
        }
        else{
            $.ajax({
                url:"/samePhone",
                dataType:"text",
                type:"post",
                // async:false,
                // contentType:"application/json;charset-UTF-8",
                data:{"phoneNum":$("input[name='phone']").val()},
                success:function (data) {
                    flag=data;
                    if(flag>=1){
                        alert("该手机号已被注册")
                    }
                    else{
                        alert("验证成功！")
                    }
                }
            })
        }
    });

    $("button[id=toSecond]").click(function () {
        if(flag==0){
            $("#form_1").hide()
            $("#form_2").show()
            var temp=$(".head_block").children().eq(0)
            temp.removeClass("num")
            temp.next().next().removeClass("numspan")
            var temp2=temp.parent().parent().children().eq(2).children().eq(0)
            temp2.addClass("num")
            temp2.next().next().addClass("numspan")
        }
    })
    // $("button[id=toEnd]").focus(function (){
    //     $("#main_head").hide()
    //     $("#main_form").hide()
    //     $("#end").show()
    //     $("#main_body").css("margin-bottom","-150px")
    // })
});