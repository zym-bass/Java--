<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title>Home</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content=""
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	
	<link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
	<link rel="stylesheet" href="css/loginstyle.css" type="text/css" media="all" />
	<link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
</head>

<body>
	<!-- bg effect -->
	<div id="bg">
		<canvas></canvas>
		<canvas></canvas>
		<canvas></canvas>
	</div>
	
	<!-- content -->
	<div class="sub-main-w3">
		<form action="index.jsp" method="post">
			<h2>欢迎登录项目管理系统
				<i class="fa fa-level-down"></i>
			</h2>
			 <div class="row">
                <div class="form-group">
                    <label class="col-sm-4 control-label text-right">用户名<i class="fa fa-user"></i></label>
                    <div class="col-sm-6">
                        <input name="name" type="text" class="form-control input-sm">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="form-group">
                    <label class="col-sm-4 control-label text-right">密码<i class="fa fa-unlock-alt"></i></label>
                    <div class="col-sm-6">
                        <input name="name" type="text" class="form-control input-sm">
                    </div>
                </div>
            </div>
		
			<button type="submit"><i class="fa fa-send"></i> 登 录</button>
			
		</form>
	</div>

	<div class="footer">
		<p>Copyright &copy; 2020.项目理管系统 All rights reserved.</p>
	</div>


	
	<script src="js/jquery.min.js"></script>
	
	<script src="js/canva_moving_effect.js"></script>

</body>

</html>