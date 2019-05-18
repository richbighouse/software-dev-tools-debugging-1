import java.util.Scanner;

public class Main {

    private static int int1, int2;

    public static void main(String[] args) {
        System.out.println("Welcome to Java debugging exercise 1 with IntelliJ!");
        System.out.println("This program is a simple calculator tool.");
        System.out.println("It takes two integers as inputs and runs simple mathematical operations");
        System.out.println("But there are some problems :(");
        System.out.println("We will use the debugging tool to find the bugs and fix them");
        System.out.println("\n\n--- Starting the calculator ---");

        Scanner scanner = new Scanner(System.in);
        chooseNumbers(scanner);

        int choice;
        String again;
        do {
            System.out.println("Select an operation (n): ");
            System.out.println("\t1. Addition (int1 + int2)");
            System.out.println("\t2. Difference (int1 - int2)");
            System.out.println("\t3. Multiplication (int1 + int2)");
            System.out.println("\t4. Division (int1 / int2)");
            System.out.println("\t5. Exponent (int1 ^ int2)");
            System.out.println("\t6. Choose new numbers");
            System.out.println("\t7. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Computing addition...");
                    Operations.add(int1, int2);
                    break;
                case 2:
                    System.out.println("Computing difference...");
                    Operations.difference(int1, int2);
                    break;
                case 3:
                    System.out.println("Computing multiplication...");
                    Operations.multiplication(int1, int2);
                    break;
                case 4:
                    System.out.println("Computing division...");
                    Operations.division(int1, int2);
                case 5:
                    System.out.println("Computing exponent...");
                    Operations.exponent(int1, int2);
                    break;
                case 6:
                    System.out.println("Choosing new numbers...");
                    chooseNumbers(scanner);
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    throw new RuntimeException("Invalid number! Calculator crashing!");
            }

            boolean invalid = true;
            do {
                System.out.println("Continue? (y/n):");
                again = scanner.next();
                if (!again.equals("y") && !again.equals("n")) {
                    System.out.println("Invalid entry. Try again");
                } else {
                    invalid = false;
                }
            } while (invalid);
        } while (again.equalsIgnoreCase("y"));
    }

    private static void chooseNumbers(Scanner scanner) {
        System.out.println("Input integer 1: ");
        int1 = scanner.nextInt();
        System.out.println("Input integer 2: ");
        int2 = scanner.nextInt();
        System.out.println(String.format("\n\tInputs: int1 = %d, int2 = %s\n", int1, int2));
    }
}
