import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int i = 0;
        for(int sum = 1; sum <= 10; sum++){
            i += sum;
        }
        System.out.println("sum = " + i);
        return i;
    }
    public double getOrderTotal(double[] itemPrices) {
        double sum = 0;
        for(double price : itemPrices) {
            sum += price;
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people in front of you", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}

