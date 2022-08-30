package BasicSyntax_Exercise;

import java.util.Scanner;

public class ex4_PrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStart = Integer.parseInt(scanner.nextLine());
        int numberEnd = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = numberStart; i <= numberEnd; i++) {
            sum += i;
           // System.out.print(i + " "); // print - за да е на един ред

            if (i == numberEnd){
                System.out.println(i);
                break;
            } else {
                System.out.print(i + " "); // print - за да е на един ред
            }


        }
       // System.out.println();
        System.out.printf("Sum: %d%n", sum);

    }
}

/*
  int numberStart = Integer.parseInt(scanner.nextLine());
        int numberEnd = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = numberStart; i <= numberEnd; i++) {
            sum += i;
            System.out.print(i + " "); // print - за да е на един ред

        }
        System.out.println();
        System.out.printf("Sum: %d%n", sum);
 */