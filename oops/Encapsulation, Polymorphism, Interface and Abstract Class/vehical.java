import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return 1500;
    }

    public String getInsuranceDetails() {
        return "Car Policy #" + policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Bike Policy #" + policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000;
    }

    public double calculateInsurance() {
        return 2500;
    }

    public String getInsuranceDetails() {
        return "Truck Policy #" + policyNumber;
    }
}

public class vehical {
    public static void displayRentalDetails(List<Vehicle> vehicles, int days) {
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println("Insurance: " + i.calculateInsurance());
                System.out.println("Details: " + i.getInsuranceDetails());
            }
            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("C123", 1200, "CAR-001"));
        vehicleList.add(new Bike("B456", 500, "BIKE-002"));
        vehicleList.add(new Truck("T789", 3000, "TRUCK-003"));

        displayRentalDetails(vehicleList, 5);
    }
}
