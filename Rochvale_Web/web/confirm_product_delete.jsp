<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>

            <div id="content">
                <h2>Are you sure you want to delete this product?</h2>
                <table cellspacing="5" cellpadding="0" border="0">
                    <tr>
                        <td class="bold">Product Name:</td>
                        <td>${product.productName}</td>
                    </tr>
                    <tr>
                        <td class="bold">Product Code:</td>
                        <td>${product.productCode}</td>
                    </tr>
                    <tr>
                        <td class="bold">Product Description:</td>
                        <td>${product.productDescription}</td>
                    </tr>
                       <tr>
                        <td class="bold">Product Price:</td>
                        <td>${product.price}</td>
                    </tr>
                    <tfoot>
                    <tr>
                        <td><form action="DeleteProduct" method="post">
                                <input name="yesButton" type="submit" value="  Yes  ">
                            </form>            
                        </td>
                        <td><form action="DisplayProducts" method="get">
                                <input type="submit" value="  No   ">
                            </form>
                        </td>
                    </tr>
                    </tfoot>
                </table>
            </div>
<jsp:include page="includes/footer.jsp" />