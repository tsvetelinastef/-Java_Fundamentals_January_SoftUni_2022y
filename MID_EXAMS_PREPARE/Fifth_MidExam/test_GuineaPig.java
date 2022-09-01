package MID_EXAMS_PREPARE.Fifth_MidExam;

import java.util.Scanner;

public class test_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // grams
        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;

        double guineaWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30; i++) {
            food -= 300;  // eats 300gr of food

            if (i % 2 == 0) {
                hay -= 0.05 * food; // 5% of the rest of the food
            }
            if (i % 3 == 0){
                cover -= guineaWeight/ 3.0; // quantity of 1/3 of its weight
            }
            if (food <= 0 || hay <= 0 || cover <= 0){
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! " +
                        "Food: %.2f, Hay: %.2f, Cover: %.2f",
                food / 1000, hay / 1000, cover/ 1000);

    }
}
