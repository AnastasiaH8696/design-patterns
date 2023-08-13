import com.observer.example.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, 111111, "Test", "Test");
        account.deposit(120000);
        account.withdraw(5000);
    }
}