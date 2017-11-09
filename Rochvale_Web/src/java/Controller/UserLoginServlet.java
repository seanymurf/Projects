/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Login;
import Data.LoginDB;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sean
 */
public class UserLoginServlet extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest request, 
        HttpServletResponse response) 
        throws ServletException, IOException
    

    {
        // get parameters from the request
        
     
        String emailAddress = request.getParameter("emailAddress");
         String password = request.getParameter("password");
   
        
        
                // create the User object
        Login Login = new Login();
        Login.setEmailAddress(emailAddress);   
        Login.setPassword(password);

        //pass the user object to the insert method
     
          LoginDB.insert(Login);
           request.setAttribute("Login", Login);

                
        // forward Request and response to jsp page
        String url = "/loginConfirm.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
@Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        this.doPost (request, response);
        
    }}

   
    

   



