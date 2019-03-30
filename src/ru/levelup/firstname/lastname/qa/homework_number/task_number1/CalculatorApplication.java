package ru.levelup.firstname.lastname.qa.homework_number.task_number1;


public class CalculatorApplication {

    public static void main(String[] args) {
        CalculatorApplication app = new CalculatorApplication();
        app.startApplication();
        double result = 0;
        double number1 = GetUserData.get_number();
        String operation = GetUserData.get_operation();

        if (operation.equals(String.valueOf('!'))) {
            result = Operations.calculate_factorial(number1);

        } else {
            double number2 = GetUserData.get_number();


            if (operation.equals(String.valueOf('+'))) {
                result = Operations.addition(number1, number2);

            }
            if (operation.equals(String.valueOf('-'))) {
                result = Operations.subtraction(number1, number2);

            }
            if (operation.equals(String.valueOf('*'))) {
                result = Operations.multiplication(number1, number2);

            }
            if (operation.equals(String.valueOf('/'))) {
                result = Operations.division(number1, number2);

            }
            if (operation.equals(String.valueOf('^'))) {
                result = Operations.modular_exponentiation(number1, number2);

            }
        }
        System.out.print("Result " + result);

    }

    private void startApplication() {

    }

}
