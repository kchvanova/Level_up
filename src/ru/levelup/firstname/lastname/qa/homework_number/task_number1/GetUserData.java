package ru.levelup.firstname.lastname.qa.homework_number.task_number1;

import java.util.Scanner;

public class GetUserData {

    static double get_number() {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        String input_str = scan.next();
        double number = 0;

        try {
            number = Double.valueOf(input_str);

        } catch (NumberFormatException e) {
            System.err.println("Invalid string format");
        }

        return number;
    }

    static String get_operation(){
        System.out.print("Enter operation: ");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();
        return operation;
    }

}
