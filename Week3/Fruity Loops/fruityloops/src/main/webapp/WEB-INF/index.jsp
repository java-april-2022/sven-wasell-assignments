<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>


    <meta charset="UTF-8" />
    <title>Fruity Loops</title>
</head>
<body>
<h1>Fruit Store</h1>
	<div class="container">
		<table class="table">
			<tbody>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>				
				<c:forEach var="fruitLoops" items="${fruitList}">
					<tr>
						<td><c:out value="${fruitLoops.name}"></c:out></td>
						<td><c:out value="${fruitLoops.price}"></c:out></td>
					</tr>	
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>


