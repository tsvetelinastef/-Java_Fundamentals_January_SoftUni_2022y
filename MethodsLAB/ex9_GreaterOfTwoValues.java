package MethodsLAB;

import java.util.Scanner;

public class ex9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String valueOne = scanner.nextLine();
        String valueTwo = scanner.nextLine();


        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(valueOne), Integer.parseInt(valueTwo)));
                break;
            case "char":
                System.out.println(getMax(valueOne.charAt(0), valueTwo.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(valueOne, valueTwo));
                break;

        }
    }

    static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

}
