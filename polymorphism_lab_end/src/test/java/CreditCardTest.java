import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    private CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard("1111222233334444", "12/23", 234,  1000);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals("1111222233334444", creditCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("12/23", creditCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(234, creditCard.getSecurityNumber());
    }

    @Test
    public void cardIsChargedAndChargeIsLogged() {
        creditCard.charge(100);
        assertEquals(899, creditCard.getAvailableCredit(), 0.01);
        assertEquals(101, creditCard.getTransactions().get(0), 0.01);
    }

}
