package task_ivan_logos.hw6logos;

import java.util.Scanner;

/*3.Створити свій Exception(MyException). Створити клас Methods, Описати в ньому методи , які б
розраховували додавання, віднімання, множення, ділення двох змінних . При цьому врахувати :
Якщо a<0 і b<0 викидаємо IllegalArgumentException
Якщо a=0 і b!=0 або a!=0 і b=0 викидаємо ArithmeticException
Якщо a=0 і b=0 викидаємо IllegalAccessException
Якщо a>0 і b>0 викидаємо MyException
Протестувати всі можливі варіанти, і вивести все на консоль.*/


public class Methods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        System.out.println("старт");

        System.out.println("Введіть число а");
            double a = scanner.nextDouble();
        System.out.println("Введіть число b");
            double b = scanner.nextDouble();

            if (mathematicalOperations(a, b)) {
                sum(a, b);
                subtraction(a, b);
                multiplication(a, b);
                division(a, b);
                System.out.println();
            }

        }

    public static boolean mathematicalOperations(double a, double b) throws IllegalArgumentException,
            ArithmeticException, IllegalAccessException, MyException {
        boolean result = false;

        try {
            if (a < 0 && b < 0) {
                throw new IllegalArgumentException();
            }
            if (a == 0 && b != 0 || a != 0 && b == 0) {
                throw new ArithmeticException();
            }
            if (a == 0 && b == 0) {
                throw new IllegalAccessException();
            }
            if (a > 0 && b > 0) {
                throw new MyException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error : a < 0 && b < 0");
        } catch (ArithmeticException e) {
            System.out.println("Error : a = 0 і b != 0 або a != 0 і b = 0");
        } catch (IllegalAccessException e) {
            System.out.println("Error : a = 0 i b = 0");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        return result;
    }

    public static void sum(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }

    public static void subtraction(double a, double b) {
        System.out.println("a - b = " + (a - b));
    }

    public static void multiplication(double a, double b) {
        System.out.println("a * b = " + (a * b));
    }

    public static void division(double a, double b) {
        System.out.println("a / b = " + (a / b));
    }


}








