// Calculator with switch statement

import java.util.Scanner;

public class Calculator {
    // Main method
    public static void main(String[] args) {
        // Store two numbers
        double num1;
        double num2;

        // Input from user
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your numbers:");

            // Take the input
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();

            System.out.println("Please enter the operator");

            char operator = scanner.next().charAt(0);
            double result = 0;

            // switch statement for + - * /
            switch(operator) {
                // add two numbers
                case '+':
                    result = num1 + num2;
                    break;
                // subtract two numbers
                case '-':
                    result = num1 - num2;
                    break;
                // multiply two numbers
                case '*':
                    result = num1 * num2;
                    break;
                // divide two numbers
                case '/':
                    result = num1 / num2;
                    break;
                // modulo
                case '%':
                    result = num1 % num2;
                    break;
                // default case
                default:
                    System.out.println("Please enter the correct input.");
                
            }

            // print the final result
            System.out.println("The result is: ");
            System.out.println(num1 + " " + operator + " " + num2 + " " + "= " + result);
        }


    }

    // Next step - '15 + 16', result stored in variable 
    // Methods for addition, subtraction etc. 
    // Inherit value from somewhere else 
