
// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
// В противном случае, программа должна выводить сообщение "Число корректно".
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        try {
            check(num);
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void check(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Inccorrect number");
        }
        System.out.println("Correct number");
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}