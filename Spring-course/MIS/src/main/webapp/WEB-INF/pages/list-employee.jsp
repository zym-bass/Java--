<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- Mirrored from www.gzsxt.cn/theme/hplus/table_basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:01 GMT -->
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>绿地中央广场综合物业办公系统 - 基础表格</title>
    <meta name="keywords" content="综合办公系统">
    <meta name="description" content="综合办公系统">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="${pageContext.request.contextPath}/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/plugins/select/bootstrap-select.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css" />


</head>

<body class="gray-bg">
<div class="wrapper2 wrapper-content2 animated fadeInRight">
    <div class="ibox float-e-margins">
        <div class="ibox-content">
            <div class="row">
                <div class="col-sm-3 col-sm-offset-2 text-right">
                    <h3><small>搜索条件:</small></h3>
                </div>
                <div class="col-sm-2">
                    <select class="form-control" id="selectType">
                        <option value="0">选择类型</option>
                        <option value="1">员工姓名</option>
                        <option value="2">角色名称</option>
                    </select>
                </div>

                <div class="col-sm-3">
                    <div class="input-group">
                        <input type="text" placeholder="请输入关键词" id="keyword" name="keyword" class="input-sm form-control">
                        <span class="input-group-btn">
                                        <button type="button" class="btn btn-sm btn-primary" onclick="searchEmployee();"><i class="fa fa-search"></i>搜索</button>
                                    </span>
                    </div>
                </div>

            </div>

            <div class="table-responsive">
                <table id="empTable" lay-filter="test"></table>
                <script type="text/html" id="toolbarDemo">
                    <div class="layui-btn-container">
                        <button class="layui-btn layui-btn-sm" lay-event="save">添加</button>
                        <button class="layui-btn layui-btn-sm" lay-event="edit">编辑</button>
                        <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
                    </div>
                </script>
            </div>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${pageContext.request.contextPath}/js/plugins/select/bootstrap-select.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/sweetalert/sweetalert.min.js"></script>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script>
    //格式化日期格式
    function get_date(data){

        var date=new Date(data);
        var year=date.getFullYear();
        var month=formatDate(date.getMonth()+1);
        var day=formatDate(date.getDate());
        return year+"-"+month+"-"+day;
    }
    function formatDate(s){
        if(s<10){
            return "0"+s;
        }
        return s;
    }
    $(document).ready(function() {
        // 设置按钮的样式
        $('.selectpicker').selectpicker('setStyle', 'btn-white').selectpicker('setStyle', 'btn-sm');
        showEmployees();
    });
    function showEmployees(selectType,keyword){
        layui.use('table',function(){
            var table = layui.table;
            table.render({
                elem:"#empTable",
                height:"510",
                url:"${pageContext.request.contextPath}/emp/getEmployees?selectType="+selectType+"&keyword="+keyword,
                toolbar: '#toolbarDemo',
                even:true,
                loading:true,
                page:true,
                limits:[2,5,10,20],
                limit:5,
                cols:[[
                    {type: 'checkbox', fixed: 'left'},
                    {field: 'eid', title: '编号', width:80},
                    {field: 'ename', title: '姓名', width:100},
                    {field: 'esex', title: '性别', width:80},
                    {field: 'eage', title: '年龄', width:80},
                    {field: 'telephone', title: '联系方式', width:100},
                    {field: 'hiredate', title: '入职日期', width:120,
                        templet:function(data){
                            return get_date(data.hiredate);
                        }
                    },
                    {field: 'pnum', title: '身份证', width:170},
                    {field: 'username', title: '用户名', width:120},
                    {field: 'roleName', title: '角色', width:100},
                    {field: 'deptName', title: '部门', width:80}
                ]]
            });
            //头工具栏事件
            table.on('toolbar(test)', function(obj){
                var checkStatus = table.checkStatus(obj.config.id);
                switch(obj.event){
                    case 'save':
                        window.location="${pageContext.request.contextPath}/emp/save-employee";
                        break;
                    case 'edit':
                        var data = checkStatus.data;
                        if(data.length!=1){
                            swal("信息提示", "只能选择一条记录进行修改", "warning");
                        }else{
                            window.location="${pageContext.request.contextPath}/emp/update-employee?eid="+data[0].eid;
                        }
                        break;
                    case 'delete':
                        var data = checkStatus.data;
                        if(data.length<=0){
                            swal("信息提示", "至少选择一条记录进行删除", "warning");
                        }else{
                            var eids=new Array();
                            for(var i=0;i<data.length;i++){
                                eids.push(data[i].eid);
                            }
                            $.ajax({
                                url:"${pageContext.request.contextPath}/dept/deleteDepts",
                                type:"post",
                                data:{"eids":eids},
                                dataType:"json",
                                cache:false,
                                success:function(rs){
                                    if(rs.status==200){
                                        showEmployees();
                                    }else {
                                        swal("信息提示", rs.msg, "error");
                                    }
                                }
                            });
                        }
                        break;
                };
            });
        });
    }

    function searchEmployee(){
        var selectType=$("#selectType option:selected").val();
        var keyword=$("#keyword").val();
        showEmployees(selectType,keyword);
    }
</script>

</body>


</html>
