<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="content">  
    <h2>Members</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email Address</th>
      </tr>

        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:forEach var="u" items="${users}">
            <tr valign="top">
                <td>${u.firstName}</td>
                <td>${u.lastName}</td>
                <td>${u.emailAddress}</td>
    
              <td><a href="DisplayUser?emailAddress=${u.emailAddress}">Edit</a></td>
                <td><a href="DeleteUser?emailAddress=${u.emailAddress}">Delete</a></td>
           
        </c:forEach>
    </table>
    <form class="center" action="DisplayUser" method="get">
        <br />
        <input type="submit" value="Add Member">
    </form>
</div>
<jsp:include page="includes/footer.jsp" />
