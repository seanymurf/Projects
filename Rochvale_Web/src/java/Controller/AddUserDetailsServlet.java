/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author K00206434
 */
public class AddUserDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response) 
        throws ServletException, IOException
    {
        // get parameters from the request
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");
         String password = request.getParameter("password");
          String retypePassword = request.getParameter("retypePassword");
        
        
                // create the User object
        User User = new User();
        User.setFirstName(firstName);
        User.setLastName(lastName);
        User.setEmailAddress(emailAddress);  
        User.setPassword(password);
        User.setRetypePassword(retypePassword);

        //pass the user object to the insert method
     
          UserDB.insert(User);
           request.setAttribute("User", User);

                
        // forward Request and response to jsp page
        String url = "/confirmation.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
@Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        this.doPost (request, response);
        
    }}

   
    

   


