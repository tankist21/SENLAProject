import java.util.Scanner;

public class fibonachi {
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

        System.out.println("Последовательность чисел Фибоначчи: ");
        for (int i = 1; i <= n; i++) {
            System.out.print( fib(i) + " ");
        }
    };
        static int fib(int n){
            // рассмотрим первый базовый случай
            if (n == 1) {
                return 1;
            // рассмотрим второй базовый случай
            } else if (n == 2) {
                return 1;
            } else {
            // запишем формулу последовательности Фибоначчи
                return fib(n - 1) + fib(n - 2);
            }
        }
};
