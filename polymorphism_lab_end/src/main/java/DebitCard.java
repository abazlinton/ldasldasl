public class DebitCard extends PaymentCard {
    private int sortCode;
    private String accountNumber;

    public DebitCard(String cardNumber, int sortCode, String accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

}
