package Controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.Product;
import Data.ProductDB;
import Data.UserDB;
import Model.User;

public class DisplayUserServlet extends HttpServlet
{   
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)
                          throws ServletException, IOException
    {   String emailAddress = request.getParameter("emailAddress");
        User user = null;
        if (emailAddress == null || emailAddress.length() == 0)
        {   user = new User();
        }
        else
        {   user = UserDB.selectUser(emailAddress);
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        String url = "/user.jsp";
        RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response)
                          throws ServletException, IOException
    {   doPost(request, response);
    }
}
