package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.Product;

public class ProductDB {

    //This method returns null if a product isn't found.
    public static Product selectProduct(String productCode) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM Product "
                + "WHERE productCode = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, productCode);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product p = new Product();
                p.setProductName(rs.getString("productName"));
                p.setProductCode(rs.getString("productCode"));
                p.setProductDescription(rs.getString("productDescription"));
                p.setPrice(rs.getDouble("price"));
                return p;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    //This method returns null if a product isn't found.
    public static ArrayList<Product> selectProducts() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM Product";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Product> products = new ArrayList<Product>();
            while (rs.next()) {
                Product p = new Product();
                p.setProductName(rs.getString("productName"));
                p.setProductCode(rs.getString("productCode"));
                p.setProductDescription(rs.getString("productDescription"));
                p.setPrice(rs.getDouble("price"));
                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static boolean exists(String productCode) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT productCode FROM Product "
                + "WHERE productCode = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, productCode);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int insert(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method adds a new record to the Users table in the database
        String query
                = "INSERT INTO Product (productName, productCode, productDescription, price) "
                + "VALUES (?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getProductCode());
            ps.setString(3, product.getProductDescription());
            ps.setDouble(4, product.getPrice());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int update(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method updates the record with a matching email address.
        //It returns a value of 0 if the email address can't be found.
        String query = "UPDATE Product SET "
                + "productName = ?, "
                + "productCode = ?,"
                + "productDescription = ?, "
                + "price = ? "
                + "WHERE productCode = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getProductCode());
            ps.setString(3, product.getProductDescription());
            ps.setDouble(4, product.getPrice());
            ps.setString(5, product.getProductCode());

            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    public static int delete(Product product) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method updates the record with a matching email address.
        //It returns a value of 0 if the email address can't be found.
        String query = "DELETE FROM Product "
                + "WHERE productCode = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getProductCode());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
