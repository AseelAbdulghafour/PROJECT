

public class App {
    public static void main(String[] args) {

        // BANK ACC:
        BankAccount myAccount = new BankAccount((987654321), 2.0);
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        myAccount.deposit(200);

        // myAccount.displaytransactionHistory();
        System.out.println("Current Balance : $" + myAccount.getbalance());

        // My acc - user
        // BankAccount myAccount = new BankAccount("987654321");
        User myUser = new User("aseel", "password123", myAccount);
        System.out.println("Username:" + myUser.getUsername());
        System.out.println("Current Balnce: $" + myUser.getAccount().getbalance());

        // channing the password - using hashing and secure
        myUser.setPassword("newPassword123");

        // Transacrion
        Transaction depositTransaction = new Transaction("Deposit", 1000);
        Transaction withdrawalTransaction = new Transaction("Withdrawl", 500);
        System.out.println("Date: " + depositTransaction.getDate());
        System.out.println("Type: " + withdrawalTransaction.getType());
        System.out.println("Amount: $" + depositTransaction.getAmount());

        // BankSingleton:
        BankSingleton bank = BankSingleton.getInstance();
        BankAccount account1 = new BankAccount(123, 69.0);
        User user1 = new User("fatma", "password1", account1);

        BankAccount account2 = new BankAccount(456, 2.0);
        User user2 = new User("razan", "password2", account2);
        bank.addUser(user1);
        bank.addUser(user2);

        User retrievedUser = bank.getUser("fatma");
        if (retrievedUser != null) {
            System.out.println("User found : " + retrievedUser.getUsername());
        } else {
            System.out.println("User not found please try again ");
        }
    }
}

