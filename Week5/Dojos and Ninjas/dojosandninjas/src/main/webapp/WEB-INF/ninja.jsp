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
<title>New Ninja</title>
</head>
<body>
	
<div class="mx-auto" style="width: 500px">
	
	<h1 class="text-primary">New Ninja:</h1>
		
	<form:form class="form-horizontal" action="/ninjas" method="post" modelAttribute="ninja">
		<form:label path="Dojo">Dojo: </form:label>
		
			<form:select path="dojo">
	        	<c:forEach var="oneDojo" items="${dojo}">
	            	<form:option value="${oneDojo.id}"><c:out value="${oneDojo.name}"></c:out></form:option>
	        	</c:forEach>
    		</form:select>
    
		<div class="form-group">
		      <form:label class="control-label" path="firstName">First Name: </form:label>    
		      <div class="col-sm-10">
		      	<form:input path="firstName"/>
		      </div>
		</div>	

		<div class="form-group">
		      <form:label class="control-label" path="lastName">Last Name: </form:label>    
		      <div class="col-sm-10">
		      	<form:input path="lastName"/>
		      </div>
		</div>
		
		<div class="form-group">
		      <form:label class="control-label" path="age">Age: </form:label>  
		      <div class="col-sm-10">
		      	<form:input path="age"/>
		      </div>
		</div>
		<input class="btn btn-primary" type="submit" value="Create"/>
		
	</form:form>
</div>	
</body>
</html>