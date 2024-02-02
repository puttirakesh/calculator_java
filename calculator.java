import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter the first number (or 'q' to quit):");
            String input1 = scanner.next();

            if (input1.equalsIgnoreCase("q")) {
                break;
            }

            int number1 = Integer.parseInt(input1);
            System.out.println("Enter the second number:");
            int number2 = scanner.nextInt();

            System.out.println("Please type in the math operation you would like to complete:");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplication");
            System.out.println("/ for division");
            System.out.println("q to quit");

            String operation = scanner.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = (double) number1 / number2;
                    break;
                case "q":
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Error: You have not typed a valid operator, please try again.");
                    continue;
            }

            if (operation.equals("q")) {
                break;
            }

            System.out.printf("%d %s %d = %.2f%n", number1, operation, number2, result);
        }

        scanner.close();
    }
}