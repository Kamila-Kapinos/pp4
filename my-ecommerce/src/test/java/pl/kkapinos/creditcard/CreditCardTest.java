package pl.kkapinos.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class CreditCardTest {

    @Test
    void itAllowsToAssignCredit() {
        //Arrange
        CreditCard card = new CreditCard("1234-4567");
        //Act
        card.assignLimit(BigDecimal.valueOf(1000));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card.getBalance());
    }

    @Test
    void itAllowsToAssignDifferentCreditLimits() {
        //Arrange
        CreditCard card1 = new CreditCard("1234-4567");
        CreditCard card2 = new CreditCard("1234-49067");

        //Act
        card1.assignLimit(BigDecimal.valueOf(1000));
        card2.assignLimit(BigDecimal.valueOf(1100));
        //Assert
        assertEquals(BigDecimal.valueOf(1000), card1.getBalance());
        assertEquals(BigDecimal.valueOf(1000), card2.getBalance());

    }

    @Test
    void itCantAssignLimitBelowCertainThreshold() {
        CreditCard card1 = new CreditCard("1234-4567");

        try {
            card1.assignLimit(BigDecimal.valueOf(10));
            fail("Should throw exception");
        } catch (CreditLimitBelowThresholdException e) {
            assertTrue(true);
        }

        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignLimit(BigDecimal.valueOf(10)));

        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignLimit(BigDecimal.valueOf(99)));

        assertDoesNotThrow(
                () -> card1.assignLimit(BigDecimal.valueOf(100)));
    }

    @Test
    void checkDoublesAndFloats() {
        double x1 = 0.01;
        double x2 = 0.03;
        double xresult = x2-x1;

        float y1 = 0.01f;
        float y2 = 0.03f;
        float yresult = y2-y1;

    }
}
