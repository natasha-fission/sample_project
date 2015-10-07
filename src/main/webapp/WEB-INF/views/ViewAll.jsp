<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import = "java.util.ArrayList"  import=" com.fission.beans.Movie" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Movie</title>
</head>
<body>
<a href="add.html">Add New Movie</a>
<% ArrayList<Movie> MList = (ArrayList<Movie>) request.getAttribute("MList");
		   if(MList.size() == 0)
		   {
		%>
				<H4> No Books found..</H4>
		<% }
		   else
		   {
		%>
				<TABLE WIDTH = '70%' BORDER = "1" style="text-align:center">
				
				<TR><TH>Movie Name</TH><TH>Movie ID</TH><TH>Release Date</TH>
				</TR>
				<% for(Movie m : MList)
				   {
				%>
					<TR>
						<TD><%= m.getName()%></TD>
						<TD><%= m.getId()%></TD>
						<TD><%= m.getRelease() %></TD>
						<td><a href="delete.html/"<%=m.getId()%>>Delete</a></td>
						<td><a href="update.html/"<%=m.getId()%>>Update</a></td>
					</TR>
				<% }
				%>
				</TABLE>
		<% }
		%>


</body>
</html>