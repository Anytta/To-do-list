<%@include file="../common/header.jspf"%>
<body>

	<%@include file="../common/navigation.jspf"%>

	<div class="container">

		<h2>Your To-do list</h2>
		<br>

		<form action="/login.do" method="post">
			<p>
				Enter your name <input type="text" name="name" />
			</p>
			<p>
				Enter password &nbsp; <input type="password" name="password" />
			</p>
			<input class="btn btn-info btn-lg active" type="submit" value="Login">

			<p>
				<font color="red"> ${errorMessage} </font>
			</p>

		</form>

	</div>
	<%@include file="../common/footer.jspf"%>

</body>
</html>