<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
<link href="css/index.css" type="text/css" rel="stylesheet"/>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>

<title>401电影院</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-9" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
         
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-9">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">首页</a></li>
            <li><a href="#">购票</a></li>
			<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
            <li><a href="login2.jsp">会员登录</a></li>
            <li><a href="Admintest.action">会员列表</a></li>
            <li><a href="register.jsp">注册</a></li>
            <li><a href="uploadAndDownload.jsp">test文件上传</a></li>
            <li><a href="fileDownload?downloadFile=test.txt">test文件下载</a></li>
          </ul>
        </div>
      </div>
    </nav>


    <div class="bs-example">
      <ul class="nav nav-pills" role="tablist">
        <li role="presentation" class="active"><a href="#">401电影院</a></li>
        <li role="presentation" class="dropdown">
          <a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
            电影类型
            <span class="caret"></span>
          </a>
          <ul id="menu1" class="dropdown-menu" aria-labelledby="drop4">
            <li><a href="#">动作</a></li>
            <li><a href="#">喜剧</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">恐怖</a></li>
          </ul>
        </li>
        <li role="presentation" class="dropdown">
          <a id="drop5" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
            电影时长
            <span class="caret"></span>
          </a>
          <ul id="menu2" class="dropdown-menu" aria-labelledby="drop5">
            <li><a href="#">90分以下</a></li>
            <li><a href="#">91分~110分</a></li>
            <li><a href="#">111分~120分</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">121分以上</a></li>
          </ul>
        </li>
      </ul> <!-- /pills -->
    </div>

    <div class="ad">
      <ul class="slider">
        <li><img src="images/1.jpg"/></li>
        <li><img src="images/2.jpg"/></li>
        <li><img src="images/3.jpg"/></li>
        <li><img src="images/4.jpg"/></li>
        <li><img src="images/5.jpg"/></li>
      </ul>
      <ul class="num">

      </ul>
      <div class="btn btn_l">&lt;</div>
      <div class="btn btn_r">&gt;</div>
    </div>


  <div id="showed"></div>
</body>
</html>