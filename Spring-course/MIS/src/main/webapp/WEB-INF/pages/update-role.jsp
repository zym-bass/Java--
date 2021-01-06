<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>办公系统 - 基础表格</title>
    <meta name="keywords" content="办公系统">
    <meta name="description" content="办公系统">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="${pageContext.request.contextPath}/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/plugins/select/bootstrap-select.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/plugins/zTreeStyle/zTreeStyle.css" />
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">

    <div class="row">
        <div >
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>编辑角色</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="roleForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色名称：</label>

                            <div class="col-sm-8">
                                <input type="hidden" name="roleid" id="roleid" value="${roleid}">
                                <input type="text" name="rolename" id="rolename" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色描述：</label>

                            <div class="col-sm-8">
                                <input type="text" name="roledis" id="roledis" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色权限：</label>

                            <div class="col-sm-8">
                                <ul id="treeDemo" class="ztree"></ul>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">是否启用：</label>
                            <div class="col-sm-8">
                                <input type="radio" name="status" value="0" id="opt1">禁用
                                <input type="radio" name="status" value="1" id="opt2">启用
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <input type="button" value="更新" onclick="updateRole();">
                                <button class="btn btn-sm btn-white" type="submit"><i class="fa fa-undo"></i> 重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>




<script src="${pageContext.request.contextPath}/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js?v=3.3.6"></script>
<script src="${pageContext.request.contextPath}/js/plugins/sweetalert/sweetalert.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/select/bootstrap-select.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/layer/laydate/laydate.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.core.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.exedit.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.excheck.js"></script>

<!-- 修复日期控件长度-->
<link href="${pageContext.request.contextPath}/css/customer.css" rel="stylesheet">
<script>

    $(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/role/getRoleById",
            type:"post",
            data:{"roleid":${roleid}},
            dataType:"json",
            cache:false,
            success:function(rs){
                //数据回显
                $("#rolename").val(rs.role.rolename);
                $("#roledis").val(rs.role.roledis);
                if(rs.role.status==0){
                    $("#opt1").attr("checked",true);
                }else{
                    $("#opt2").attr("checked",true);
                }
                var setting = {
                    async: {
                        enable:true,
                        url:"${pageContext.request.contextPath}/resources/getRootSources",
                    },
                    check: {
                        enable: true
                    },
                    callback:{
                        onAsyncSuccess: function zTreeOnAsyncSuccess(event, treeId, treeNode, msg) {
                            //获取我们的ztree对象
                            var var_zTree = $.fn.zTree.getZTreeObj("treeDemo");
                            $(rs.roleSourcesList).each(function(index,item){
                                //获取我们要进行勾选的节点
                                var node = var_zTree.getNodeByParam("id",item.resourcesFk,null);
                                if(node != null) {
                                    // checkNode(节点对象,是否否选这个节点 true勾选  false 取出勾选)
                                    var_zTree.checkNode(node,true);
                                    //如果有被勾选选项，我们就展开我们勾选的菜单
                                    var_zTree.selectNode(node); //打开选中节点的父节点
                                }
                            });

                        }
                    }
                };
                $.fn.zTree.init($("#treeDemo"), setting);
            }
        });
    });
    function updateRole(){

        // 刷新数据 获取树对象
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        //找到所有被选中的节点
        var nodes= treeObj.getCheckedNodes(true);
        if(nodes.length==0){
            swal("信息提示", "必须要给当角色分配资源！", "success");
        }else{
            var sourecesIds=new Array();
            //找到资源树被选中的资源
            for(var i=0;i<nodes.length;i++){
                sourecesIds.push(nodes[i].id);
            }
            var roleid=$("#roleid").val();
            var rolename=$("#rolename").val();
            var roledis=$("#roledis").val();
            var status=$("input[type=radio][name=status]:checked").val();
            //发送异步请求进行角色的保存
            $.ajax({
                url:"${pageContext.request.contextPath}/role/updateRole",
                type:"post",
                data:{"roleid":roleid,"rolename":rolename,"roledis":roledis,"status":status,"sourecesIds":sourecesIds},
                dataType:"json",
                cache:false,
                success:function(rs){
                    if(rs.status==200){
                        swal({
                            title : "信息提示",
                            text : rs.msg,
                        }, function() {
                            window.location="${pageContext.request.contextPath}/role/list-role";
                        });
                    }else if(rs.status==400){
                        swal("信息提示", rs.msg, "success");
                    }
                }
            });
        }
    }

</script>
</body>


</html>