// Задача3: 
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = sc.nextDouble();
        System.out.print("Enter number 3: ");
        double number3 = sc.nextDouble();
        sc.close();

        try {
            checkNumbers(number1, number2, number3);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberSumException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkNumbers(double num1, double num2, double num3)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        if (num1 > 100) {
            throw new NumberOutOfRangeException("Number 1 out of permitted range");
        }
        if (num2 < 0) {
            throw new NumberOutOfRangeException("Number 2 out of permitted range");
        }
        if ((num1 + num2) < 10) {
            throw new NumberSumException("Sum of number 1 and number 2 is not enough");
        }
        if (num3 == 0) {
            throw new DivisionByZeroException("Division by zero is prohibited");
        }
        System.out.println("Verification is completed successfully");
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
