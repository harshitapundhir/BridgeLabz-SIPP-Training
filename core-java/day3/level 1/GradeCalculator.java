import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks in Mathematics: ");
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Percentage: " + average);

        if (average >= 80)
            System.out.println("Grade: A | Remarks: Level 4,above agency-normalized standards");
        else if (average >= 70 && average <=79)
            System.out.println("Grade: B | Remarks: Level 3,at agency-normalized standards");
        else if (average >= 60 && average <=69)
            System.out.println("Grade: C | Remarks: Level 2,below,but approaching agency-normalized standards");
        else if (average >= 50 && average <=59)
            System.out.println("Grade: D | Remarks: Level 1,well below agency-normalized standards");
        else if( average >= 40 && average <=49)
            System.out.println("Grade: F | Remarks: Level 1-,too below agency-normalized standards");
        else{
            System.out.println("Grade: F | Remarks: remedial standards");
        }
        input.close();
    }
}

