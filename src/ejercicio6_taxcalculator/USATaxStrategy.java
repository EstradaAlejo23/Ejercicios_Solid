package ejercicio6_taxcalculator;

public class USATaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax() {
        return 0.1;
    }
}
