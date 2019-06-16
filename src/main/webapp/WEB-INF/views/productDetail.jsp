<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail</title>
</head>
<body>


        <form:form method="" modelAttribute="product">
        <form:hidden path="3code" /> 
             <table>
                <tr>
                    <td><form:label path="code">code</form:label></td>
                    <td><form:input path="code"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="price">UserName</form:label></td>
                    <td><form:input path="price"/></td>
                </tr>
             
            </table>
        </form:form>


</body>
</html>