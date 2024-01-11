

public class User {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    private BankAccount account;

    public User(String username, String password, BankAccount account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public BankAccount getAccount() {
        return account;
    }

    // public String getPassword() {
    // return password;
    // }

    public void setPassword(String password) {
        this.password = password;

        // if (isValidPassword(password)) {
        // this.password = password;
        // } else {
        // System.out.println("INVALID PASSWORD \n Passowrd not changed");
        // }

    }

    // private boolean isValidPassword(String password2) {
    // return false;
    // }
}