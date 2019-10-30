import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        // проверка является ли введенное выражение числом
        while (!scan.hasNextInt()) {
            System.out.println("NaN! Ввведите целое число!");
            scan.next();
        }
        int n = scan.nextInt();
        scan.close();

        System.out.println("Простые числа: ");
        firstTask(n);
    }

    static void firstTask(int n) {
        int i;
        // находим количество делителей каждого числа от 1 до n
        for (i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // находим простые числа
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
};