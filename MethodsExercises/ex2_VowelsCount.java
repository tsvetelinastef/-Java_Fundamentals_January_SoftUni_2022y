package MethodsExercises;

import java.util.Scanner;

public class ex2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(getVowelsCount(word));

    }

    public static int getVowelsCount(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            //Checks whether a character is a vowel
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ||
                    word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                //Increments the vowel counter
                count++;
            }

        }

        return count;

    }


}
