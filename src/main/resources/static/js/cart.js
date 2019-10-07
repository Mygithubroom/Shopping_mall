$(function () {
    var num=0;//选中商品的数量
    var arr = new Array();
    var vm = new Vue({
        el:".container",
        data:{
            checkAll:false,   //计入全选框的状态
            produces:[
                // {
                //     cartPicUrl:"//img10.360buyimg.com/cms/s80x80_jfs/t1/40413/35/11402/113375/5d288967Eb59dceee/58d5467b1d899591.jpg",
                //     productName:"手机",
                //     cartPicDesc:"蓝水翡翠",
                //     price:"2000",
                //     productCount:2
                //
                // },
                // {
                //     cartPicUrl:"images/cartpic/goods8.jpg",
                //     productName:"电脑",
                //     cartPicDesc:"蓝水翡翠",
                //     price:"1000",
                //     productCount:1
                // },
                // {
                //     cartPicUrl:"images/cartpic/goods8.jpg",
                //     productName:"电脑",
                //     cartPicDesc:"蓝水翡翠",
                //     price:"1000",
                //     productCount:1
                // },
                // {
                //     cartPicUrl:"images/cartpic/goods8.jpg",
                //     productName:"电脑",
                //     cartPicDesc:"蓝水翡翠",
                //     price:"3000",
                //     productCount:1
                // }
            ]
        },
        methods:{
            //全选按钮
            selectAll(){
                //forEach() 遍历数组 将所有的
                this.produces.forEach((produces)=>{
                    produces.isSelected = this.checkAll; //将 数组内数据的 所有复选框的状态 定义成全选框状态
            })
            },

            //判断是否全选
            selectSelected(){
                //every() 遍历数组方法 如果数组每一项指定数据都为true 则返回true
                this.checkAll = this.produces.every((produces)=>{
                    return produces.isSelected;
                });
            },

            //点击加减按钮
            changeMoney:function(produces,way){
                if(way>0){
                    produces.productCount++;
                }else{
                    if(produces.productCount>1){
                        produces.productCount--;
                    }
                }
            },

            //删除商品的方法
            del:function (index) {
                this.produces.splice(index,1);
            },
            //判断当前商品是否被选中，选中是添加到数据上传到数据库中，
            // （将选中的商品添加进数据库，）
            get:function(produce,index){
                /*选中当前*/
                if(typeof produce.checked=='undefined'){
                    this.$set(produce,'checked',true);
                }else{
                    produce.checked=!produce.checked;
                }
                if (produce.checked==false){
                    arr.shift(index,1);
                }else{
                    arr.push(vm.produces[index]);
                }
            },

            //购物车中商品的总数
            parductNum:function () {
                return this.produces.length;
            },
        },

        //computed 存计算属性
        computed: {
            //合计
            summary(){
                //reduce() //数组求和方法   (pre,next) pre表示总和 next表示数组下标
                return this.produces.reduce((pre,next)=>{
                    return pre + (next.isSelected? next.productInfoList[0].price*next.productCount : 0)
                },0)  //0 表示pre初始为0
            },
            //选中的商品数量
            selectedNum(){
                return this.produces.reduce((num,next)=>{
                    return num = (next.isSelected? num+1 : num)
                },0)  //0 表示pre初始为0
            }
        },
    });
    //获取商品信息
    $.ajax({
        url:"/getAllCart",
        dataType:"json",
        type:"post",
        success:function (data) {
            // console.log(data);
            vm.produces=data;
            // console.log(vm.produces);
        }
    });

    //向后台发送商品信息生成订单
    $("#sub").click(function () {
        if (arr.length>0) {
        $.ajax({
            url:"/insetLoginId",
            dataType:"text",
            type:"post",
            data:JSON.stringify(arr),
            contentType:"application/json;charset=utf-8",
            success:function (orderId) {
                window.open("http://127.0.0.1:8080//jiesuan.html");
                sessionStorage.setItem("orderId",orderId);
            }
        })
        }else{
            alert("你未选择商品");
        }
    })
});