// The main program that figures out the tax based on the state and sale amount.
public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Makes sure the user enters the correct number of arguments <state> <saleAmount>.
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <saleAmount>");
            return;
        }
        // Gets the state name and sale amount from the command line arguments.
        // Makes it lowercase so it is not case-sensitive.
        String stateName = args[0].trim().toLowerCase();
        // gets the sale amount and removes any commas.
        String saleAmountSign = args[1].trim();

        // Converts the sale amount to a double.
        double saleAmount;
        try {
            saleAmount = Double.parseDouble(saleAmountSign.replaceAll(",", ""));
        } catch (NumberFormatException e) {
            // If it is not a number, it will print an error message and return.
            System.out.println("Invalid sale amount");
            return;
        }

        // figures out which state to use based on the state name.
        State state;
        switch (stateName) {
            case "indiana":
                // If the state is Indiana, it will use the Indiana class.
                state = new Indiana();
                break;
            case "alaska":
                // If the state is Alaska, it will use the Alaska class.
                state = new Alaska();
                break;
            case "hawaii":
                // If the state is Hawaii, it will use the Hawaii class.
                state = new Hawaii();
                break;
            default:
                // If the state is not Indiana, Alaska, or Hawaii, it will print an error message and return.
                System.out.println("Invalid state");
                return;
        }

        // Calculates the tax based on the state and sale amount and will show the result.
        double tax = state.calculateTax(saleAmount);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", saleAmount, state.getStateName(), tax);
    }
}