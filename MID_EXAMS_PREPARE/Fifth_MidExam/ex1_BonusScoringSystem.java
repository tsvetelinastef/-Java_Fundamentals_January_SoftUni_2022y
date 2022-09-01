package MID_EXAMS_PREPARE.Fifth_MidExam;

import java.util.Scanner;

public class ex1_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        // On the following lines, you will be receiving the
        // attendance of each student.

        // There will never be students with equal bonuses.

        double max = 0;
        double maxBonus = 0;

        for (int i = 0; i < students; i++) {
            double attendances = Double.parseDouble(scanner.nextLine());

            if (attendances > max) {
                max = attendances;
                //{total bonus} = {student attendances} / {course lectures} *
                // (5 + {additional bonus})
                maxBonus = ((attendances / lectures) * (5 + additionalBonus));
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.", max);


    }
}

