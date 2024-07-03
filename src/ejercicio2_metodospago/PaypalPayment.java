package ejercicio2_metodospago;

public class PaypalPayment implements PaymentMethod{

    @Override
    public String processPayment() {
        return "paypal";
    }
}
