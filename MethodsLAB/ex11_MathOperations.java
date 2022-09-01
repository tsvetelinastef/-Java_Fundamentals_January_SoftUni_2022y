package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());

       // System.out.printf("%.2f", calculate(numberOne, operator,numberTwo ));
        System.out.println(new DecimalFormat("0.####").format(calculate(numberOne,operator,numberTwo)));
    }

    private static double calculate(int numberOne, String operator, int numberTwo){
        double result = 0.0;

        switch (operator){
            case "/":
                result = (double) numberOne / numberTwo;
                break;
            case "*":
                result = (double) numberOne * numberTwo;
                break;
            case "+":
                result = (double) numberOne + numberTwo;
                break;
            case "-":
                result = (double) numberOne - numberTwo;
                break;
        }


        return result;
    }


}
