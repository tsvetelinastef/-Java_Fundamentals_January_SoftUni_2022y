package MethodsLAB;

import java.util.Scanner;

public class ex10_MultiplyEvensByOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(num));
    }

    private static int getMultipleOfEvensAndOdds(int num) {
        int evensSum = getSumOfEven(num);
        int odsSum = getSumOfOdd(num);
        return evensSum * odsSum;
    }

    private static int getSumOfOdd(int num) {
        int odsSum = 0;
        while (num > 0) {
            int count = num % 10;
            if (count % 2 != 0) {
                odsSum += count;
            }
            num /= 10;
        }
        return odsSum;
    }

    private static int getSumOfEven(int num) {
        int evensSum = 0;
        while (num > 0) {
            int count = num % 10;
            if (count % 2 == 0) {
                evensSum += count;
            }
            num /= 10;
        }
        return evensSum;
    }
}