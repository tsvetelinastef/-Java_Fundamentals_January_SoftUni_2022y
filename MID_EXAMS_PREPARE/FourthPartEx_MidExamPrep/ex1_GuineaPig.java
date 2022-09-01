package MID_EXAMS_PREPARE.FourthPartEx_MidExamPrep;

import java.util.Scanner;

public class ex1_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // buys for a month (30 days)
        // InGrams
     double quantityFood = Double.parseDouble(scanner.nextLine()) * 1000;
     double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
     double quantityCover = Double.parseDouble(scanner.nextLine()) * 1000;

        // guinea pig's weight
     double  guineaWeight = Double.parseDouble(scanner.nextLine()) * 1000;

       // double guineaWeight = quantityFood + quantityHay + quantityCover;


     for (int i = 1; i <= 30; i++) {
         quantityFood -= 300;

          if (i % 2 == 0) {
            quantityHay -= 0.05 * quantityFood;
          }
          if (i % 3 == 0) {
              quantityCover -= guineaWeight / 3.0;
           }
          if (quantityFood <= 0 || quantityHay <= 0 || quantityCover <= 0){
               System.out.println("Merry must go to the pet store!");
               return;
           }
        }
             System.out.printf("Everything is fine! Puppy is happy! " +
                                "Food: %.2f, Hay: %.2f, Cover: %.2f." ,
             quantityFood / 1000, quantityHay / 1000, quantityCover / 1000);

    }
}

/*
===================================================================

 double quantityFoodInGrams = quantityFood * 1000; // 10 000
        double quantityHayInGrams = quantityHay * 1000;  // 5000
        double quantityCoverInGrams = quantityCover * 1000;

        double guineaWeightInGrams = guineaWeight * 1000;


        // on the first day
        double firstDayFoodLeft = quantityFoodInGrams - 300;
        // on the second day
        double secondDayFoodLeft = firstDayFoodLeft - 300;
        double secondDayHayLeft = quantityHayInGrams -
        (secondDayFoodLeft * 0.05);
        // on the third day
        double thirdDayFoodLeft = secondDayFoodLeft - 300;
        double thirdDayCoverLeft = quantityCoverInGrams -
        (guineaWeightInGrams / 3);


        if (quantityFoodInGrams > firstDayFoodLeft  ||
        quantityFoodInGrams > secondDayFoodLeft ||
                quantityHayInGrams >secondDayHayLeft ||
                quantityFoodInGrams > thirdDayFoodLeft ||
        quantityCoverInGrams > thirdDayCoverLeft){
            System.out.printf("Everything is fine! Puppy is happy!
             Food: {excessFood}, Hay: {excessHay}, \n" +
                    "Cover: {excessCover}.", );

              }
=====================================================================

 */
