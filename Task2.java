// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = sc.nextDouble();
        sc.close();

        try {
            divide(number1, number2);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void divide(Double num1, Double num2) throws DivisionByZeroException {
        if (num2 == 0) {

            throw new DivisionByZeroException("Division by zero is prohibited");
        }
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
