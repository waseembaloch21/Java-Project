import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("==================================");
        System.out.println("      🌟 JAVA BEAUTIFUL CALCULATOR 🌟");
        System.out.println("==================================");

        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. ➕ Addition");
            System.out.println("2. ➖ Subtraction");
            System.out.println("3. ✖ Multiplication");
            System.out.println("4. ➗ Division");
            System.out.println("5. ❌ Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("👋 Thanks for using Calculator. Goodbye!");
                break;
            }

            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("⚠ Error: Division by zero is not allowed!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("⚠ Invalid choice! Please try again.");
                    valid = false;
            }

            if (valid) {
                System.out.println("----------------------------------");
                System.out.println("✅ Result: " + result);
                System.out.println("----------------------------------");
            }
        }

        scanner.close();
    }
}
