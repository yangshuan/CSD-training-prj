package example.banking;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void openAccountIsNotNull() throws Exception {
        assertNotNull(Account.openAccount());
    }

    @Test
    public void balanceIs100AfterDeposit100() throws Exception {
        Account account = Account.openAccount();
        account.deposit(100);

        assertEquals(100, account.getBalance());
    }

    @Test
    public void withdraw60FromAccountAfterDeposit100ThenRemaiding40() throws Exception {
        Account account = Account.openAccount();
        account.deposit(100);
        account.withdraw(60);

        assertEquals(40, account.getBalance());
    }

    @Test
    public void withdraw60FromAccountAfterDeposit50ThenRemaidingMinus10() throws Exception {
        Account account = Account.openAccount();
        account.deposit(50);
        account.withdraw(60);

        assertEquals(-10, account.getBalance());
    }
}