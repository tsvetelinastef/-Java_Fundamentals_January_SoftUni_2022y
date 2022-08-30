package BasicSyntax_MoreExercise;

import java.util.Scanner;

public class ex2_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] name = new String[]{"zero", "one", "two", "three",
                "four", "five", "six", "seven", "eight", "nine"};

        System.out.println(name[number % 10]);


    }

}

// int lastDigit = 0;
// lastDigit = number % 10;
// System.out.println(lastDigit);

