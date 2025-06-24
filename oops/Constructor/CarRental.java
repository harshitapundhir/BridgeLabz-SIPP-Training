package oops.Constructor;


public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Sedan";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Alice", "SUV", 4);
        System.out.println("Total cost: " + rental.calculateTotalCost());
    }
}
