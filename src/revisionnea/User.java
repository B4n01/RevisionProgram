
package revisionnea;


public class User {
    protected String name;
    protected String Username;
    protected String HPassword;
    protected String Email;
    protected String School;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public User(String name, String Username, String HPassword, String Email, String School) {
        this.name = name;
        this.Username = Username;
        this.HPassword = HPassword;
        this.Email = Email;
        this.School = School;
    }

    
    
}
