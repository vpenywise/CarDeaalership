package selling_cars;

public class Employee {

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if(finance == true) {
            double moneyNeeded = vehicle.getPrice() - cust.getBudget();
            runCreditCheck(cust, moneyNeeded);
        } else if (vehicle.getPrice() <= cust.getBudget()) {
            processTransaction(cust, vehicle);
        } else {
            System.out.println("The customer will need more money to buy a " + vehicle);
        }
    }

    public void runCreditCheck(Customer cust, double moneyNeeded) {
        System.out.println("Credit check passed!");
        System.out.println("The Customer has been approved for the loan of " + moneyNeeded);
    }

    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("The Customer bought the car " + vehicle + " for " + vehicle.getPrice());
    }
}

