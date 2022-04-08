public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 3.5;
        double cappucinoPrice = 4.5;
        int MochaPrice = 4;
        int DripCoffeePrice = 3;
        double LattePrice = 2.5;
        int CappucinoPrice = 4;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Print status message based on order status.
        System.out.println(customer1 + pendingMessage);
        System.out.println(displayTotalMessage + dripCoffeePrice);
        // Noah ordered a cappucino 
        if(isReadyOrder2) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        // Sam ordered 2 lattes. Display their total. Use if statement.
        System.out.println(displayTotalMessage + lattePrice*2);
        if (isReadyOrder1) {
            System.out.println(customer2 + pendingMessage);
        }
        else {
            System.out.println(customer2 + readyMessage);
        } 
        // Jimmy was charged for a coffee but ordered a latte. Print total message with new total
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));
    } 
}