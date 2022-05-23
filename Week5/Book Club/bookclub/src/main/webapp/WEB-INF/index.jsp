<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<head>
<title>Login and Registration</title>
</head>
<body>

<div class="mx-auto">
	<h1 class="m-3 text-warning">Book Club</h1>
	<p class="m-3">A place for friends to share thoughts on books.</p>

	<div class="d-flex p-3">
		
		<form:form class="p-2 form-horizontal" action="/register" method="post" modelAttribute="newUser">
		
		<h1 class="text-primary">Register</h1>
			
			<div class="form-group row">
		        <form:label class="control-label" path="name">Name:</form:label>
		        <form:errors path="name" class="text-danger"/>
		        <div class="col-sm-10">
		        	<form:input path="name"/>
		        </div>	
		    </div>
		    <div class="form-group row">
		        <form:label class="control-label" path="email">Email:</form:label>
		        <form:errors path="email" class="text-danger"/>
		        <div class="col-sm-10">
		        	<form:input path="email"/>
		        </div>
		    </div>
		    <div class="form-group row">
		        <form:label class="control-label" path="password">Password:</form:label>
		        <form:errors path="password" class="text-danger"/>
		      	<div class="col-sm-10">
		        	<form:input path="password"/>
		        </div>
		    </div>
		    <div class="form-group row">
		        <form:label class="control-label" path="confirm">Confirm PW:</form:label>
		        <form:errors path="confirm" class="text-danger"/>  
	  			<div class="col-sm-10">
		        	<form:input path="confirm"/>
		        </div>
			</div>
			<br><input class="btn btn-primary" type="submit" value="Submit"/>
		</form:form>

		<form:form class="p-2 form-horizontal" action="/login" method="post" modelAttribute="newLogin">
		
			<h1 class="text-primary">Login</h1>
			
		    <div class="form-group row">
		        <form:label class="control-label" path="email">Email:</form:label>
		        <form:errors path="email" class="text-danger"/>
		        <div class="col-sm-10">
		        	<form:input path="email"/>
		        </div>
		    </div>
		    <div class="form-group row">
		        <form:label class="control-label" path="password">Password:</form:label>
		        <form:errors path="password" class="text-danger"/>
		      	<div class="col-sm-10">
		        	<form:input path="password"/>
		        </div>
		    </div>
	    		
			<br><input class="btn btn-primary" type="submit" value="Submit"/>
		</form:form>
	</div>
</div>

</body>
</html>