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

	<h1> Add a Book to your Shelf!</h1>
	<a href="/books">Back to the shelves</a>
	
	<form:form class="form-horizontal" action="/books/new" method="post" modelAttribute="book">

		<div class="form-group">
		      <form:label class="control-label" path="title">Title:</form:label> 
		      <form:errors path="title" class="text-danger"/>     
		      <div class="col-sm-10">
		      	<form:input path="title"/>
		      </div>
		</div>	

		<div class="form-group">
		      <form:label class="control-label" path="authorName">Author:</form:label>
		      <form:errors path="authorName" class="text-danger"/>   
		      <div class="col-sm-10">
		      	<form:input path="authorName"/>
		      </div>
		</div>
		
		<div class="form-group">
		      <form:label class="control-label" path="myThoughts">My thoughts:</form:label> 
		      <form:errors path="myThoughts" class="text-danger"/>  
		      <div class="col-sm-10">
		      	<form:textarea path="myThoughts"/>
		      </div>
		</div>
		<input class="btn btn-primary" type="submit" value="Create"/>
		
	</form:form>
</div>
</body>
</html>