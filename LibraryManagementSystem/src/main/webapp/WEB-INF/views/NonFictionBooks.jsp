<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h1>NonFictional Books</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Book Type</th>
                    <th>Book Name</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>${book.id}</td>
                        <td>${book.bookType}</td>
                        <td>${book.bookName}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
