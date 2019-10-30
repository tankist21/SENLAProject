import java.util.Scanner;

public class text {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст с числом");
        String words = scan.nextLine();
        scan.close();

        paragraph(words);

    }
    static void paragraph (String words) {
        // заменим цифры пустыми символами с помощью регулярного выражения
        String str = words.replaceAll("[\\d].", "");
        // выведем результат
        System.out.println(str);
    }
}
