
package Model;

/**
 *
 * @author K00206434
 */
public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String retypePassword;
    private String query;

    public User() {
        firstName = "";
        lastName = "";
        emailAddress = "";
        password = "";
        retypePassword = "";
        query = "";

    }

    // instance variables
    public User(String firstName, String lastName, String emailAddress, String password, String query) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.query = query;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypePassword() {
        return retypePassword;
    }

    public void setRetypePassword(String retypePassword) {
        this.retypePassword = retypePassword;
    }

//    @return the query
    public String getQuery() {
        return query;
    }
//    @param county the query to set

    public void setQuery(String query) {
        this.query = query;
    }
}
