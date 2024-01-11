
import java.util.HashMap;
import java.util.Map;

public class BankSingleton {
    private static BankSingleton instance;
    private Map<String, User> userAccountMap;

    public BankSingleton(Map<String, User> userAccountMap) {
        this.userAccountMap = userAccountMap;
    }

    private BankSingleton() {
        userAccountMap = new HashMap<>();

    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public void addUser(User user) {
        if (user != null && user.getUsername() != null) {
            userAccountMap.put(user.getUsername(), user);
        }
    }

    public User getUser(String username) {
        return userAccountMap.get(username);

    }

}

// public boolean authenticateUser(String username, String password) {
// // Implement username/password validation mechanism
// return userAccountMap.stream()
// .anyMatch(user -> user.getUsername().equals(username) &&
// user.getPassword().equals(password));
// }

// public void createBankAccount(String username, String password) {
// // Ensure uniqueness of usernames before creating an account
// if (users.stream().noneMatch(user -> user.getUsername().equals(username))) {
// BankAccount account = new BankAccount(generateAccountNumber());
// users.add(new User(username, password, account));
// } else {
// System.out.println("Username already exists. Please choose a different
// username.");
// }
// }

// private String generateAccountNumber() {
// // Implement a method to generate a unique account number
// return "ACCT" + System.currentTimeMillis();
// }

// public void displayAccountDetails(String username) {
// // Implement a method to display account details for a signed-in user
// User user = users.stream().filter(u ->
// u.getUsername().equals(username)).findFirst().orElse(null);
// if (user != null) {
// BankAccount account = user.getAccount();
// // Display account details

// } else {
// System.out.println("User not found.");
// }
// }
