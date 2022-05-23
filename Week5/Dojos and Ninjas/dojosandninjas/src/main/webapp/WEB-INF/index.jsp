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
<title>New Dojo</title>
</head>
<body>
	
<div class="mx-auto" style="width: 500px">
	
	<h1 class="text-primary">New Dojo:</h1>
		
	<form:form class="form-horizontal" action="/dojo" method="post" modelAttribute="dojo">
			
		<div class="form-group">
		      <form:label class="control-label" path="name">Name: </form:label>
		      <form:errors path="name" class="text-danger"/>      
		      <div class="col-sm-10">
		      	<form:input path="name"/>
		      </div>
		</div><br>	
		<input class="btn btn-primary" type="submit" value="Create"/>
		
	</form:form>
</div>	
</body>
</html>