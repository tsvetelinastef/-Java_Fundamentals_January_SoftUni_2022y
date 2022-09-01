package MethodsExercises;

import java.util.Scanner;

public class ex9_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            checkForPalindrome(input);
            input = scanner.nextLine();
        }
    }

    private static void checkForPalindrome(String input) {

        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();
        if (input.contentEquals(reverseInput)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
