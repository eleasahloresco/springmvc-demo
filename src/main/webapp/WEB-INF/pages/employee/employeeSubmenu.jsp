<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="secondary-navigation">
	<ul>
		<li><a href="<spring:url value="/employee/viewEmployees" htmlEscape="true" />">View Employees</a></li>
		<li><a href="<spring:url value="/employee/addEmployee" htmlEscape="true" />">Add employee</a></li>
	</ul>
	<div class="clear-both"></div>
</div>