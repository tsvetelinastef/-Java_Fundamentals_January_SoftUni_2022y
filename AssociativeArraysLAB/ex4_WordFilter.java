package AssociativeArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class ex4_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
    }
}

// String[] words = Arrays.stream(scanner.nextLine().split(" "))
//         .filter(w -> w.length() % 2 == 0).toArray(String[]::new);
