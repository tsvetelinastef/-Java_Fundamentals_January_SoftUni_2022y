package ObjectAndClasses_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class ex3_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= N; ++i) {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        //System.out.printf("Factorial of %d = %d", N, factorial);
        System.out.println(factorial);
    }
}

