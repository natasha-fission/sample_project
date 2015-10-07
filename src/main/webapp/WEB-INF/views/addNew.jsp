<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Movie</title>
</head>
<body>
<script type="text/javascript">


</script>
<form method="post">

<table>


<tr>
		<td>
			ID:
		</td>
		<td>
			<input type="text" name="id">
		</td> 
	</tr>
	
	<tr>
		<td>
			Name:
		</td>
		<td>
			<input type="text" name ="name">
		</td> 
	</tr>
		<tr>
		<td>
				Director
		</td>
		<td>
			<input type="text" name="director">
		</td>
	</tr>
	
<!-- 	<tr>
		<td>
			
				Release Date
		
		</td>
		<td>
		<input type="text" name="date" />
		</td>
	</tr>
	 -->
	<tr>
		<td>
			
				Language

		</td>
		<td>
			<input type="text" name="Language"/>
		</td>
	</tr>
	
	
	<tr>
		<td colspan="2">
			
				<input type="submit" value="Add Movie" />
		</td>
	</tr>
</table>
</form>

</body>
</html>