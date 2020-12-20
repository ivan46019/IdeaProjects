package task_ivan_logos.hw8logos;

import java.util.Scanner;

public class Menu {
    public static void consolUser(Commodity c) {
        int i = 1;
        while (i == 1) {
            System.out.println("Внести дані по товару - 1\n");
            System.out.println("Вивести список товарів- 2 \n");

            System.out.println("Сортування товару: за назвою - 3, за кількістю - 4, за ціною - 5, за вагою - 6 \n");
            System.out.println("Знайти товар за кодом  - 7\n");
            System.out.println("Вихід з програми - 8");

            Scanner scanner = new Scanner(System.in);
            int var = scanner.nextInt();

            switch (var) {
                case 1:
                    c.writeCollection();
                    break;
                case 2:
                    for (Product product : c.getProductCollection()) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    c.sortName();
                    break;

                case 4:
                    c.sortQuantity();
                case 5:
                    c.sortPrice();
                    break;
                case 6:
                    c.sortWeight();
                    break;
                case 7:
                    System.out.print("Введіть код товару: ");
                    int index = scanner.nextInt();
                    c.printIndex(index);
                    break;
                case 8:
                    System.exit(1);
                default:
                    System.out.println("Невірно введено число - вихід з програми");
                    System.exit(0);
            }
            System.out.println("Введіть (1) щоб виконати іншу дію , або (0) щоб припинити");
            i = scanner.nextInt();
        }

    }
}
