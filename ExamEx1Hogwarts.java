import java.util.Scanner;

public class ExamEx1Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spellOne = scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Abracadabra")) {
            String[] data = commands.split(" ");
            String command = data[0];

            switch (command) {
                case "Abjuration":
                    String upperCase = spellOne.replace(spellOne, spellOne.toUpperCase());
                    System.out.println(upperCase);
                    spellOne = upperCase;
                    break;

                case "Necromancy":
                    String lowerCase = spellOne.replace(spellOne, spellOne.toLowerCase());
                    System.out.println(lowerCase);
                    spellOne = lowerCase;
                    break;
                case "Illusion":
                    int indexIllusion = Integer.parseInt(data[1]);
                    String letter = data[2];
                    if (indexIllusion >= 0 && indexIllusion < spellOne.length()) {
                        String firstPart = spellOne.substring(0, indexIllusion);
                        String secondPart = spellOne.substring(indexIllusion + 1);
                        String putLetter = firstPart + letter + secondPart;
                        spellOne = putLetter;
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubString = data[1];
                    String secondSubString = data[2];
                    String replace = spellOne.replace(firstSubString, secondSubString);
                    if (!replace.equals(spellOne)) {
                        spellOne = replace;
                        System.out.println(spellOne);
                    }
                    break;

                case "Alteration":
                    String substring = data[1];
                    String replaceSubString = spellOne.replace(substring, "");

                    if (!replaceSubString.equals(spellOne)) {
                        spellOne = replaceSubString;
                        System.out.println(spellOne);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
