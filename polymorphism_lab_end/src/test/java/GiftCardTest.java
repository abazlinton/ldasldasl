import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    private GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard( 1000);
    }


    @Test
    public void canChargeCard() {
        giftCard.charge(100);
        assertEquals(900, giftCard.getBalance(), 0.01);
    }



}


