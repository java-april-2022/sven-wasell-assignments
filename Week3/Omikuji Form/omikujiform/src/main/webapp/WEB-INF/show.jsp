<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Omikuji Form</title>
</head>
<body>
	<h1> Here's Your Omikuji!</h1>
	
	<h3 style="background-color:blue; color: white; width:20%; border:2px solid black; padding:10px;"><c:out value="${results}"/></h3>
	
	<a href="/omikuji">Go Back</a>
</body>
</html>