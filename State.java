// This class is the template for all the states.
// It has a method that calculates the tax and a method that returns the state name.
public abstract class State {
    // Each state has its own tax strategy so this is used to calculate the tax.
    protected TaxStrategy taxStrategy;

    // This calculates the tax based on the tax strategy.
    public double calculateTax(double saleAmount) {
        return taxStrategy.calculateTax(saleAmount);
    }

    // Tells us the name of the state.
    public abstract String getStateName();

}
