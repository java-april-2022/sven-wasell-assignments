<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	
	<title>Omikuji Form</title>
</head>
<body>
	<h1> Send an Omikuji!</h1>
<div class="container">
	<form class="oform" action="/send" method="post">
	 	<label for="number">Pick any number from 5 to 25</label><br>
  		<input type="number" name="number"><br>
  		
  		<label for="city">Enter the name of any city</label><br>
  		<input type="text" name="city" value="San Diego"><br>
  		
  		<label for="person">Enter the name of any real person</label><br>
  		<input type="text" name="person" value="Kobe Bryant"><br>
  		
  		<label for="hobby">Enter the professional endeavor or hobby</label><br>
  		<input type="text" name="hobby" value="Solving rubix cubes"><br>
  		
  		<label for="thing">Enter any type of living thing</label><br>
  		<input type="text" name="thing" value="Hippo"><br>
  		
  		<label for="comment">Enter any type of living thing</label><br>
  		<textarea name="comment" rows="10" cols="25">
		Your hair looked amazing at the bbq
		</textarea><br>
  		
  		<input type="submit" value="Send">
	</form> 
</div>
</body>
</html>