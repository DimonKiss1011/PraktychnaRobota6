import java.util.Scanner;

public class PolygonChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення кількості кутів багатокутника
        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();

        // Мінімальна кількість кутів для багатокутника - 3
        if (n < 3) {
            System.out.println("Багатокутник повинен мати принаймні 3 кути.");
            return;
        }

        int[] angles = new int[n];
        int sum = 0;

        // Введення значень кутів
        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        // Обчислення очікуваної суми кутів
        int expectedSum = 180 * (n - 2);

        // Перевірка умови існування багатокутника
        if (sum == expectedSum) {
            System.out.println("Такий багатокутник може існувати.");
        } else {
            System.out.println("Такий багатокутник НЕ може існувати.");
        }

        scanner.close();
    }
}

