
package Controller;

import Data.ProductDB;

import Model.Product;

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
public class AddProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // get parameters from the request

        String productName = (String) request.getParameter("productName");
        String productCode = (String) request.getParameter("productCode");
        String productDescription = (String) request.getParameter("productDescription");
        String priceString = (String) request.getParameter("price");
        double price;
        
        try{
            price = Double.parseDouble(priceString);
        }catch (Exception e){
            price = 0;
        }
        

        // create the User object
        Product Product = new Product();

        Product.setProductName(productName);
        Product.setProductCode(productCode);
        Product.setProductDescription(productDescription);
   

        //pass the user object to the insert method
        ProductDB.insert(Product);
        request.setAttribute("Product", Product);

        // forward Request and response to jsp page
        String url = "/addProductConfirmation.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);

    }
}
