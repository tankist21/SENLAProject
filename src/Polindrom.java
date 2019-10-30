import java.util.Scanner;

public class Polindrom {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scan.next();
        scan.close();

        polindr(word);

    }
    static void polindr (String word) {
        // находим обратную строку с помощью класса StrinBuffer
        String reverse = new StringBuffer(word).reverse().toString();//
        // сравним два слова
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + ": слово - полиндром!");
        } else {
            System.out.println(word + " - не является полиндромом!");
        }
    }
}
