package ExamPreparationPart1;

import java.util.Scanner;

public class ex1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                //  create a program to crack the codes.

                // • On the first line of the input, you will receive the encrypted message
                String message = scanner.nextLine();

                // • After that, until the "Decode" command is given, you will be receiving
                // strings with instructions for different operations that need to
                // be performed (на скрито - upon the concealed) message to
                // interpret it and reveal  its true content.
                // There are several types of  instructions, split by '|'

                String command = scanner.nextLine();
                while (!command.equals("Decode")){
                    // • On the following lines, you will be receiving commands, split by '|'
                    String[] commandParts = command.split("\\|");
                    String commandName = commandParts[0];
                    switch (commandName){
                        // • "Move {number of letters}":
                        // Moves the first n letters to the back of the string
                        case "Move":
                            message = move(message, Integer.parseInt(commandParts[1]));
                            break;
                        case "Insert":
                            //• "Insert {index} {value}":
                            // Inserts the given value before the given index in the string
                            message = insert(message, commandParts[1],(commandParts[2]));
                            break;

                        case "ChangeAll":
                            //• "ChangeAll {substring} {replacement}":
                            // Changes all occurrences of the given substring with the
                            // replacement text
                            message = changeAll(message, commandParts[1], commandParts[2]);
                            break;

                        default:
                            throw new IllegalStateException("Unknown command" + commandName);
                            // ChangeAll|z|l|;

                    }
                    command = scanner.nextLine();
                }
                // Output
                //• After the "Decode" command is received, print this message:
                //"The decrypted message is: {message}"
                System.out.println("The decrypted message is: " + message);
            }

            private static String move(String message, int length ) { // int parseInt
                String firstPart = message.substring(0, length);
                String secondPart = message.substring(length);
                return secondPart + firstPart;
            }

            public static String insert(String message, String index, String substr) {
                String firstPart = message.substring(0, Integer.parseInt(index));
                String secondPart = message.substring(Integer.parseInt(index));
                return firstPart + substr + secondPart;
            }

            private static String changeAll(String message, String substr, String replacement) {
                return message.replace(substr, replacement);
            }
}
