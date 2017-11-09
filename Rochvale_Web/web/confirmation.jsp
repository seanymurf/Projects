<%-- 
    Document   : confirmation
    Created on : 24-Jan-2017, 15:53:31
    Author     : K00206434
--%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style_1.css">
        <title>Confirmation Page</title>
    </head>
    <body>

        <div id="content">
            <h2>Thank you for your details</h2>
            <p>Here is the information that you entered:</p><br>
            <%@page import = "Model.User"%>
            <% User User = (User) request.getAttribute("User");%>
            <table class="details">
                <tr>
                    <td>First Name:</td>
                    <td>${User.firstName}</td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td>${User.lastName}</td>
                </tr>
                <tr>
                    <td>Email Address:</td>
                    <td>${User.emailAddress}</td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td>${User.password}</td>
                </tr>
            </table>
            <br>
            <input type="button" value="Return" onclick="history.back(-2)" />
        </form>
    </div> 
</body>
</html>

