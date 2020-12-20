package task_ivan_logos.hw7logos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Завдання робити через RegEx
1. Користувач вводить слова з консолі,
Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com

 */

public class EmailValid {
    public static void enterList(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть емайли : (щоб завершити введіть  - !break!");
        String str = "";
        while (!str.equals("break")) {
            str = scanner.nextLine();
            if (!str.equals("break")) {
                list.add(str);
            }
        }
    }

    public static void valid(ArrayList<String> listTo, ArrayList<String> checkList) {
        Pattern patternCase = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Pattern patternGmail = Pattern.compile("gmail.com$");
        for (String s : listTo) {
            Matcher matcher1 = patternCase.matcher(s);
            if (matcher1.find()) {
                Matcher matcher2 = patternGmail.matcher(s);
                if (matcher2.find()) {
                    checkList.add(s);
                }
            }
        }
    }

    public static void printList(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> ourEmails = new ArrayList<>();
        enterList(emails);
        valid(emails, ourEmails);
        System.out.println("емейл-адреси,які закінчуються на @gmail.com:");
        printList(ourEmails);
    }

}
