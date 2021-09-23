
package revisionnea;


public class User {
    protected String Username;
    protected String HPassword;
    protected String Email;
    protected String School;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getHPassword() {
        return HPassword;
    }

    public void setHPassword(String HPassword) {
        this.HPassword = HPassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public User(String Username, String HPassword, String Email, String School) {
        this.Username = Username;
        this.HPassword = HPassword;
        this.Email = Email;
        this.School = School;
    }
    
}
