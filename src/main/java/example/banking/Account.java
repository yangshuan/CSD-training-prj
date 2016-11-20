package example.banking;

public class Account {
    private static IAssessmentService service = new IAssessmentService.AssessmentService();

    private long balance;

    public static Account openDebitAccount() {
        return new DebitAccount();
    }

    public static Account openAccount() {
        return new Account();
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        if (!hasSufficientBalance(amount)) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    protected boolean hasSufficientBalance(long amount) {
        return true;
    }
}
