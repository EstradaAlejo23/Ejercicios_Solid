package ejercicio6_taxcalculator;

public class TaxCalculator {
    private TaxStrategy usaTaxStrategy = new USATaxStrategy();
    private TaxStrategy ukTaxStrategy = new UKTaxStrategy();

    public double calculateTax(String country) {
        if (country.equals("USA")) {
            // Lógica para calcular el impuesto en USA
            return this.usaTaxStrategy.calculateTax();
        } else if (country.equals("UK")) {
            // Lógica para calcular el impuesto en UK
            return this.ukTaxStrategy.calculateTax();
        }
        return 0;
    }
}
