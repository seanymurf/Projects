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

public class DeleteProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String productCode = request.getParameter("productCode");
      //  System.out.println("productCode" + productCode);
        HttpSession session = request.getSession();

        Product product = (Product) session.getAttribute("product");
        if (productCode != null) {
            product = ProductDB.selectProduct(productCode);
            session.setAttribute("product", product);
        }

        String url = "";
        String yesButton = request.getParameter("yesButton");
        if (yesButton != null) {
            ProductDB.delete(product);
            url = "/DisplayProducts";
        } else {
            url = "/confirm_product_delete.jsp";
        }

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }
}
