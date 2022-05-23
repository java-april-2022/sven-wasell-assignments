<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Show Expense</title>
</head>
<body>

<div class="mx-auto" style="width: 1000px">
<h1 class="text-primary">${dojo.name} Location Ninjas</h1><br>
	<table class="table table-bordered" >
		<thead class="thead-dark">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td><c:out value="${ninja.firstName}"></c:out></td>
					<td><c:out value="${ninja.lastName}"></c:out></td>
					<td><c:out value="${ninja.age}"></c:out></td>
				</tr>
			</c:forEach>
		</tbody>		
	</table>
</div>

</body>
</html>