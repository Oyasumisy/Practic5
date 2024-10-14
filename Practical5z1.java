import java.lang.Math;

public class Practical5z1 {
    // Ракітенко Артем КН-21
    // Завдання 1
    public static void main(String[] args) {
        // Вхідні дані
        double a = 38.9;
        double b = -4.7;
        double c = 5;
        double z = 0.8;

        // Обчислення x
        double numerator = a + (b / (c + Math.sqrt(a)));
        double denominator = Math.abs(b - a) + Math.sqrt(a);
        double x = numerator / denominator;

        // Обчислення y
        double y = Math.exp(-1 / z) + Math.asin(z);

        // Результат
        System.out.println("Значення x: " + x);
        System.out.println("Значення y: " + y);
    }
}