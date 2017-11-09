package Model;

/**
 *
 * @author Sean
 */
public class StaffLogin {

    private String username;
    private String password;
    private String query;

    public StaffLogin() {
        username = "";
        password = "";
        query = "";
    }

    public StaffLogin(String username, String password, String query) {
        this.username = username;
        this.password = password;
        this.query = query;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(String query) {
        this.query = query;
    }

}
