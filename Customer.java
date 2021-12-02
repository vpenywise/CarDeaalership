package selling_cars;

public class Customer {

    private String name;
    private double budget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        emp.handleCustomer(this, finance, vehicle);
    }
}

