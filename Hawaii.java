// Purpose: This file creates the Hawaii class which is a subclass of the State class.
// It sets the tax strategy to FourPointFivePercent and returns the state name.
public class Hawaii extends State{
    // New Hawaii has 4.5% tax
    public Hawaii() {
        this.taxStrategy = new FourPointFivePercent();
    }

    // Tells us it is Hawaii
    @Override
    public String getStateName() {
        return "Hawaii";
    }
}
