<jsp:include page="includes/header.jsp" />
<jsp:include page="includes/menu.jsp" />
<img src="images/images1/logo4.jpg" id="rochv" alt=""/>


<div id="content">
    <h2>Product</h2>
    <p><i>${message}</i></p>
    <form action="UpdateProduct" method="post">
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td align="right" class="colwidth200">Product Name:</td>
                <td><input type="text" name="productName" value="${product.productName}"></td>
               
            </tr>
            <tr>
                <td align="right" class="colwidth200">Product Code:</td>
                <td><input type="text" name="productCode" value="${product.productCode}"></td>
                
            </tr>
            <tr>
                <td align="right">Product Description:</td>
                <td><input type="text" name="productDescription" size="50" value="${product.productDescription}"></td>
             
            </tr>
            <tr>
                <td align="right">Product Price:</td>
                <td><input type="text" name="price" value="${product.priceNumberFormat}"/></td>
               
            </tr>
        </table>
        <br>
        <table cellspacing="5" cellpadding="0" border="0">
            <tr>
                <td class="colwidth200"><input type="submit" value="Update Product"></form></td>
                <td><form action="DisplayProducts" method="post">
                        <input class="topmargin14" type="submit" value="View Products">
                    </form></td>
            </tr>
        </table>
    </form>
</div>
<jsp:include page="includes/footer.jsp" />                