package Arrays_Exercise;

import java.util.Scanner;

public class ex2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secondElement : secondArr) {
            for (String firstElement: firstArr) {
                if (secondElement.equals(firstElement)){
                    System.out.print(firstElement + " ");
                }
            }
        }


    }
}
