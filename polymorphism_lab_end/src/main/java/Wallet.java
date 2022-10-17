import java.util.HashMap;

public class Wallet {

    private HashMap<String, IChargeable> paymentMethods;
    private String selectedPaymentMethodName;

    public Wallet() {
        this.paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, IChargeable paymentMethod) {
        paymentMethods.put(name, paymentMethod);
    }

    public HashMap<String, IChargeable> getPaymentMethods() {
        return paymentMethods;
    }

    public IChargeable getSelectedPaymentMethod() {
        return this.paymentMethods.get(this.selectedPaymentMethodName);
    }

    public void setSelectedPaymentMethod(String name){
        this.selectedPaymentMethodName = name;
    }
    public void pay(double purchaseAmount) {
        this.paymentMethods.get(this.selectedPaymentMethodName).charge(purchaseAmount);
    }
}
