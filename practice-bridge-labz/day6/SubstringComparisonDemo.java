
import java.util.Scanner;

public class SubstringComparisonDemo {

    
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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

     
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);

        
        String substringUsingSubstringMethod = text.substring(start, end);

        
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingSubstringMethod);

    
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring() method: " + substringUsingSubstringMethod);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
