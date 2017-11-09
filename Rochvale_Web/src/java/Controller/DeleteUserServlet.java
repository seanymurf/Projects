
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
public class DeleteUserServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)
                          throws ServletException, IOException
    {   
        String emailAddress = request.getParameter("emailAddress");
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");
        if (emailAddress != null)
        {   user = UserDB.selectUser(emailAddress);
            session.setAttribute("user", user);
        }
        
        String url = "";
        String yesButton = request.getParameter("yesButton");
        if (yesButton != null)
        {  // System.out.println("about to call userdb.delete");
            
            UserDB.delete(user);
            url = "/DisplayUsers";
        }
        else
        {   url = "/confirm_user_delete.jsp";
        }
                
        RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response)
                         throws ServletException, IOException
    {   this.doPost(request, response);
    }
}
