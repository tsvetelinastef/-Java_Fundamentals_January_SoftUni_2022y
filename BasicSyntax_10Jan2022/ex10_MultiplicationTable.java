package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = integer * i;
            // System.out.println(sum);
            System.out.printf("%d X %d = %d%n", integer, i, sum);
        }

        //   System.out.printf("%d X %d = %d",integer, integer, sum );
    }

}
