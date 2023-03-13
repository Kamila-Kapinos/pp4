package pl.kkapinos.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal balance;
    public CreditCard(String cardNumber) {
    }

    public void assignLimit(BigDecimal creditAmount) {
        if (isBelowThreshold(creditAmount)) {
            throw new CreditLimitBelowThresholdException();
        }
        this.balance = creditAmount;
    }

    private static boolean isBelowThreshold(BigDecimal creditAmount) {
        return creditAmount.compareTo(BigDecimal.valueOf(100)) < 0;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
