package task_ivan_logos.hw8logos;
import java.util.ArrayList;
import java.util.Scanner;
/*
Реалізовуємо консольну програму. Створити клас Commodity. Описати даний клас: поля методи.
Повинні бути такі методи:
Додати товар
Видалити товар
Замінити товар
Сортувати за назвоню
Сортувати за кількістю
Сортувати за ціною
Сортувати за вагою
Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
Вийти з програми(підказка System.exit)
Для меню використати Switch.
 */

public class Commodity {
    public void writeCollection() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        while (i == 1) {
            System.out.println("Введіть ім'я товару: ");
            String name = scanner.next();
            System.out.println("Введіть кількість:");
            int width = scanner.nextInt();
            System.out.println("Введіть ціну:");
            int length = scanner.nextInt();
            System.out.println("Введіть вагу:");
            int weight = scanner.nextInt();
            addProduck(new Product(name, width, length, weight));
            System.out.println("Введіть (1) щоб продовжити вносити товари, або (0) щоб припинити");
            i = scanner.nextInt();
        }

    }

    ArrayList<Product> productCollection;

    public Commodity() {
        this.productCollection = new ArrayList<>();
    }

    public void addProduck(Product product) {

        productCollection.add(product);
    }

    public void removeProduct(Product item) {
        productCollection.remove(item);
    }

    public void sortName() {
        productCollection.sort(new SortName());
    }

    public void sortQuantity() {
        productCollection.sort(new SortQuantity());

    }
    public void sortPrice() {
        productCollection.sort(new SortPrice());
    }


    public void sortWeight() {
        productCollection.sort(new SortWeight());
    }

    public void printIndex(int index) {
        try {
            System.out.println(productCollection.get(index));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Неправильний індекс");
        }
    }

    public ArrayList<Product> getProductCollection() {
        return productCollection;
    }
}