<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>

<div id="content">
    <h2>Member</h2>
    <p><i>${message}</i></p>
    <form action="UpdateUser" method="post">
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td align="right" class="colwidth200">First Name:</td>
                <td><input type="text" name="firstName" value="${user.firstName}"></td>
            </tr>
            <tr>
                <td align="right" class="colwidth200">Last Name:</td>
                <td><input type="text" name="lastName" value="${user.lastName}"></td>
            </tr>
            <tr>
                <td align="right">Email Address:</td>
                <td><input type="text" name="emailAddress" size="50" value="${user.emailAddress}"></td>
            </tr>
            <tr>
                <td align="right">Password:</td>
                <td><input type="text" name="password" value="${user.password}"/></td>
            </tr>
        </table>
        <br>
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td class="colwidth200"><input type="submit" value="Update Member"></form></td>
                <td><form action="DisplayUsers" method="post">
                        <input class="topmargin14" type="submit" value="View Members">
                    </form></td>
            </tr>
        </table>
    </form>
</div>
<jsp:include page="includes/footer.jsp" />    
