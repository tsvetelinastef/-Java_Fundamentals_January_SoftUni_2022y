package MIDExam;
// 100 of 100
import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experienceNeeded = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalGainedExperience = 0.0;
        int battleCount = 0;
        for (int i = 1; i <= n; i++) {
            double gainExperience = Double.parseDouble(scanner.nextLine());
            totalGainedExperience += gainExperience;
            battleCount++;
            if (i == 3) {
                totalGainedExperience += gainExperience * .15;
            }
            if (i == 5) {
                totalGainedExperience -= gainExperience * 0.10;
            }
            if (i == 15) {
                totalGainedExperience += gainExperience * 0.05;
            }
            if (totalGainedExperience >= experienceNeeded) {
                break;
            }

        }


        if (totalGainedExperience >= experienceNeeded) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", battleCount);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experienceNeeded - totalGainedExperience);
        }
    }
}
