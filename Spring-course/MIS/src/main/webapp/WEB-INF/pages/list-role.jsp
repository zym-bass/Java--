<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

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
    <link href="${pageContext.request.contextPath}/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/plugins/select/bootstrap-select.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/plugins/zTreeStyle/zTreeStyle.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">

</head>

<body class="gray-bg">
<div class="wrapper2 wrapper-content2 animated fadeInRight">
    <div class="row">
        <div class="col-sm-5">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>添加角色</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="roleForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色名称：</label>

                            <div class="col-sm-8">
                                <input type="text" id="rolename" name="rolename" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色描述：</label>

                            <div class="col-sm-8">
                                <input type="text" id="roledis" name="roledis" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色权限：</label>

                            <div class="col-sm-8">
                                <ul id="treeDemo" class="ztree">
                                </ul>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">是否启用：</label>
                            <div class="col-sm-8">
                                <div class="switch">
                                    <input type="radio" name="status" value="1" checked="checked">启用
                                    <input type="radio" name="status" value="0">禁用

                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <input type="button" value="保存" onclick="saveRole();">
                                <button class="btn btn-sm btn-white" type="submit"><i class="fa fa-undo"></i> 重置
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-sm-7">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>角色列表 </h5>
                </div>
                <div class="ibox-content">

                    <div class="row">
                        <div class="table-responsive">
                            <table id="roleTable" lay-filter="test">

                            </table>
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
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.core.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.exedit.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.excheck.js"></script>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script type="text/html" id="barDemo">
<%--
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
--%>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
    function showRoles() {
        layui.use('table', function () {
            var table = layui.table;

            //第一个实例
            table.render({
                elem: '#roleTable'
                , height: 400
                , url: '${pageContext.request.contextPath}/role/getAllRoles' //数据接口
                , page: true //开启分页
                , limits: [3, 5, 10, 20, 40]
                , limit: 3
                , even: true
                , loading: true
                , cols: [[ //表头
                    {type: 'checkbox', fixed: 'left'},
                    {field: 'roleid', title: '编号', width: 80, sort: true, fixed: 'left'}
                    , {field: 'rolename', title: '角色名称', width: 140, fixed: 'left'}
                    , {field: 'roledis', title: '角色描述', width: 180}
                    , {
                        field: 'status', title: '状态', width: 80,
                        templet: function (data) {
                            if (data.status == 0) {
                                return "禁用";
                            } else if (data.status == 1) {
                                return "启用";
                            }
                        }
                    }
                    , {fixed: 'right', width: 165, align: 'center', toolbar: '#barDemo'}
                ]]
            });
            //监听行工具事件
            table.on('tool(test)', function (obj) { //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
                var data = obj.data //获得当前行数据
                    , layEvent = obj.event; //获得 lay-event 对应的值
                if (layEvent === 'del') {
                    swal({
                        title : "您确定要删除该角色状态吗？",
                        text : "请谨慎操作！",
                        type : "warning",
                        showCancelButton : true,
                        confirmButtonColor : "#DD6B55",
                        confirmButtonText : "删除",
                        closeOnConfirm : false
                    }, function() {
                        $.ajax({
                            url:"${pageContext.request.contextPath}/role/deleteRole",
                            type:"post",
                            data:{"roleid":data.roleid},
                            dataType:"json",
                            cache:false,
                            success:function(rs){
                                if (rs.status==200){
                                    swal("删除成功！", "您已经永久删除了这条信息。", "success");
                                    $.fn.zTree.init($("#treeDemo"), setting);
                                    showRoles();
                                }else if(rs.status==400){
                                    swal("删除失败！", "您没有删除了这条信息。", "failing");
                                }
                            }
                        });
                    });
                } else if (layEvent === 'edit') {
                    window.location.href="${pageContext.request.contextPath}/role/update-role?roleid="+data.roleid;
                }
            });
        });

    };

    var setting = {
        async: {
            enable: true,
            url: "${pageContext.request.contextPath}/resources/getRootSources",
        },
        check: {
            enable: true
        }
    };
    $(document).ready(function () {
        //初始化资源树
        $.fn.zTree.init($("#treeDemo"), setting);
        showRoles();
    });

    //保存Role
    function saveRole() {
        //获取出对象
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        //找到所有被选中的节点
        var nodes = treeObj.getCheckedNodes(true);
        if (nodes.length == 0) {
            swal("信息提示", "必须给当前角色分配资源", "warning");
        } else {
            var sourcesIds = new Array();
            //找到资源数被选中的资源
            for (var i = 0; i < nodes.length; i++) {
                sourcesIds.push(nodes[i].id);
            }
            var rolename = $("#rolename").val();
            var roledis = $("#roledis").val();
            var status = $("input[type=radio][name=status]:checked").val();
            alert(sourcesIds);
            //发送异步请求
            $.ajax({
                url: "${pageContext.request.contextPath}/role/addRole",
                type: "post",
                data: {"rolename": rolename, "roledis": roledis, "status": status, "sourcesIds": sourcesIds},
                dataType: "json",
                cache: false,
                success: function (rs) {
                    if (rs.status == 200) {
                        swal({
                            title: "信息提示",
                            text: rs.msg,
                        }, function () {
                            $("#roleForm")[0].reset();
                            $.fn.zTree.init($("#treeDemo"), setting);
                            showRoles();
                        });
                    } else if (rs.status == 400) {
                        swal("添加失败！", "您没有添加成这条信息。", "failing");
                    }
                }
            });

        }
    }

    /*$(document).ready(function() {
        // 设置按钮的样式
        $('.selectpicker').selectpicker('setStyle', 'btn-white').selectpicker('setStyle', 'btn-sm');

        //点击删除
        $('.btndel').click(function () {
            swal({
                title: "您确定要改修该角色状态吗？",
                text: "改修后将将，请谨慎操作！",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "删除",
                closeOnConfirm: false
            }, function () {//此函数是点击删除执行的函数
                    //这里写ajax代码
                    // 以下是成功的提示框，请在ajax回调函数中执行
                swal("删除成功！", "您已经永久删除了这条信息。", "success");
            });
        });

    });*/
</script>

</body>


</html>
    
