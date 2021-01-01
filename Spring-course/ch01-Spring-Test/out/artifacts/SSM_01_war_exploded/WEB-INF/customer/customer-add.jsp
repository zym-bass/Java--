<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>添加客户信息</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/skin/css/base.css">
	<script src="${pageContext.request.contextPath}/skin/js/jquery-3.4.1.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/skin/js/theAlert.css">
	<script src="${pageContext.request.contextPath}/skin/js/theAlert.js"></script>
	<script>
		function saveCustomer(){
			$.ajax({
				url:"${pageContext.request.contextPath}/cus/addCustomers",
				type:"post",
				data:$("#customerForm").serialize(),
				dataType:"json",
				cache:false,
				success:function(rs){
					if(rs.status==200){
						theAlert("添加成功，是否继添加？","confirm",function(bol){
							if(bol){
								$("#customerForm")[0].reset();
							}else{
								window.location="${pageContext.request.contextPath}/cus/customer";
							}
						});
					}else if(rs.status==400){
						theAlert(rs.msg,"alert");
					}
				}
			});
		}
	</script>
</head>
<body leftmargin="8" topmargin="8" background='${pageContext.request.contextPath}/skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
	<tr>
		<td height="26" background="${pageContext.request.contextPath}/skin/images/newlinebg3.gif">
			<table width="58%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td >
						当前位置:客户信息管理>>添加客户信息
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>

<form id="customerForm">

	<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
		<tr bgcolor="#E7E7E7">
			<td height="24" colspan="2" background="${pageContext.request.contextPath}/skin/images/tbg.gif">&nbsp;添加客户&nbsp;</td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">公司名称：</td>
			<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<input name="comname"/></td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">公司联系人：</td>
			<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<input name="companyperson"/></td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">公司地址：</td>
			<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<input size="60" name="comaddress"/></td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">联系电话：</td>
			<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<input name="comphone"/></td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">座机：</td>
			<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<input name="camera"/></td>
		</tr>
		<tr >
			<td align="right" bgcolor="#FAFAF1" height="22">公司简介：</td>
			<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
				<textarea rows=15 cols=130 name="present"></textarea></td>
		</tr>

		<tr >
			<td align="right" bgcolor="#FAFAF1" >备注：</td>
			<td colspan=3 align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" >
				<textarea rows=10 cols=130 name="remark"></textarea>
			</td>
		</tr>


		<tr bgcolor="#FAFAF1">
			<td height="28" colspan=4 align=center>
				&nbsp;
				<a href="javascript:saveCustomer();" class="coolbg">保存</a>
				<a href="customer.jsp" class="coolbg">返回</a>
			</td>
		</tr>
	</table>

</form>


</body>
</html>