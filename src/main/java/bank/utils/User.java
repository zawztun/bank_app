package bank.utils;

public class User {

  private long id;

  private String name;
  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String email;

  private long account_number;

  private long account_balance;

  public User(int id, String name, String email,String password, long account_number, long account_balance) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.account_number = account_number;
    this.account_balance = account_balance;
  }

  public User() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getAccount_number() {
    return account_number;
  }

  public void setAccount_number(long account_number) {
    this.account_number = account_number;
  }

  public long getAccount_balance() {
    return account_balance;
  }

  public void setAccount_balance(long account_balance) {
    this.account_balance = account_balance;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", account_number=" + account_number +
            ", account_balance=" + account_balance +
            '}';
  }
}
