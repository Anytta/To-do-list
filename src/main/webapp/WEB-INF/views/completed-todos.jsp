<%@include file="../common/header.jspf"%>
<body>

	<%@include file="../common/navigation.jspf"%>

	<div class="container">

		<H3>Welcome ${name}</H3>

		<h4>Your Completed Tasks:</h4>

		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</thead>

			<tbody>
				<c:forEach items="${tasks}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a class="btn btn-danger"
							href="/completed-delete-todo.do?todo=${todo.name}&category=${todo.category}">
								Delete </a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>

	<%@include file="../common/footer.jspf"%>

</body>

</html>