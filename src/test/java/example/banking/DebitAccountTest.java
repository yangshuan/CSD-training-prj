package example.banking;

import org.junit.Test;

import static org.junit.Assert.*;

public class DebitAccountTest {
    @Test
    public void openDebitAccountIsNotNull() throws Exception {
        assertNotNull(Account.openDebitAccount());
    }

    @Test
    public void withdraw60FromDebitAccountAfterDeposit100ThenRemaiding40() throws Exception {
        Account account = Account.openDebitAccount();
        account.deposit(100);
        account.withdraw(60);

        assertEquals(40, account.getBalance());
    }

    @Test
    public void withdraw60FromDebitAccountAfterDeposit50ThenInsufficientFunds() throws Exception {
        Account account = Account.openDebitAccount();
        account.deposit(50);
        try {
            account.withdraw(60);
        } catch (Exception e) {
            assertEquals(InsufficientFundsException.class, e.getClass());
        }

        assertEquals(50, account.getBalance());
    }
}