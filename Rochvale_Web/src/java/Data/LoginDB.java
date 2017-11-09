/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Login;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sean
 */
public class LoginDB {
    
        public static int insert(Login Login) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method adds a new record to the Customer table in the database
        String query
                = "INSERT INTO login ( emailAddress, password,)  "
                + "VALUES ( ?, ?)";
        try {
            ps = connection.prepareStatement(query);

      
            ps.setString(1, Login.getEmailAddress());
            ps.setString(2, Login.getPassword());
     

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
    

