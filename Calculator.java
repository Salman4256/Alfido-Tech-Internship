import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        try {
            double result = performOperation(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Operation: " + e.getMessage());
        }

        scanner.close();
    }

    private static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Operator must be +, -, *, or /");
        }
    }
}
