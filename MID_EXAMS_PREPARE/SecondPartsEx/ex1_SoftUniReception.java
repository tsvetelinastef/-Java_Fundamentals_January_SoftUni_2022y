package MID_EXAMS_PREPARE.SecondPartsEx;
// 02. Programming Fundamentals Mid Exam

import java.util.Scanner;

public class ex1_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEfficiencyOne = scanner.nextInt();
        int employeeEfficiencyTwo = scanner.nextInt();
        int employeeEfficiencyThree = scanner.nextInt();

        int studentsCount = scanner.nextInt();

        int hours = 0;
        while (studentsCount > 0) {
            hours++;
            if (hours % 4 != 0) {
                studentsCount -= employeeEfficiencyOne;
                studentsCount -= employeeEfficiencyTwo;
                studentsCount -= employeeEfficiencyThree;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}



  /*

        int employeeEfficiencyOne = Integer.parseInt(scanner.nextLine()); // [1-100]
        int employeeEfficiencyTwo = Integer.parseInt(scanner.nextLine());
        int employeeEfficiencyThree = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine()); // [0-10000]
        // Input will always be valid and in the range specified

   */

