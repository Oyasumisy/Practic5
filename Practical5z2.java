import java.util.Scanner;
import java.lang.Math;

public class Practical5z2 {
    // Ракітенко Артем КН-21
    // Завдання 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень a і b
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        // Введення значення x
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double f;

        // Обчислення функції f(x)
        if (x >= -1 && x < 3) {
            f = Math.sin(x);
        } else if (x == 3) {
            f = Math.sqrt(a * x - 2);
        } else if (x > 3 && x <= 5) {
            f = b * x + a;
        } else {
            System.out.println("Значення x поза допустимим діапазоном.");
            scanner.close();
            return;
        }

        // Результат 
        System.out.println("Значення f(x): " + f);

        scanner.close();
    }
}