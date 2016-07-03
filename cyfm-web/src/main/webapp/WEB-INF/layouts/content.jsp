<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jspf"%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
	<title>cyfm:<sitemesh:title/></title>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
	<meta http-equiv="Cache-Control" content="no-store" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="0" />
	<style>
		th {
			border-bottom-width: 1px !important;
		}
	</style>
	<!-- ================================= Css 区域 ========================================== -->
	<link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">

	<!-- 插件扩展区 bengin-->
	<link href="${ctx}/static/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="${ctx}/static/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
	<link href="${ctx}/static/plugins/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/plugins/jquery-ui-bootstrap/css/font-wesome/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="${ctx}/static/plugins/jquery-ui-bootstrap/css/custom-theme/jquery-ui-1.10.3.custom.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/plugins/jquery-ui-bootstrap/css/layout-default-1.3.0.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/plugins/uniform/css/uniform.default.css" type="text/css" rel="stylesheet" />

	<%@include file="/WEB-INF/views/common/import-zTree-css.jspf"%>
	<!-- 插件扩展区 end-->

	<link href="${ctx}/static/styles/default.min.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/styles/components.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/manage/css/style.css" rel="stylesheet" type="text/css" />

	<!-- ================================= JS 区域 ========================================== -->
	<!-- 插件扩展区 bengin-->
	<script src="${ctx}/static/plugins/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/plugins/jquery-ui-bootstrap/js/jquery-ui-1.10.3.custom.js"></script>
	<script src="${ctx}/static/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/plugins/laydate/laydate.dev.js" type="text/javascript"></script>
	<script src="${ctx}/static/plugins/layer-dialog/layer-dialog.dev.js"></script>
	<script src="${ctx}/static/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
	<!-- 插件扩展区 end-->

	<script src="${ctx}/static/js/common.js?3" type="text/javascript"></script>
	<sitemesh:head />
</head>
<body>
<div class="place">
	<span>位置：</span>
	<ul class="placeul">
		<li><a href="#">首页</a></li>
		<li><a href="#">数据表</a></li>
		<li><a href="#">基本内容</a></li>
	</ul>
</div>
<div class="rightinfo">
	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
	</c:if>
	<c:if test="${not empty page}">
		<div class="tools">
			<div class="btn-group">
				<a class="btn btn-primary create" href="${ctx}/${viewPrefix}/create"><i class="fa fa-plus"></i> 添加</a>
				<a class="btn btn-success update" data-baseurl="${ctx}/${viewPrefix}/update/{id}"><i class="fa fa-pencil"></i> 修改</a>
				<a class="btn btn-warning delete" data-baseurl="${ctx}/${viewPrefix}/delete/{id}"><i class="fa fa-trash-o"></i> 删除</a>
				<a class="btn btn-default more"><i class="fa fa-bars"></i> 更多</a>
			</div>
			<ul class="toolbar-right">
				<li><span><img src="${ctx}/static/manage/images/t05.png" /></span>设置</li>
			</ul>
		</div>
	</c:if>

	<sitemesh:body />
</div>
<script>
	function refreshPage(){
		window.location.reload();
	}
	$("body").keydown(function(e){
		var ev = window.event || e;
		var code = ev.keyCode || ev.which;

		if (code==116) {
			// 阻止默认的F5事件
			if(ev.preventDefault) {
				ev.preventDefault();
			}else {
				ev.keyCode=0;
				ev.returnValue=false;
			}

			refreshPage();
			return false;
		}
		return true;
	});
	<cy:showFieldError commandName="entity"/>
</script>
</body>
</html>
