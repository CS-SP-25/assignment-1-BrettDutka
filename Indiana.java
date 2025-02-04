// This is the Indiana.java file. It is the Indiana state class that extends the State class.
// It has a constructor that sets the taxStrategy to SevenPercent.
// It also has a getStateName method that returns the state name as "Indiana".
public class Indiana extends State{
    // When you make a new Indiana it will get the 7% tax
    public Indiana() {
        this.taxStrategy = new SevenPercent();
    }

    // Tells us it is Indiana
    @Override
    public String getStateName() {
        return "Indiana";
    }
}
