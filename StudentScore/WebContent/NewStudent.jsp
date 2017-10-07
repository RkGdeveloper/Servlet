<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add.obj">
<center>New Student Score Updated Form</center>
<!-- Studentname <input type="text" name="studentName"/><br/> -->
<!-- Age <input type="text" name="age"/><br/> -->
<!-- state <input type="text" name="state"/><br/> -->
<!-- gender <input type="text" name="gender"/><br/> -->
<!-- No of Subjects scored Centum <input type="text" name="centum"/><br/> -->
<!-- No Of attempts <input type="text" name="attempts"/><br/> -->
<!-- Total subject Scores  <input type="text" name="totalSub"/><br/> -->
<!-- <input type="submit" value="Submit Student Data"/><br/> -->

		<table align="center" border="1" cellspacing="0" cellpadding="5">
			<tr>
				<th>Studentname </th>
				<th>
					<input type="text" name="studentName"/>
				</th>
				
				
			</tr>
			<tr>
				<td>Age</td>
				<td>
					<input type="text" name="age"/>
				</td>
				
			</tr>
			<tr>
				<td>state</td>
				<td>
					<input type="text" name="state"/>
				</td>
			</tr>
			<tr>
				<td>gender</td>
				<td>
					<input type="text" name="gender"/>
				</td>
				
			</tr>
			<tr>
				<td>No of Subjects scored Centum </td>
				<td>
					<input type="text" name="centum"/>
				</td>
				
			</tr>
			<tr>
				<td>No Of attempts </td>
				<td>
					<input type="text" name="attempts"/>
				</td>
				
			</tr>
			<tr>
				<td>Total subject Scores</td>
				<td>
					<input type="text" name="totalSub"/>
				</td>
				
			</tr>
			<tr>
				<td> 
					<input type="submit" value="Submit Student Data"/>
				</td>
				<td></td>
			</tr>
		</table>

</form>
</body>
</html>