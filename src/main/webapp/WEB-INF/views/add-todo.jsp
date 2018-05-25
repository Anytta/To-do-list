<%@include file="../common/header.jspf"%>
<body>

	<%@include file="../common/navigation.jspf"%>

	<div class="container">

		<h4>Your New Todos:</h4>

		<form method="POST" action="/add-todo.do">
			<fieldset class="form-group">
				<label> Description: </label> <input name="todo" type="text"
					class="form-control" /> </br>
			</fieldset>
			<fieldset class="form-group">
				<label> Category: </label> <input name="category" type="text"
					class="form-control" /> </br>
			</fieldset>
			<input class="btn btn-success" name="add" type="submit"
				value="Add new" />
		</form>

	</div>

	<%@include file="../common/footer.jspf"%>

</body>

</html>