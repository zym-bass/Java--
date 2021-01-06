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
<link href="${pageContext.request.contextPath}/css/plugins/select/bootstrap-select.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/plugins/zTreeStyle/zTreeStyle.css" />


</head>

<body class="gray-bg">
	<div class="wrapper2 wrapper-content2 animated fadeInRight">
		<div class="row">
			
			<div class="col-sm">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>资源添加</h5>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal" id="sourcesForm">
							<input id="id" name="id" value="${id}" style = "display:none"  >
							<div class="form-group">
								<label class="col-sm-4 control-label">菜单资源名称：</label>

								<div class="col-sm-3">
									<input type="text" id="name"  name="name" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">父菜单：</label>
								<div class="col-sm-3">
									<select name="pid" id="pid" >
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">菜单资源路径：</label>

								<div class="col-sm-3">
									<input type="text" id="url" name="url" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">备注：</label>
								<div class="col-sm-3">
									<textarea class="form-control" id="remark" name="remark"></textarea>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-4">
									<input type="button" value="保存" onclick="updateSources();">
									<button class="btn btn-sm btn-white" type="submit">
										<i class="fa fa-undo"></i> 重置
									</button>
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
	<script src="${pageContext.request.contextPath}/js/plugins/select/bootstrap-select.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/plugins/sweetalert/sweetalert.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.core.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.exedit.js"></script>
	<script src="${pageContext.request.contextPath}/js/plugins/ztree/jquery.ztree.excheck.js"></script>

	<script>
		function updateSources(){
			$.ajax({
				url:"${pageContext.request.contextPath}/resources/updateSource",
				type:"post",
				data:$("#sourcesForm").serialize(),
				dataType:"json",
				cache:false,
				success:function(rs){
					if(rs.status==200){
						swal({
							title : "信息提示",
							text : rs.msg,
						}, function() {
							window.location="${pageContext.request.contextPath}/resources/list-resources";
						});
					}else if(rs.status==400){
						swal("信息提示", rs.msg, "success");
					}
				}
			});
		};

		$(function(){
			$.ajax({
				url:"${pageContext.request.contextPath}/resources/getParentNodeById",
				data:{"id":${id}},
				dataType:"json",
				cache:false,
				success:function (result) {
					//回显数据
					$("#name").val(result.name);
					$("#url").val(result.url);
					$("#remark").val(result.remark);
					$.ajax({
						url:"${pageContext.request.contextPath}/resources/getParentNodes",
						type:"post",
						dataType:"json",
						cache:false,
						success:function(rs){
							var option="";
							$.each(rs,function(index,element){

								if(result.pid==element.id){
									option="<option value='"+element.id+"' selected>"+element.name+"</option>";
								}else{
									option="<option value='"+element.id+"'>"+element.name+"</option>";
								}
								$("#pid").append(option);
							});
						}
					});
				}
			});
		});
	</script>
	
</body>


</html>
