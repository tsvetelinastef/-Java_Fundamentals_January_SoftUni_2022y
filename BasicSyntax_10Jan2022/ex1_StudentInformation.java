package BasicSyntax_10Jan2022;

import java.util.Scanner;

public class ex1_StudentInformation {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String studentName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            double averageGrade = Double.parseDouble(scanner.nextLine());

            //  System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

            String output = String.format("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

            System.out.println(output);

        }
}
