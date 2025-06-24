package oops.Constructor;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(1001, "HR", 55000);
        mgr.showDetails();
        System.out.println("Salary: " + mgr.getSalary());
    }
}
