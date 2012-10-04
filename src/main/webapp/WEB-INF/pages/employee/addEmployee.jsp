<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form id="myform" modelAttribute="employee" action="${pageContext.servletContext.contextPath }/employee/addEmployee" method="POST" class="standard-form">
	<div>
		<div class="left-panel" style="margin-right: 30px;">
			<div class="field">
				<form:label for="fullName" path="fullName" cssErrorClass="field-error">Full Name:</form:label>
				<form:input path="fullName" cssClass="textbox" cssErrorClass="textbox field-error" />
				<div class="clear-both"></div>
				<form:errors path="fullName" cssClass="help field-error" />
			</div>
			<div class="field">
				<form:label for="position" path="position" cssErrorClass="field-error">Position:</form:label>
				<form:input path="position" cssClass="textbox" cssErrorClass="textbox field-error" />
				<div class="clear-both"></div>
				<form:errors path="position" cssClass="help field-error" />
			</div>
			<div class="field">
				<form:label for="salary" path="salary" cssErrorClass="field-error">Salary:</form:label>
				<form:input path="salary" cssClass="textbox" cssErrorClass="textbox field-error" />
				<div class="clear-both"></div>
				<form:errors path="salary" cssClass="help field-error" />
			</div>
			<div class="field">
				<form:label for="immediateSupervisor" path="immediateSupervisor" cssErrorClass="field-error">Supervisor:</form:label>
				<form:input path="immediateSupervisor" cssClass="textbox" cssErrorClass="textbox field-error" />
				<div class="clear-both"></div>
				<form:errors path="immediateSupervisor" cssClass="help field-error" />
			</div>
		</div>
		<div class="clear-both"></div>
			<div class="field" style="border-bottom: 1px solid #09C;">
				<input type="submit" id="view-comment-botton" class="button emphasis" value="Add Employee" />
			</div>
	</div>

</form:form>