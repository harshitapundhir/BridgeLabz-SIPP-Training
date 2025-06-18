
import java.util.Scanner;

public class LowercaseConversionDemo {

    public static String convertToLowercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result += c;
        }
        return result;
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String lowerUsingCharAt = convertToLowercaseUsingCharAt(text);
        String lowerUsingBuiltIn = text.toLowerCase();

        boolean areEqual = compareStringsUsingCharAt(lowerUsingCharAt, lowerUsingBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerUsingCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerUsingBuiltIn);
        System.out.println("Are both lowercase texts equal? " + areEqual);
    }
}
