package ejercicio2_metodospago;

public class PaymentProcessor{

    public void processPayment(String paymentType) {
        if (paymentType.equals("credit")) {
            // Lógica para procesar el pago con tarjeta de crédito
            PaymentMethod creditCardPayment = new CreditCardPayment();
            creditCardPayment.processPayment();
        } else if (paymentType.equals("paypal")) {
            // Lógica para procesar el pago con PayPal
            PaymentMethod paypalPayment = new PaypalPayment();
            paypalPayment.processPayment();
        }
    }
}
