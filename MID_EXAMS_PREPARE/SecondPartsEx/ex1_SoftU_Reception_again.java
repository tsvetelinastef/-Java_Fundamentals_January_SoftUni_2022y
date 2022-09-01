package MID_EXAMS_PREPARE.SecondPartsEx;
// By The Lector
import java.util.Scanner;

public class ex1_SoftU_Reception_again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int employeeFirst = scanner.nextInt();
       int employeeSecond = scanner.nextInt();
       int employeeThird = scanner.nextInt();

       int studentPerHour = employeeFirst + employeeSecond + employeeThird;

       int remainingStudents = scanner.nextInt();

       int hoursPassed = 0;
       // TODO: process students
        while (remainingStudents > 0){
            hoursPassed++;
            if (hoursPassed % 4!= 0){
                remainingStudents -= studentPerHour;
            }
            //remainingStudents -= studentPerHour; - първо и нямаше if
        }

        System.out.printf("Time needed: %dh.",hoursPassed );
    }
}
