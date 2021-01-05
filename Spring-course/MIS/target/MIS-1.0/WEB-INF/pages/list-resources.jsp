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
			<div class="col-sm-6">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>资源管理</h5>
					</div>
					<div class="ibox-content">
						<div class="zTreeDemoBackground left" style="font-size: 16px">
							<ul id="treeDemo" class="ztree"></ul>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>资源添加</h5>
					</div>
					<div class="ibox-content">
						<form class="form-horizontal">
							
							<div class="form-group">
								<label class="col-sm-4 control-label">菜单资源名称：</label>

								<div class="col-sm-7">
									<input type="email" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">父菜单：</label>

								<div class="col-sm-7">
									<select name="level" class="selectpicker form-control">
										<option>Mustard</option>
										<option>Ketchup</option>
										<option>Relish</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">菜单资源路径：</label>

								<div class="col-sm-7">
									<input type="email" class="form-control">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-4 control-label">备注：</label>
								<div class="col-sm-7">
									<textarea class="form-control"></textarea>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-8">
									<button class="btn btn-sm btn-white" type="submit">
										<i class="fa fa-save"></i> 保存
									</button>
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
	<script>
		$(document)
				.ready(
						function() {
							// 设置按钮的样式
							$('.selectpicker').selectpicker('setStyle',
									'btn-white').selectpicker('setStyle',
									'btn-sm');

							//点击删除
							$('.btndel').click(function() {
								swal({
									title : "您确定要改修该角色状态吗？",
									text : "改修后将将，请谨慎操作！",
									type : "warning",
									showCancelButton : true,
									confirmButtonColor : "#DD6B55",
									confirmButtonText : "删除",
									closeOnConfirm : false
								}, function() {//此函数是点击删除执行的函数
									//这里写ajax代码
									// 以下是成功的提示框，请在ajax回调函数中执行
									swal("删除成功！", "您已经永久删除了这条信息。", "success");
								});
							});

							$("#demo1")
									.click(
											function() {
												//基本消息框－留着备用
												swal({
													title : "欢迎使用SweetAlert",
													text : "Sweet Alert 是一个替代传统的 JavaScript Alert 的漂亮提示效果。"
												})
											});
						});
	</script>
	<SCRIPT type="text/javascript">
		var setting = {
			view : {
				addHoverDom : function(treeId, treeNode) {
					var aObj = $("#" + treeNode.tId + "_a"); 			
					if (treeNode.editNameFlag
							|| $("#btnGroup" + treeNode.tId).length > 0)
						return;
					var s = '<span id="btnGroup'+treeNode.tId+'">';
					if (treeNode.level == 1) {
						if (treeNode.children.length == 0) {
							s += '<span class="button remove" onclick="deleteNode('
									+ treeNode.id + ')"></span>';
						}
					} else if (treeNode.level == 2) {
						s += '<span class="button edit" onclick="editNode('
								+ treeNode.id + ')" ></span>';
						s += '<span class="button remove" onclick="deleteNode('
								+ treeNode.id + ')" ></span>';
					}
					s += '</span>';
					aObj.append(s);
				},
				removeHoverDom : function(treeId, treeNode) {
					$("#btnGroup" + treeNode.tId).remove();
				}
			}

		};
		var zNodes = [ {
			name : "pNode 01",
			open : true,
			children : [ {
				name : "pNode 11",
				children : [ {
					name : "leaf node 111"
				}, {
					name : "leaf node 112"
				}, {
					name : "leaf node 113"
				}, {
					name : "leaf node 114"
				} ]
			}, {
				name : "pNode 12",
				children : [ {
					name : "leaf node 121"
				}, {
					name : "leaf node 122"
				}, {
					name : "leaf node 123"
				}, {
					name : "leaf node 124"
				} ]
			}, {
				name : "pNode 13 - no child",
				isParent : true
			} ]
		}, {
			name : "pNode 02",
			children : [ {
				name : "pNode 21",
				open : true,
				children : [ {
					name : "leaf node 211"
				}, {
					name : "leaf node 212"
				}, {
					name : "leaf node 213"
				}, {
					name : "leaf node 214"
				} ]
			}, {
				name : "pNode 22",
				children : [ {
					name : "leaf node 221"
				}, {
					name : "leaf node 222"
				}, {
					name : "leaf node 223"
				}, {
					name : "leaf node 224"
				} ]
			}, {
				name : "pNode 23",
				children : [ {
					name : "leaf node 231"
				}, {
					name : "leaf node 232"
				}, {
					name : "leaf node 233"
				}, {
					name : "leaf node 234"
				} ]
			} ]
		}, {
			name : "pNode 3 - no child",
			isParent : true
		}

		];

		//编辑
		function editNode(id) {
			window.location.href="${pageContext.request.contextPath}/main/update-resources";
		}
		
		//删除
		function deleteNode(id) {
			swal({
				title : "您确定要改修该角色状态吗？",
				text : "改修后将将，请谨慎操作！",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "删除",
				closeOnConfirm : false
			}, function() {//此函数是点击删除执行的函数
				//这里写ajax代码
				// 以下是成功的提示框，请在ajax回调函数中执行
				swal("删除成功！", "您已经永久删除了这条信息。", "success");
			});
			//ajax请求台
			/* $.post("/crmpro/sources/remove", "id=" + id, function(data) {
				// 刷新数据
				var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
				treeObj.reAsyncChildNodes(null, "refresh");
			}, "text"); */
		}

		$(document).ready(function() {
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		});
	</SCRIPT>
</body>


</html>
