var $ = function (id) {
    return document.getElementById(id);
};
var productList = function () {
    var productName = $("productName").value;
    var productCode = $("productCode").value;
    var productDescription = $("productDescription").value;
    var price = $("password").value;

    // validate the first entry
    if (productName === "") {
        $("productName_Error").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("productName_Error").firstChild.nodeValue = "";
    }

    if (productCode === "") {
        $("productCode_Error").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("productCode_Error").firstChild.nodeValue = "";
    }

    if (productDescription === "") {
        $("productDescription_Error").firstChild.nodeValue =
                "You must enter all the required fields.";
        isValid = false;
    } else {
        $("productDescription_Error").firstChild.nodeValue = "";
    }

    if (price.getPrice() <= 0) {
        $("price_Error").firstChild.nodeValue =
                "You must enter a positive number for the price without any currency symbols.";
        isValid = false;
    } else {
        $("price_Error").firstChild.nodeValue = "";
    }

    if (isValid) {
        // submit the form
        $("form_registration").submit();
    }

    window.onload = function () {
        $("product_list").onclick = productList;
        $("firstName").focus();
    };
};





