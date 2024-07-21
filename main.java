import java.io.File;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.print("Enter a command: ");
            command = scanner.nextLine();

            if (command.startsWith("shake")) {
                String[] tokens = command.split(" ");

                if (tokens.length > 1) {
                    String action = tokens[1];

                    if (action.equals("update")) {
                        System.out.println("Performing update...");
                        // Add your update logic here
                    } else if (action.equals("install")) {
                        if (tokens.length > 2) {
                            String folder = tokens[2];
                            String javaFile = tokens[3];

                            System.out.println("Performing install...");
                            // Add your install logic here
                        } else {
                            System.out.println("Invalid command. Usage: shake install <folder> <javaFile>");
                        }
                    } else {
                        System.out.println("Invalid command. Usage: shake [update|install]");
                    }
                } else {
                    System.out.println("Invalid command. Usage: shake [update|install]");
                }
            } else {
                System.out.println("Invalid command.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}