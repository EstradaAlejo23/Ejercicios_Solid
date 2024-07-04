package ejercicio6_taxcalculator;

public class UKTaxStrategy implements TaxStrategy{

    @Override
    public double calculateTax() {
        return 0.2;
    }
}
