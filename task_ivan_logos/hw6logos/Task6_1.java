package task_ivan_logos.hw6logos;
/*
1) Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
        Якщо користувач введе не ціле число, то повідомляти йому про помилку.
2) Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел,
         введених користувачем. Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6_1 {


    public static void main(String[] args) {
        Scanner scannerUser = new Scanner(System.in);

        try {
            System.out.println("Введіть ціле число");

            int numberA = scannerUser.nextInt();

            System.out.println("Введіть ціле число");

            int numberB = scannerUser.nextInt();

            System.out.println("Sum = " + (numberA + numberB));

        } catch (InputMismatchException e) {
            System.out.println("Enetered value isn't integer");

//            e.printStackTrace();

        }
        System.out.println("programm is working");
    }

}





