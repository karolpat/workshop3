<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="/header.jsp"></jsp:include>
	
<h3>List of all user groups</h3>

	<table>
		<thead>
			<th>ID</th>
			<th>Name</th>
			<th>See users</th>
		</thead>
		<tbody>

			<c:forEach var="group" items="${list }">

				<tr>
					<td>${group.id }</td>
					<td>${group.name }</td>
					<td><a href="/warsztat/usersOfGroup?id=${group.id }">Show me</a></td>
				</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>
