package selling_cars;

public class Dealership {

    public static void main(String[] args) {

        Customer cust = new Customer("Vladimir", 62000);
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 60000);
        Employee emp = new Employee();

        boolean finance;
        finance = cust.getBudget() < vehicle.getPrice();

        emp.purchaseCar(vehicle, cust, finance);
    }
}
