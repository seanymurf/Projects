<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" /> 
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>
<div id="content">
    <h2>Are you sure you want to delete this Member?</h2>
    <table cellspacing="5" cellpadding="0" border="0">
        <tr>
            <td class="bold">First Name:</td>
            <td>${user.firstName}</td>
        </tr>
        <tr>
            <td class="bold">Last Name:</td>
            <td>${user.lastName}</td>
        </tr>
        <tr>
            <td class="bold">Email Address:</td>
            <td>${user.emailAddress}</td>
        </tr>
        <tfoot>
            <tr>
                <td><form action="DeleteUser" method="post">
                        <input name="yesButton" type="submit" value="  Yes  ">
                    </form>            
                </td>
                <td><form action="DisplayUsers" method="get">
                        <input type="submit" value="  No   ">
                    </form>
                </td>
            </tr>
        </tfoot>
    </table>
</div>
<jsp:include page="includes/footer.jsp" />
