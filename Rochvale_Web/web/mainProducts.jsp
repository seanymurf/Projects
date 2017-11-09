<%-- 
    Document   : mainProducts
    Created on : Apr 6, 2017, 12:20:20 AM
    Author     : Sean
--%>
<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="content">
    <h2>Product Maintenance</h2>
    <p><i>${message}</i></p>
    <form action="StaffLogin" method="post">
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td align="right" class="colwidth200">Username:</td>
                <td><input type="text" name="username" value="${login.username}"></td>

            </tr>
            <tr>
                <td align="right" class="colwidth200">Password:</td>
                <td><input type="text" name="password" value="${login.password}"></td>
            </tr>
            <br />

        </table>
        <br>
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
            <input class="topmargin14" type="submit" value="Login">
            </form></td>
            </tr>
        </table>
    </form>
</div>
<jsp:include page="includes/footer.jsp" />
