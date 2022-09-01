package TextProcessing_LAB;

import java.util.Scanner;

public class ex1_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word;
        while (!"end".equals(word = scanner.nextLine())) {
          //  String word = scanner.nextLine();
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }

            System.out.printf("%s = %s%n", word, reverseWord);
            // System.out.println(reverseWord);
        }

    }
}

