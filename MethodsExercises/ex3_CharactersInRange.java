package MethodsExercises;

import java.util.Scanner;

public class ex3_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char wordOne = scanner.next().charAt(0);
        char wordTwo = scanner.next().charAt(0);

        printCharacterInRange(wordOne, wordTwo);
    }

    public static void printCharacterInRange(char wordOne, char wordTwo) {
        if (wordOne > wordTwo) {
            char temp = wordOne;
            wordOne = wordTwo;
            wordTwo = temp;
        }
        for (int i = wordOne + 1; i < wordTwo; i++) {
            System.out.printf("%c ", i);
        }
    }
}






  //  public static void getCharactersInRage(char wordOne, char wordTwo) {

    //    for (char a = (char) Math.min(wordOne, wordTwo); a < Math.max(wordOne, wordTwo) - 1; a++) {
    //       System.out.printf("%c ", a + 1);
    //    }

    //    for (int i = wordOne + 1; i < wordTwo; i++) {
    //        System.out.print((char) i + " ");
    //    }
    //}
//}

/*
 for (int i = wordOne; i <= wordTwo; i++) {
            System.out.println((char) i);
        }
 */