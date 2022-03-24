<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
<h2>Products:</h2>
<table>
    <tr>
        <th>
            id
        </th>
        <th>
            Title
        </th>
        <th>
            Cost
        </th>
    </tr>
    <c:forEach var="prod" items="${products}">
        <tr>
            <td>${prod.id}</td>
            <td>${prod.title}</td>
            <td>${prod.cost}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>