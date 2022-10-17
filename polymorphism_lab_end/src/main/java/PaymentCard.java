import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {
    private String cardNumber;
    private String expiryDate;
    private int securityNumber;
    private ArrayList<Double> transactions;

    public PaymentCard(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactions = new ArrayList<Double>();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

    public void charge(double purchaseAmount) {
        this.transactions.add(purchaseAmount);
    }
}
