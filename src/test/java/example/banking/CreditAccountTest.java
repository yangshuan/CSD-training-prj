package example.banking;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreditAccountTest {
    private static final String socialSecurityNumber = "socialSecurityNumber";
    private IAssessmentService assessmentService;

    @Before
    public void setUp() throws Exception {
        assessmentService = mock(IAssessmentService.class);
    }

    @Test
    public void openCreditAccountIsNotNull() throws Exception {
        assertNotNull(Account.openCreditAccount(assessmentService, socialSecurityNumber));
    }

    @Test
    public void withdraw60FromCreditAccountAfterDeposit100ThenRemaiding40() throws Exception {
        when(assessmentService.getCredit(socialSecurityNumber)).thenReturn(10L);

        Account account = Account.openCreditAccount(assessmentService, socialSecurityNumber);
        account.deposit(100);
        account.withdraw(60);

        assertEquals(40, account.getBalance());
    }

    @Test
    public void withdraw60FromCreditAccountAfterDepositMoreThanCreditThenInsufficientFundsException() throws Exception {
        when(assessmentService.getCredit(socialSecurityNumber)).thenReturn(10L);

        Account account = Account.openCreditAccount(assessmentService, socialSecurityNumber);
        try {
            account.withdraw(10060);
        } catch (Exception e) {
            assertEquals(InsufficientFundsException.class, e.getClass());
        }

        assertEquals(0, account.getBalance());
    }

    @Test
    public void withdraw60FromCreditAccountAfterDeposit50ThenRemaidingMinusValue() throws Exception {
        when(assessmentService.getCredit(socialSecurityNumber)).thenReturn(10L);

        Account account = Account.openCreditAccount(assessmentService, socialSecurityNumber);
        account.deposit(50);
        account.withdraw(60);

        assertEquals(-10, account.getBalance());
    }
}