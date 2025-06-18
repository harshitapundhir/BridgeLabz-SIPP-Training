import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text, int start, int end) {
        String result = text.substring(start, end);
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text, int start, int end) {
        try {
            String result = text.substring(start, end);
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Uncomment to see uncaught exception
        // generateException(text, end, start);

        handleException(text, end, start);
    }
}

