package OOPS.INHERITANCE;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println(name + " is a Staff member in " + department);
    }
}

public class SchoolSystem_Roles {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Smith", 40, "Math");
        Student s = new Student("Alice", 15, "10th");
        Staff st = new Staff("Mrs. Green", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
