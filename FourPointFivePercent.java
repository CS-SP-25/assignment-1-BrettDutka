// This class is for 4.5% tax which is in the state of Hawaii
public class FourPointFivePercent implements TaxStrategy {
    @Override
    public double calculateTax(double saleAmount) {
        return saleAmount * 0.045; // Multiplies by 0.045 to get 4.5% tax.
    }
}
