import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class employee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ft = new FullTimeEmployee(1, "Harshita", 20000, 5000);
        ft.assignDepartment("HR");

        PartTimeEmployee pt = new PartTimeEmployee(2, "Ravi", 5000, 20, 300);
        pt.assignDepartment("Support");

        employees.add(ft);
        employees.add(pt);

        for (Employee e : employees) {
            e.displayDetails();
            if (e instanceof Department) {
                Department d = (Department) e;
                System.out.println("Department: " + d.getDepartmentDetails());
            }
            System.out.println("-----");
        }
    }
}
