package MethodsLAB;

import java.util.Scanner;

public class ex3_PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            printLine(1, i);
        }

      //  System.out.println(number);

        for (int i = number ; i >= 1 ; i--) {
            printLine(1, i);
        }

    }

    private static void printLine(int start, int end){

        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
}
