
import java.util.Scanner;

public class TextWordAnalysisDemo {

    public static String[] splitWordsUsingCharAt(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (!word.equals("")) {
                    words[wordCount++] = word;
                    word = "";
                }
            } else {
                word += c;
            }
        }
        if (!word.equals("")) {
            words[wordCount++] = word;
        }
        String[] finalWords = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            finalWords[i] = words[i];
        }
        return finalWords;
    }

    public static int getStringLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }
        return length;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordLengthArr) {
        int minLength = Integer.parseInt(wordLengthArr[0][1]);
        int maxLength = Integer.parseInt(wordLengthArr[0][1]);
        int[] result = new int[2];
        for (int i = 1; i < wordLengthArr.length; i++) {
            int len = Integer.parseInt(wordLengthArr[i][1]);
            if (len < minLength) {
                minLength = len;
            }
            if (len > maxLength) {
                maxLength = len;
            }
        }
        result[0] = minLength;
        result[1] = maxLength;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitWordsUsingCharAt(text);
        String[][] wordLengthArr = getWordsAndLengths(words);
        int[] result = findShortestAndLongest(wordLengthArr);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}
