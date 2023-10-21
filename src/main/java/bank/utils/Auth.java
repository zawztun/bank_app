package bank.utils;

public class Auth {
    String password;
    String email;

    public Auth(String password, String email) {
        this.password= password;
        this.email = email;
    }

    public Auth() {
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
