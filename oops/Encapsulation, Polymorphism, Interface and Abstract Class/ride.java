import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleDetails() {
        return "ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: ₹" + ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class ride{
    public static void processRides(List<Vehicle> rides, double distance) {
        for (Vehicle v : rides) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS g = (GPS) v;
                g.updateLocation("Sector 12");
                System.out.println("Updated Location: " + g.getCurrentLocation());
            }

            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("CAR001", "Raj", 12.5));
        rides.add(new Bike("BIKE002", "Aman", 7.0));
        rides.add(new Auto("AUTO003", "Deepak", 9.5));

        processRides(rides, 10);
    }
}
