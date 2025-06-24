package oops.Constructor;

public class Circles {
    double radius;

   
    Circles() {
        this(1.0);  
    }

    
    Circles(double r) {
        radius = r;
    }

    
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display radius and area
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Circles c1 = new Circles();          // Uses default constructor
        Circles c2 = new Circles(5.5);       // Uses parameterized constructor

        System.out.println("Default Circle:");
        c1.display();

        System.out.println("-------------");

        System.out.println("Custom Circle:");
        c2.display();
    }
}
