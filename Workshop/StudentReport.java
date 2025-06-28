package Workshop;

import java.util.*;

class InvalidMarkException extends Exception {
 public InvalidMarkException(String message) {
     super(message);
 }
}

class Student {
 String name;
 String[] subjects;
 int[] marks;

 public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
     this.name = name;
     this.subjects = subjects;
     this.marks = marks;
     validateMarks();
 }

 private void validateMarks() throws InvalidMarkException {
     for (int mark : marks) {
         if (mark < 0 || mark > 100) {
             throw new InvalidMarkException("Invalid mark found: " + mark);
         }
     }
 }

 public double getAverage() {
     int sum = 0;
     for (int mark : marks) {
         sum += mark;
     }
     return (double) sum / marks.length;
 }

 public String getGrade() {
     double avg = getAverage();
     if (avg >= 90) return "A+";
     else if (avg >= 80) return "A";
     else if (avg >= 70) return "B";
     else if (avg >= 60) return "C";
     else if (avg >= 50) return "D";
     else return "F";
 }

 public void displayReport() {
     System.out.println("--------- Report Card ---------");
     System.out.println("Student Name: " + name);
     System.out.println("Subjects and Marks:");
     for (int i = 0; i < subjects.length; i++) {
         System.out.printf("%-15s : %3d\n", subjects[i], marks[i]);
     }
     System.out.printf("Average Marks    : %.2f\n", getAverage());
     System.out.println("Grade            : " + getGrade());
     System.out.println("--------------------------------\n");
 }
}

public class StudentReport {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     List<Student> studentList = new ArrayList<>();

     System.out.print("Enter number of students: ");
     int numStudents = sc.nextInt();
     sc.nextLine();

     for (int s = 0; s < numStudents; s++) {
         try {
             System.out.print("\nEnter student name: ");
             String name = sc.nextLine();

             System.out.print("Enter number of subjects: ");
             int numSubjects = sc.nextInt();
             sc.nextLine(); // Consume newline

             String[] subjects = new String[numSubjects];
             int[] marks = new int[numSubjects];

             for (int i = 0; i < numSubjects; i++) {
                 System.out.print("Enter subject name: ");
                 subjects[i] = sc.nextLine();

                 System.out.print("Enter marks for " + subjects[i] + ": ");
                 marks[i] = sc.nextInt();
                 sc.nextLine();
             }

             Student student = new Student(name, subjects, marks);
             studentList.add(student);

         } catch (InvalidMarkException e) {
             System.out.println("Error: " + e.getMessage());
             s--;
         }
     }

     for (Student student : studentList) {
         student.displayReport();
     }

     sc.close();
 }
}
