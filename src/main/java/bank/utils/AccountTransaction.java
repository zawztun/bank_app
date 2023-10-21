package bank.utils;

public class AccountTransaction {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
    private String type;
    private double amount;

    private String password;

    public AccountTransaction() {
    }

    public AccountTransaction(String email, String type, double amount, String password) {
        this.email = email;
        this.type = type;
        this.amount = amount;
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Transactiion{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", password='" + password + '\'' +
                '}';
    }
}
