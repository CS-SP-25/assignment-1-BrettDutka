// Purpose: This class is a subclass of State and represents the state of Alaska.
// It sets the tax strategy to NoTax.
public class Alaska extends State{
    // New Alaska has no tax
    public Alaska() {
        this.taxStrategy = new NoTax();
    }

    // Tells us it is Alaska
    @Override
    public String getStateName() {
        return "Alaska";
    }
}
