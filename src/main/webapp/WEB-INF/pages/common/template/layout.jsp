<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet" href="<spring:url value="/common/css/styles.css" htmlEscape="true" />" type="text/css"/>
<link rel="stylesheet" href="<spring:url value="/common/css/ui.css" htmlEscape="true" />" type="text/css"/>
<script type="text/javascript" src="<spring:url value="/common/js/jquery-1.7.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/common/js/jquery.tools.min.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/common/js/jquery-ui-1.8.16.custom.min.js" htmlEscape="true" />"></script>
<script type="text/javascript">
$(function() {
	$(".flash").delay(3000).fadeOut(1000);
	
	$("a[rel]").overlay({
		onBeforeLoad: function() {
			var wrap = this.getOverlay().find(".dialogContentWrap");
			wrap.load(this.getTrigger().attr("href"));
		}
	});
});
</script>
</head>
<body>

<div class="dialogContainer" id="overlay">
	<div class="dialogContentWrap"></div>
</div>

<div class="wrapper">
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="submenu" />
	<c:if test="${not empty successMessage}">
		<div class="flash flash-success"><c:out value="${successMessage}" /></div>
	</c:if>
	<c:if test="${not empty errorMessage}">
		<div class="flash flash-error"><c:out value="${errorMessage}" /></div>
	</c:if>
	<div>
		<tiles:insertAttribute name="body" />
	</div>
</div>
</body>
</html>