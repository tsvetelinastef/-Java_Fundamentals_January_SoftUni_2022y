package MethodsLAB;

import java.util.Scanner;

public class ex6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int area = rectangle(a,b);
        System.out.println(area);
    }

    public static int rectangle(int a, int b) {
      //  int area = a * b;
      //  System.out.println(area);
        return a * b;
    }
}
