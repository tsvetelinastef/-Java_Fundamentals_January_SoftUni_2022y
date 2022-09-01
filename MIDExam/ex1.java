package MIDExam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int battleCount = Integer.parseInt(scanner.nextLine());

        // on the following lines
        double experienceEarnedPerBattle = Double.parseDouble(scanner.nextLine());

        // направи един For цикъл за броя на битките и след всяка битка
        // сравнявай дали опита ти е >= зададеният.
        //ако стане >= трябва да прекъснеш

        double xp = 0.0;

        while (xp > 0){

        }

       /* for ( battleCount = 1; battleCount < xp; battleCount++) {

        }

            if (neededExperience >= experienceEarnedPerBattle) {

                }
        */


            if (battleCount % 3 == 0) {
                xp = experienceEarnedPerBattle + (experienceEarnedPerBattle * 0.15);  // взима + 15%;
            }
            if (battleCount % 5 == 0) {
                xp = experienceEarnedPerBattle - (experienceEarnedPerBattle * 0.05); // взима - 10%;
            }
            if (battleCount % 15 == 0) {
                xp = experienceEarnedPerBattle + (experienceEarnedPerBattle * 0.10); // взима  +10%;
            }



        if (experienceEarnedPerBattle > 0) {

            System.out.printf("Player successfully collected his needed " +
                    "experience for %d battles.", battleCount);
        } else {
            System.out.printf("Player was not able to collect the needed" +
                    " experience, %.2f more needed.", xp);
        }





    }
}
