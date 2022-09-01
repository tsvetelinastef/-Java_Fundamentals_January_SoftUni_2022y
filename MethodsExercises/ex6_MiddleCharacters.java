package MethodsExercises;

import java.util.Scanner;

public class ex6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(getMiddleCharacters(word));
    }

    public static String getMiddleCharacters(String word) {

        int position;
        int length;
        if (word.length() % 2 == 0)
        {
            position = word.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }

}

//  int len = word.length();
//  int middle = len / 2;

//  System.out.println(word.charAt(middle));