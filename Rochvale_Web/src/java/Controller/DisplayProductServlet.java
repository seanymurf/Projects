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

public class DisplayProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String productCode = request.getParameter("productCode");
        Product product = null;
        if (productCode == null || productCode.length() == 0) {
            product = new Product();
        } else {
            product = ProductDB.selectProduct(productCode);
        }
        HttpSession session = request.getSession();
        session.setAttribute("product", product);
        String url = "/product.jsp";
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
