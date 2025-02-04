// This class is for no tax which is in the state of Alaska.
public class NoTax implements TaxStrategy{
    @Override
    public double calculateTax(double saleAmount) {
        return 0; // returns 0 since there is no tax in Alaska.
    }
}
