package task_ivan_logos.hw6logos;

import java.util.InputMismatchException;
import java.util.Scanner;

class Task6_2 {


    public static void main(String[] args) {
        Scanner scannerUser = new Scanner(System.in);

        try {
            System.out.println("Введіть ціле число");

            int numberA = scannerUser.nextInt();


            if (numberA % 2 == 0) {
                System.out.println("number is - " + numberA + " - парне!");
            } else {
                System.out.println("number is - " + numberA + " - не парне!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Enetered value isn't integer");

//            e.printStackTrace();

        }
        System.out.println("programm is working");
    }

}
