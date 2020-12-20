package task_ivan_logos.hw7logos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Завдання 2 робити через RegEx
Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”.
Вхідним параметром є стрічка :
String str = "I love Java more than my friend. Java is so beautiful.";
перевірити чи є в стрічці слово “Java”;
замінити слово “Java” на “C#”;
замінити всі слова “Java” на “C#”;
Користувач з консолі має вводити слова доти, доки не введе “break”, всі слова записуються в List.
Написати функцію для :

виведення слів, які починаються на “s”!
виведення користувачу всіх слова, які він ввів!
виведення слів, які мають кількість букв більше ніж 5!

 */

public class Redex2 {

    public static void fillCollection(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть слова:     (щоб закінчити введіть:  break)");
        String str = scanner.nextLine();

        while (!str.equals("break")) {
            list.add(str);
            str = scanner.next();
        }
    }

    public static void checkListForStartLetter(ArrayList<String> list) {
        Pattern pattern = Pattern.compile("^a");
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }
    public static void printWordWithS(ArrayList<String> list) {
        Pattern pattern = Pattern.compile("^s");
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                System.out.println(s);
            }
        }
    }
    public static void printList(ArrayList<String> list) {

        System.out.println("весь список:");
        for (String s : list) {
            System.out.println();
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        fillCollection(strings);
        checkListForStartLetter(strings);
        printList(strings);
        printWordWithS(strings);

        String str1 = "I love Java more than my friend. Java is so beautiful.";
        if (str1.contains("Java")) {
            System.out.println("word Java replaced");
        }
        System.out.println(str1.replaceFirst("Java", "C#"));
        System.out.println(str1.replace("Java", "C#"));
    }
}


