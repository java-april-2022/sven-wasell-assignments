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
<title>Book Club</title>
</head>
<body>
	
<div class="container">
	<div class="mx-auto" style="width: 1000px">
		<h1 class="text-primary">Welcome, ${user.name}</h1>
		<p> Books from everyone's shelves:</p>
		<a href="/logout">Logout</a>
		<a href="/books/new">Add to my shelf</a>
	</div>	
		
		
	<div class="mx-auto" style="width: 1000px">
		<table class="table table-bordered" >
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Author Name</th>			
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${books}">
						<tr>
							<td><c:out value="${book.id}"></c:out></td>
							<td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
							<td><c:out value="${book.authorName}"/></td>
						</tr>
					</c:forEach>
				</tbody>		
			</table>
		</div>
		<br>
	
</div>
</body>
</html>