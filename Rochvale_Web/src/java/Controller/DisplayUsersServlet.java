package Controller;
import java.io.IOException;
import java.util.ArrayList;
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

public class DisplayUsersServlet extends HttpServlet
{
   protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response)
                          throws ServletException, IOException
    {   ArrayList<User> users =  UserDB.selectUsers();
        HttpSession session = request.getSession();
        session.setAttribute("users", users);
        String url = "/users.jsp";
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