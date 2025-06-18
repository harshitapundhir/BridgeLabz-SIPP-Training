
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Name at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.print("Enter index to access: ");
        int index = sc.nextInt();


        handleException(names, index);
    }
}
