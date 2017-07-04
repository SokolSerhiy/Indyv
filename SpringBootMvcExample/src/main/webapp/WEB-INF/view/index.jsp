<%@page import="ua.entity.Author"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<h2>Hello</h2>
	<form action="/" method="POST">
		<div>
			<input name="authorName">
		</div>
		<div>
			<button type="submit">Ok</button>
		</div>
	</form>
	<ul>
		<c:forEach items="${authors}" var="author">
			<li>${author.name}</li>
		</c:forEach>
	</ul>
</body>
</html>