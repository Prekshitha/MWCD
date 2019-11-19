<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="workingwomen.do" method="GET">


<table>

<tr>
<th>Name:</th>
<td><input type="text" name="name" type="name" required></td>
</tr>

<tr>
<th>AdharNo:</th>
<td><input type="text" name="ano" type="ano" required></td>
</tr>

<tr>
<th>Address</th>
<td><textarea rows="4" cols="50" name="add" required></textarea></td>
</tr>

<tr>
<th>DOB:</th>
<td><input type="date" name="date" type="date" required></td>
</tr>

<tr>
<th>Caste:</th>
<td><input type="text" name="caste" type="caste" required></td>
</tr>

<tr>
<th>Contact:</th>
<td><input type="text" name="contact" type="contact" required></td>
</tr>

<tr>
<th>Physically Challenged:</th>
<td><input type="radio" name="phychal" value="yes"> yes<br>
<input type="radio" name="phychal" value="no"> no<br>
</tr>

<tr>
<th>NGO:</th>
<td><input type="radio" name="ngo" value="ngo1"> ngo1<br>
<select name="ngo">
  <option value="Bangalore">Bangalore</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Chennai">Chennai</option>
  <option value="Hyderabad">Hyderabad</option>
 
</select></td>


<td><input type="radio" name="ngo" value="ngo2"> ngo2<br>
<select name="ngo">
  <option value="Kolkata">Kolkata</option>
  <option value="Uttar Pradesh">Uttar Pradesh</option>
  <option value="Bihar">Bihar</option>
  <option value="Orissa">Orissa</option>
</select></td>

</tr>

<tr>
<th>Working Period in  months:</th>
<td>
<select name="wp">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  <option value="12">12</option>
</select>
</td>
</tr>

<tr>
<th>Gender:</th>
<td><input type="radio" name="gender" value="male"> male<br>
<input type="radio" name="gender" value="female"> female<br>
</tr>

<tr>
<th>DOB of child:</th>
<td><input type="date" name="date1" type="date1" required></td>
</tr>



<tr>
<th>Gross Income:</th>
<td><input type="text" name="gi" type="gi"></td>
</tr>





<tr><td colspan="2"><input type="submit" value="submit"></td><tr>


</table>
</form>


</body>
</html>