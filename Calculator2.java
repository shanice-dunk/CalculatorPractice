// Calculator with if-else statements

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input from user using the Scanner
        System.out.print("Please enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        // user to input operator
        System.out.print("Please enter the operator: ");
        char operator = scanner.next().charAt(0);
        calculate(a, b, operator);
    }

    public static double calculate(double a, double b, char operator) {
        double answer = 0;

        // adding two numbers
        if (operator == '+') {
            answer = a + b;
        // subtract two numbers
        } else if (operator == '-') {
            answer = a - b;
        // multiply two numbers
        } else if (operator == '*') {
            answer = a * b;
        // divide two numbers
        } else if (operator == '/') {
            answer = a / b;
        // modulo
        } else if (operator == '%') {
            answer = a % b;
        } else {
            System.out.println("Please enter a valid input.");
        }

        // Result printed
        System.out.println("The answer is: " + answer);
        return answer;
    }
}
