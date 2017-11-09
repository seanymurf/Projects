<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" /> 
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>
<div id="content">
    <h2>Update Member Details</h2>
    <p><i>${message}</i></p>
    <form action="DisplayUser" method="post">
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td align="right" class="colwidth200">Email Address:</td>
                <td><input type="text" name="emailAddress" value="${user.emailAddress}"></td>
            </tr>

        </table>
        <br>
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td class="colwidth200"><input type="submit" value="Update Member"></form></td>
        </table>
    </form>
</div>
<jsp:include page="includes/footer.jsp" />    
