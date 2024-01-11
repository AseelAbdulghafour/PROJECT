import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.date = new Date(); // Current date and time
        this.type = type;
        this.amount = amount;
    }

    public Transaction(java.sql.Date date2, String string, double amount2) {
    }

    public Transaction(Date date2, String string, double amount2) {
    }

    public Date getDate() {
        return new Date(date.getTime()); // Returning a copy to avoid external modification
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}