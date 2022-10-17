import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    DebitCard debitCard;

    @Before
    public void before(){
        wallet = new Wallet();
        debitCard = new DebitCard("21212", 101010, "1111111", "12/22", 354);
    }

    @Test
    public void can_add_new_payment_method(){
        wallet.addPaymentMethod("Nationwide DC", debitCard);
        assertEquals(debitCard, wallet.getPaymentMethods().get("Nationwide DC"));
    }

    @Test
    public void can_set_payment_method(){
        wallet.addPaymentMethod("Nationwide DC", debitCard);
        wallet.setSelectedPaymentMethod("Nationwide DC");
        assertEquals(debitCard, wallet.getSelectedPaymentMethod());
    }

    @Test
    public void can_charge_payment_method(){
        wallet.addPaymentMethod("Nationwide DC", debitCard);
        wallet.setSelectedPaymentMethod("Nationwide DC");
        wallet.pay(100);
        PaymentCard paymentCard = (PaymentCard) debitCard;
        assertEquals(100, paymentCard.getTransactions().get(0), 0.01);
    }



}
