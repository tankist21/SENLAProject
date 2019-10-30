import java.util.Scanner;

public class intersectionsTwoSegments {
public static void main (String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите координату x11 первого отрезка: ");
    // проверка является ли введенное выражение числом
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double x11 = scan.nextDouble();
    System.out.println("Введите координату y11 первого отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double y11 = scan.nextDouble();
    System.out.println("Введите координату x12 первого отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double x12 = scan.nextDouble();
    System.out.println("Введите координату y12 первого отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double y12 = scan.nextDouble();
    System.out.println("Введите координату x21 второго отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double x21 = scan.nextDouble();
    System.out.println("Введите координату y21 второго отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double y21 = scan.nextDouble();
    System.out.println("Введите координату x22 второго отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double x22 = scan.nextDouble();
    System.out.println("Введите координату y22 второго отрезка: ");
    while (!scan.hasNextDouble()) {
        System.out.println("NaN! Ввведите число!");
        scan.next();
    }
    double y22 = scan.nextDouble();
    scan.close();
    segment(x11, y11, x12, y12, x21, y21, x22, y22);
}
static void segment(double x11, double y11, double x12, double y12, double x21, double y21, double x22, double y22) {
    // предположим, что начальная точка отрезка находится левее конечной относительно оси абсцисс
    if (x11 > x12) {
      double a = x11;
       x11 = x12;
       x12 = a;
      double b = y11;
      y11 = y12;
      y12 = b;
  }
    if (x21 > x22) {
      double a = x21;
      x21 = x22;
      x22 = a;
      double b = y21;
      y21 = y22;
      y22 = b;
}
    /* рассмотрим случай, если конец одного отрезка расположен левее начала второго
    или случай, если оба отрезка вертикальны */
    if ((x12 < x21) || (x11 == x12 && x21 == x22)) {
        System.out.println("Отрезки не пересекаются");
    }
    // проверим пересекаются ли отрезки
     else if (!((Math.max(y11, y12) < Math.min(y21, y22)) || (Math.min(y11, y12) > Math.max(y21, y22)))) {
        System.out.println("Отрезки пересекаются");
     } else {
        System.out.println("Отрезки не пересекаются");
    }
    }
};
