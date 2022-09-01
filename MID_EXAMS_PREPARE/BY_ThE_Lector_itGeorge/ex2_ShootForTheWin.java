package MID_EXAMS_PREPARE.BY_ThE_Lector_itGeorge;

import java.util.Scanner;

public class ex2_ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] targets = nextIntArray(scanner);
        String command = scanner.nextLine();
        int totalShot = 0;
        while (!command.equals("End")) {
            // process targets...
            int targetIndex = Integer.parseInt(command);

            if (isValidIndex(targets, targetIndex)) {
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1) {
                    totalShot++; // увеличава се с 1
                    targets[targetIndex] = -1;
                    registerTargetHit(targets, shotTarget);

                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", totalShot);
        // System.out.println( "-1 -1 130 -1");
        printArray(targets, " ");

    }

    private static void registerTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] != -1){
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else {
                    targets[i] += shotTarget;
                }
            }

        }
    }

    private static boolean isValidIndex(int[] array, int targetIndex) {


        return targetIndex >= 0 && targetIndex < array.length;
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            if (i < array.length - 1) {
                System.out.println(" ");
            }
        }
        System.out.println();
    }

    private static int[] nextIntArray(Scanner scanner) {
        String[] intsAsStrings = scanner.nextLine().split("\\s+");
        int[] array = new int[intsAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intsAsStrings[i]);
        }
        return array;
    }


}

 /*
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        registerTargetHit(arr, 3);
        printArray(arr, " ");
        registerTargetHit(arr, 2);
        printArray(arr, " ");
        registerTargetHit(arr, 6);
        printArray(arr, " ");


        int[] arr = new int[]{1, 2, -1 ,4 ,5 ,6};
        registerTargetHit(arr,4);
        printArray(arr, " ");

         */


