package MethodsLAB;

import java.util.Scanner;

public class ex7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWords = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        newWords(firstWords, number);

    }

    public static String newWords(String firstWords, int number) {
        String result= "" ;
        for (int i = 0; i < number; i++) {
            String last = firstWords.concat(result);
            System.out.print(last);
        }
        return firstWords.concat(result);
    }
}
