<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<!-- Mirrored from www.gzsxt.cn/theme/hplus/table_basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:01 GMT -->
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>办公系统 - 基础表格</title>
    <meta name="keywords" content="办公系统">
    <meta name="description" content="办公系统">

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
    <div class="row">
        <div class="col-sm-5">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>添加部门</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">部门编号：</label>

                            <div class="col-sm-8">
                                <input type="email" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">部门名称：</label>

                            <div class="col-sm-8">
                                <input type="email" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">区域：</label>

                            <div class="col-sm-8">
                                <input type="email" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <button class="btn btn-sm btn-white" type="submit"><i class="fa fa-save"></i> 保存</button>
                                <button class="btn btn-sm btn-white" type="submit"><i class="fa fa-undo"></i> 重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-sm-7">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>部门列表</h5>
                </div>
                <div class="ibox-content">
                    <div class="row">
                        <div class="table-responsive">
                            <table id="deptTable" lay-filter="test"></table>
                            <script type="text/html" id="toolbarDemo">
                                <div class="layui-btn-container">
                                    <button class="layui-btn layui-btn-sm" lay-event="edit">编辑</button>
                                    <button class="layui-btn layui-btn-sm" lay-event="delete">删除</button>
                                </div>
                            </script>
                        </div>

                    </div>
                </div>
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
    function showDepts(){

        layui.use('table',function(){
            var table = layui.table;
            table.render({
                elem:"#deptTable",
                height:"400",
                url:"${pageContext.request.contextPath}/dept/getAllDepts",
                toolbar: '#toolbarDemo',
                even:true,
                loading:true,
                page:true,
                limits:[2,5,10,20],
                limit:5,
                cols:[[
                    {type: 'checkbox', fixed: 'left'},
                    {field: 'deptno', title: '编号', width:80, sort: true},
                    {field: 'dname', title: '部门名称', width:150},
                    {field: 'local', title: '区域', width:100}


                ]]
            });
            //头工具栏事件
            table.on('toolbar(test)', function(obj){
                var checkStatus = table.checkStatus(obj.config.id);
                switch(obj.event){
                    case 'edit':
                        var data = checkStatus.data;
                        if(data.length!=1){
                            swal("信息提示", "只能选择一条记录进行修改", "warning");
                        }else{
                            window.location="${pageContext.request.contextPath}/dept/update-dept?deptno="+data[0].deptno;
                        }
                        break;
                    case 'delete':
                        var data = checkStatus.data;
                        if(data.length<=0){
                            swal("信息提示", "至少选择一条记录进行删除", "warning");
                        }else{
                            var deptnos=new Array();
                            for(var i=0;i<data.length;i++){
                                deptnos.push(data[i].deptno);
                            }
                            $.ajax({
                                url:"${pageContext.request.contextPath}/dept/deleteDepts",
                                type:"post",
                                data:{"deptnos":deptnos},
                                dataType:"json",
                                cache:false,
                                success:function(rs){
                                    if(rs.status==200){
                                        showDepts();
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
    $(document).ready(function() {
        showDepts();
    });

</script>
</body>


</html>
    
