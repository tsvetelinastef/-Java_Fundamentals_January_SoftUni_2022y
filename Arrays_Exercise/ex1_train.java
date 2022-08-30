package Arrays_Exercise;

import java.util.Scanner;

public class ex1_train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagon = Integer.parseInt(scanner.nextLine());

        int[] peopleInWagon = new int[countOfWagon];
        int sum = 0;

        for (int i = 0; i < countOfWagon; i++) {

            peopleInWagon[i] = Integer.parseInt(scanner.nextLine());

            sum += peopleInWagon[i];

        }
        for (int element : peopleInWagon) {
            System.out.print(element + " ");
        }
        System.out.printf("%n%d", sum);

    }
}
