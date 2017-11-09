<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="content">  
    <h2>Products</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>Product Name</th>
            <th>Product Code</th>
            <th>Description</th>
            <th>Price</th
            <th></th>
            <th></th>
        </tr>

        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:forEach var="p" items="${products}">
            <tr valign="top">
                <td>${p.productName}</td>
                <td>${p.productCode}</td>
                <td>${p.productDescription}</td>
                <td>${p.priceCurrencyFormat}</td>
                <td><a href="DisplayProduct?productCode=${p.productCode}">Edit</a></td>
                <td><a href="DeleteProduct?productCode=${p.productCode}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <form class="center" action="DisplayProduct" method="get">
        <br />
        <input type="submit" value="Add Product">
    </form>
</div>
<jsp:include page="includes/footer.jsp" />