
import java.util.Scanner;

public class chocolatedivider {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int[] result = new int[2];
        result[0] = chocolates / children;  // quotient
        result[1] = chocolates % children;  // remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if (children == 0) {
            System.out.println("Cannot divide by zero children.");
            return;
        }

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
