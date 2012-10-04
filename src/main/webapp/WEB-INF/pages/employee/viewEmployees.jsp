<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<table class="standard-table">
	<thead>
		<tr>
			<th>Employee No.</th>
			<th>Full Name</th>
			<th>Position</th>
			<th>Salary</th>
			<th>Supervisor</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
		<tr>
			<td><c:out value="${employee.employeeId}"/></td>
			<td><c:out value="${employee.fullName}"/></td>
			<td><c:out value="${employee.position}"/></td>
			<td class="right"><c:out value="${employee.salary}"/></td>
			<td><c:out value="${employee.immediateSupervisor}"/></td>
<!-- 			<td class="center"> -->
<%-- 				<a href="<spring:url value='/product/${product.id}' htmlEscape='true'/>">View</a> | --%>
<%-- 				<a href="<spring:url value='/product/${product.id}/edit' htmlEscape='true'/>">Edit</a> | --%>
<%-- 				<a href="<spring:url value='/product/${product.id}/remove' htmlEscape='true'/>" class="edit" rel="#overlay">Remove</a> --%>
<!-- 			</td> -->
		</tr>
		</c:forEach>
	</tbody>
</table>
<div class="clear-both"></div>