/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sean
 */
public class StaffLoginServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String uname = request.getParameter("uname");//"uname from the field name="uname" from the admin.jsp class.
        String pass = request.getParameter("pass");

        if(uname.equals("sean") && pass.equals("11"))
        {
            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("products.jsp"); // if uname and pass match this statement redirect us the wolcome.jsp page.
        }                       //welcome
        else 
        {
            response.sendRedirect("mainProducts.jsp");
        }
    }

}
