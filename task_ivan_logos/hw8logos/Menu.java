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
/*
import javax.swing.event.TreeSelectionEvent;
+import java.util.*;
+
+public class Main {
+    public static void printCollection(Collection<Person> c){
+        for(Person p: c){
+            System.out.println(p);
+        }
+
+    }
+    public static void main(String[] args) {
+        Set<Person> persons1 = new HashSet<Person>();
+        persons1.add(new Person("cc",17));
+        persons1.add(new Person("bb",22));
+        persons1.add(new Person("aa",40));
+        persons1.add(new Person("aa",40));
+        TreeSet<Person> persons2 = new TreeSet<>(persons1);
+        printCollection(persons2);
+        System.out.println();
+        TreeSet<Person> persons3 =  new TreeSet<Person>(new PersonComparator());
+        persons3.add(new Person("dd",11));
+        persons3.add(new Person("aa",17));
+        persons3.add(new Person("da",90));
+        persons3.add(new Person("ll",25));
+        printCollection(persons3);+
+    }
+}

+package com.company;
+
+import java.awt.event.PaintEvent;
+import java.util.Comparator;
+import java.util.Objects;
+
+public class Person implements Comparable<Person> {
+  String name;
+  int age;
+
+    @Override
+    public boolean equals(Object o) {
+        if (this == o) return true;
+        if (o == null || getClass() != o.getClass()) return false;
+        Person person = (Person) o;
+        return age == person.age &&
+                Objects.equals(name, person.name);
+    }
+
+    @Override
+    public int hashCode() {
+        return Objects.hash(name, age);
+    }
+
+    public Person(String name, int age) {
+        this.name = name;
+        this.age = age;
+    }
+
+    @Override
+    public String toString() {
+        return "Person " +
+                " name = '" + name + '\'' +
+                ", age = "  + age;
+    }
+
+    @Override
+    public int compareTo(Person o) {
+        return this.name.compareTo(o.name);
+    }
+}
+
+class PersonComparator implements Comparator<Person>{
+
+    @Override
+    public int compare(Person o1, Person o2) {
+        return o1.age - o2.age;
+    }
+}
 */
