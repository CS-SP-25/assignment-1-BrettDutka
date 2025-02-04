// This class is for 7% tax which is in the state of Indiana
public class SevenPercent implements TaxStrategy {
    @Override
    public double calculateTax(double saleAmount) {
        return saleAmount * 0.07; // Multiplies by 0.07 to get 7% tax.
    }
}
