
package Data;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.sql.DataSource;


/**
 *
 * @author K00206434
 */
public class ConnectionPool {
        private static ConnectionPool pool = null;
    private static DataSource dataSource = null;
 
    public synchronized static ConnectionPool getInstance()
    {
        if (pool == null)
        {
            pool = new ConnectionPool();
        }
        return pool;
    }

    private ConnectionPool()
    {
        try
        {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("jdbc/rochvaledb");
            //dataSource = (DataSource) ic.lookup("jdbc/userregistration");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public Connection getConnection()
    {
        try
        {
            return dataSource.getConnection();
        }
        catch (SQLException sqle)
        {
            sqle.printStackTrace();
            return null;
        }
    }
    
    public void freeConnection(Connection c)
    {
        try
        {
            c.close();
        }
        catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }

}
