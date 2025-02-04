// This tells the tax calculators what method to use to calculate the tax.
// The tax calculators implement this interface.
public interface TaxStrategy {
    double calculateTax(double saleAmount);
}
