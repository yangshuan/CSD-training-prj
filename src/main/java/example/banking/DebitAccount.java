package example.banking;

public class DebitAccount extends Account {
    @Override
    protected boolean hasSufficientBalance(long amount) {
        return getBalance() > amount;
    }
}
