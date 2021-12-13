<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: konno
  Date: 13.12.2021
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<body>
<h2>Employee info</h2>
<br><br>

<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>
    
    Name <form:input path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <br><br>
    Department<form:input path="department"/>
    <br><br>
    Salary<form:input path="salary"/>
    <br><br>

    <input type="submit" value="Ok">



</form:form>
</body>
</html>
