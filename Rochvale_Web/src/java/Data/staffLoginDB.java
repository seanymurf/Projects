

package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.StaffLogin;

/**
 *
 * @author Sean
 */
public class staffLoginDB {
    
        public static boolean exists(String username)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT username FROM StaffLogin " +
                "WHERE username= ?";
        try
        {
            ps = connection.prepareStatement(query);
            ps.setString(1,username);
            rs = ps.executeQuery();
            return rs.next();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
        
            public static int insert(StaffLogin login)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method adds a new record to the Users table in the database
        String query = 
            "INSERT INTO StaffLogin (username, password) " +
            "VALUES (?, ?)";
        try
        {        
            ps = connection.prepareStatement(query);
            ps.setString(1, login.getUsername());
            ps.setString(2,login.getPassword());
    
            return ps.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
}