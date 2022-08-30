package BasicSyntax_Exercise;

import java.util.Scanner;

public class ex8_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte number = scanner.nextByte();

        for (int row = 1; row <= number; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print(row + " ");

            }
            System.out.println();

        }

    }
}
