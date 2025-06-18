
import java.util.Scanner;

public class TextSplitWithLengthDemo {

    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }
        return length;
    }

    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] indexes = new int[spaceCount + 2];
        indexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                indexes[idx++] = i;
            }
        }
        indexes[idx] = length;

        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < spaceCount + 1; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void displayResult(String[][] wordLengthArr) {
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthArr.length; i++) {
            int length = Integer.parseInt(wordLengthArr[i][1]);
            System.out.println(wordLengthArr[i][0] + "\t" + length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] wordLengthArr = getWordsAndLengths(words);
        displayResult(wordLengthArr);
    }
}
