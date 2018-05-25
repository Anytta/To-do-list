<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="http://www.in28minutes.com">In28Minutes</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-left">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<H3>You are logged in as ${name}</H3>

		<h2>These are your tasks:</h2>
		<ol>
			<c:forEach items="${tasks}" var="todo">
				<li>${todo.name} &nbsp; &nbsp; <a
					href="/delete-todo.do?todo=${todo.name}"> Delete </a>
				</li>
			</c:forEach>
		</ol>

		<form method="POST" action="/add-todo.do">
			<input name="todo" type="text" /> <input type="submit"
				value="Add new" />
		</form>

	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>