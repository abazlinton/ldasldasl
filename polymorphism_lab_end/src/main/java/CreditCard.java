public class CreditCard extends PaymentCard {
    private double availableCredit;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber,  double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double purchaseAmount) {
        double finalAmount = purchaseAmount * 1.01;
        this.availableCredit -= finalAmount;
        super.charge(finalAmount);
    }
}
