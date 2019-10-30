import java.util.Scanner;

public class nodNok {
    public static void main ( String [] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Введите первое число: ");
    // находим количество делителей каждого числа от 1 до n
    while (!scan.hasNextInt()) {
            System.out.println("NaN! Ввведите целое число!");
            scan.next();
    }
    int num1 = scan.nextInt();
   System.out.println("Введите второе число: ");
    // находим количество делителей каждого числа от 1 до n
        while (!scan.hasNextInt()) {
            System.out.println("NaN! Ввведите целое число!");
            scan.next();
        }
    int num2 = scan.nextInt();
        scan.close();

    System.out.println("Наибольший общий делитель nod = " + nod(num1, num2));
    System.out.println("Наименьшее общее кратное nok = " + nok(num1, num2));
        }
        // находим НОД двух чисел
        static int nod (int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
             return nod (num2, num1 % num2);
        }
    }
    // находим НОК двух чисел
    static int nok (int num1, int num2) {
    return (num1 * num2 ) / nod (num1, num2);
    }
};
