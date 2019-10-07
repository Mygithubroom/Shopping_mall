$(function () {
    $("#form_2").show()
    $("#form_2>div").css("margin-top","30px");
    $("#main_body").css("margin-bottom","-120px")
    $("#main_body").css("margin-top","10px")
    $("#myForm").validate({
        errorPlacement:'span',
        errorPlacement: function(error, element){
            error.appendTo(element.parent());
            error.addClass("red");
        },
        rules:{
            truename:{
                required:true,
                regex:/^\w+$/,
            },
            IDcard:{
                required:true,
                minlength:1,
                maxlength:18
            },
            sex:{
                required:true
            }
        },
        messages:{
            truename:{
                required:"不允许为空",
                regex:"请输入正确的名字",
            },
            IDcard:{
                required:"不允许为空",
                minlength:"格式需正确,身份证18位"
            },
            sex:{
                required:"请选择"
            }
        },
        submitHandler:function(form){
            $.ajax({
                url:"/certificate",
                dataType:"text",
                type:"post",
                data:{"name":$("input[name='truename']").val(),"idcard":$("input[name='idcard']").val(),
                    "sex":$("input[type=radio][name='sex']:checked").val()},
                success:function () {
                    // form.submit();
                    $("#main_form").hide()
                    $("#end").show()
                    $("#congratulation").append("恭喜"+$("input[name='truename']").val()+"，完成实名认证！")
                },
                err:function () {
                    alert("验证失败，请确认信息正确性！")
                }
            })
        }
    })
})