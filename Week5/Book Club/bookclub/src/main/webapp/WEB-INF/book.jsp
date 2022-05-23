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
	<h1>${book.title}</h1>	
	
	<div class="mx-auto">
		
		<a href="/books">Back to the shelves</a>		

		<table class="table table-bordered" >
				<thead>
					<tr>
						<th>Title</th>
						<th>Author</th>
						<th>Thoughts</th>				
					</tr>
				</thead>
				<tbody>
						<tr>
							<td><c:out value="${book.title}"/></td>
							<td><c:out value="${book.authorName}"/></td>
							<td><c:out value="${book.myThoughts}"/></td>
						</tr>
				</tbody>		
		</table>
			
	</div>		
	<a href="/books/${book.id}/edit">Edit</a>
</div>
</body>
</html>