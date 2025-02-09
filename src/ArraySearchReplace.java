import java.util.Scanner;
import java.util.Random;

public class ArraySearchReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Введення розміру масиву
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // 2. Заповнення масиву випадковими числами (наприклад, від 1 до 100)
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // 3. Вивід згенерованого масиву
        System.out.print("Згенерований масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Введення значення для пошуку та заміни
        System.out.print("Введіть число, яке потрібно знайти: ");
        int searchValue = scanner.nextInt();

        System.out.print("Введіть число, на яке потрібно замінити: ");
        int replaceValue = scanner.nextInt();

        // 5. Пошук і заміна значення в масиві
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                array[i] = replaceValue;
                found = true;
            }
        }

        // 6. Вивід оновленого масиву
        if (found) {
            System.out.print("Оновлений масив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Число не знайдено у масиві.");
        }

        scanner.close();
    }
}

