
var $ = function (id) {
    return document.getElementById(id);
}
var joinList = function () {
    var firstName = $("firstName").value;
    var lastName = $("lastName").value;
    var emailAddress = $("emailAddress").value;
    var password = $("password").value;
    var retypePassword = $("retypePassword").value;

    var isValid = true;

    // validate the first entry
    if (firstName === "") {
        $("firstName_Error").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("firstName_Error").firstChild.nodeValue = "";
    }
// validate the second entry
    if (lastName === "") {
        $("lastName_Error").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("lastName_Error").firstChild.nodeValue = "";
    }

    // validate the third entry   
    if (emailAddress === "") {
        $("emailAddress_Error").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("emailAddress_Error").firstChild.nodeValue = "";
    }

    if (password === "") {
        $("password").firstChild.nodeValue =
                "This field is required.";
        isValid = false;
    } else {
        $("emailAddress_Error").firstChild.nodeValue = "";
    }

    if (retypePassword === "") {
        $("retypePassword").firstChild.nodeValue =
                "This field is required.";
    } else if (retypePassword != password) {
        $("retypePassword").firstChild.nodeValue =
                "This field is required.";

        isValid = false;
    } else {
        $("retypePassword_Error").firstChild.nodeValue = "";
    }

}
if (isValid) {
    // submit the form
    $("form_registration").submit();
}

window.onload = function () {
    $("join_list").onclick = joinList;
    $("firstName").focus();
}


