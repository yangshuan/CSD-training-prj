package example.banking;

import java.net.ConnectException;

public class CreditAccount extends Account {
    private IAssessmentService service;
    private String socialSecurityNumber;

    public CreditAccount(IAssessmentService service, String socialSecurityNumber) {
        this.service = service;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    protected boolean hasSufficientBalance(long amount) {
        try {
            return getBalance() + service.getCredit(socialSecurityNumber) >= amount;
        } catch (ConnectException e) {
            e.printStackTrace();
            return false;
        }
    }
}
