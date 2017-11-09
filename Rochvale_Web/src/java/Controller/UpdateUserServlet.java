package Controller;


import Data.UserDB;

import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sean
 */
public class UpdateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = (String) request.getParameter("firstName");
        String lastName = (String) request.getParameter("lastName");
        String emailAddress = (String) request.getParameter("emailAddress");
        String password = (String) request.getParameter("password");

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailAddress(emailAddress);
        user.setPassword(password);
        String message = "";

        if (user.getFirstName().length() == 0) {
            message = "This is a required field";
        }
        if (user.getLastName().length() == 0) {
            message = "this is a required field";
        }
        if (user.getEmailAddress().length() == 0) {
            message = "This is a required field";
        }
        if (user.getPassword().length() == 0) {
            message = "This is a required field";
        }
        request.setAttribute("message", message);
        String url = "";
        if (message.length() == 0) {
            if (UserDB.exists(user.getEmailAddress())) {
            
                UserDB.update(user);
            }else {
                UserDB.insert(user);
            }
            url = "/DisplayUsers";
        } else {
            url = "/user.jsp";
        }
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
