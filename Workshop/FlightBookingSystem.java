import java.util.*;

class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private double price;

    public Flight(String flightNumber, String source, String destination, double price) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public void displayFlight() {
        System.out.println("Flight No: " + flightNumber +
                ", From: " + source +
                ", To: " + destination +
                ", Price: $" + price);
    }
}

class Booking {
    private String passengerName;
    private Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    public void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        flight.displayFlight();
    }
}

public class FlightBookingSystem{
    private Flight[] availableFlights;
    private List<Booking> bookings;

    public FlightBookingSystem(Flight[] flights) {
        this.availableFlights = flights;
        this.bookings = new ArrayList<>();
    }

    public void searchFlights(String source, String destination) {
        boolean found = false;
        System.out.println("Searching for flights from " + source + " to " + destination + "...");
        for (Flight flight : availableFlights) {
            if (flight.getSource().equalsIgnoreCase(source) &&
                flight.getDestination().equalsIgnoreCase(destination)) {
                flight.displayFlight();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    public void bookFlight(String passengerName, String flightNumber) {
        Flight selectedFlight = null;
        for (Flight flight : availableFlights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                selectedFlight = flight;
                break;
            }
        }
        if (selectedFlight != null) {
            Booking booking = new Booking(passengerName, selectedFlight);
            bookings.add(booking);
            System.out.println("Booking successful for " + passengerName + " on flight " + flightNumber);
        } else {
            System.out.println("Flight number " + flightNumber + " not found.");
        }
    }

    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }
        System.out.println("All Bookings:");
        for (Booking booking : bookings) {
            booking.displayBooking();
            System.out.println("-------------------");
        }
    }

    public static void main(String[] args) {
        Flight[] flights = new Flight[]{
                new Flight("AI101", "Delhi", "Mumbai", 5500),
                new Flight("AI102", "Delhi", "Bangalore", 7200),
                new Flight("AI103", "Mumbai", "Chennai", 6300),
                new Flight("AI104", "Bangalore", "Delhi", 6800)
        };

        FlightBookingSystem system = new FlightBookingSystem(flights);
        system.searchFlights("Delhi", "Mumbai");

        system.bookFlight("Alice", "AI101");

        system.bookFlight("Bob", "AI999");

        system.displayAllBookings();
    }
}