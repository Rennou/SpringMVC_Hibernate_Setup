<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>
	<br>
	<br>
	<br>

	<br>
	<h3>List of all product</h3>

	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>code</th>
				<th>Name</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${listeP}" var="p">

				<tr>
					<td>${p.code}</td>
					<td>${p.name}</td>
					<td>${p.price}</td>
					<td>
					<a href="${pageContext.request.contextPath}/edit/${p.code}">Edit</a>
					</td>
					
				</tr>

			</c:forEach>


		</tbody>


	</table>
</body>
</html>