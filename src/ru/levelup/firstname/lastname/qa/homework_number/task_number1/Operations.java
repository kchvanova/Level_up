package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

public class Operations {

    static int calculate_factorial(double number)
    {
        int factorial = 1;
        for (int i = 1; i < (int) number; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }

    static double modular_exponentiation(double num1, double num2)
    {
        int number = (int) num1;
        int exponent = (int) num2;
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return number;
        }
        int result = (int) num1;
        for (int i = 0; i < exponent - 1; i++) {
            result = result * number;

        }
        return result;
    }

    static double addition(double num1, double num2){
        return num1 + num2;
    }
    static double subtraction(double num1, double num2){
        return num1 - num2;
    }
    static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    static double division(double num1, double num2){
        return num1 / num2;
    }
}
