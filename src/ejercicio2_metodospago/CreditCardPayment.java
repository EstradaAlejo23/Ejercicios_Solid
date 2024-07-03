package ejercicio2_metodospago;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public String processPayment() {
        return "credit";
    }
}
