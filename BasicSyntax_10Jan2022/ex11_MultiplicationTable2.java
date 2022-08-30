package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int index = scanner.nextInt();

        do {
            System.out.printf("%d X %d = %d%n", n, index, n * index);
            index++;
        } while (index <= 10);

    }

}
