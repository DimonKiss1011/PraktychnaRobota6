import java.util.Random;

public class ArrayProcessor {
    public static void main(String[] args) {
        int size = 10; // Заданий розмір масиву
        int[] array = new int[size];

        Random random = new Random();

        // Заповнення масиву випадковими числами від 1 до 100
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // Виведення масиву
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Підрахунок парних та непарних чисел
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Виведення результату
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}

