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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sean
 */
public class UpdateProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String productName = (String) request.getParameter("productName");
        String productCode = (String) request.getParameter("productCode");
        String productDescription = (String) request.getParameter("productDescription");
        String priceString = (String) request.getParameter("price");
        double price;
        try {
            price = Double.parseDouble(priceString);
        } catch (Exception e) {
            price = 0;
        }
        HttpSession session = request.getSession();
        Product product = (Product) session.getAttribute("product");
        product.setProductName(productName);
        product.setProductCode(productCode);
        product.setProductDescription(productDescription);
        product.setPrice(price);
        String message = "";
        if (product.getPrice() <= 0) {
            message = "You must enter a positive number for the price without any currency symbols.";
        }
        if (product.getProductDescription().length() == 0) {
            message = "You must enter all required fields.";
        }
        if (product.getProductCode().length() == 0) {
            message = "You must enter all required fields.";
        }
        request.setAttribute("message", message);
        String url = "";
        if (message.length() == 0) {
            if (ProductDB.exists(product.getProductCode())) {
                ProductDB.update(product);
            } else {
                ProductDB.insert(product);
            }
            url = "/DisplayProducts";
        } else {
            url = "/product.jsp";
        }
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
