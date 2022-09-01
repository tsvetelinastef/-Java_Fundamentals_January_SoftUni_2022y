package MID_EXAMS_PREPARE.BY_ThE_Lector_itGeorge;

import java.util.Scanner;

public class ex1_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeFirst = scanner.nextInt();
        int employeeSecond = scanner.nextInt();
        int employeeThird= scanner.nextInt();

        int studentsPerHour = employeeFirst + employeeSecond + employeeThird;

        int remainingStudents = scanner.nextInt();

        int hoursPassed = 0;
        //TODO: process students;
        while (remainingStudents > 0){
            hoursPassed++;
            if (hoursPassed % 4 != 0){
                remainingStudents -= studentsPerHour;
            }
        }


        System.out.printf("Time needed: %dh.", hoursPassed);
    }
}
