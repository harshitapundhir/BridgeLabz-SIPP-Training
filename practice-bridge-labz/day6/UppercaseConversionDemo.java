import java.util.Scanner;

public class UppercaseConversionDemo {

    public static String convertToUppercaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
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

        String upperUsingCharAt = convertToUppercaseUsingCharAt(text);
        String upperUsingBuiltIn = text.toUpperCase();

        boolean areEqual = compareStringsUsingCharAt(upperUsingCharAt, upperUsingBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperUsingCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperUsingBuiltIn);
        System.out.println("Are both uppercase texts equal? " + areEqual);
    }
}

