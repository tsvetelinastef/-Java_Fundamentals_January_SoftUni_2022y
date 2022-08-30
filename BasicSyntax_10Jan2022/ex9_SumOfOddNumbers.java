package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex9_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oddCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i < oddCount * 2; i += 2) {
            sum += i;
            System.out.println(i);
        }

        System.out.println("Sum: " + sum);

    }

}
