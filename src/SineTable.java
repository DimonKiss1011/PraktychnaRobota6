public class SineTable {
    public static void main(String[] args) {
        // 1. Заголовок таблиці
        System.out.println("Таблиця синусів для значень від 0 до 90 градусів:");

        // 2. Виведення значень синуса від 0 до 90 градусів з кроком 1
        int count = 0; // Лічильник для контролю кількості значень у рядку
        for (int degree = 0; degree <= 90; degree++) {
            double radians = Math.toRadians(degree); // Переведення градусів у радіани
            double sinValue = Math.sin(radians); // Обчислення синуса

            // 3. Форматований вивід синуса
            System.out.printf("%-6d: %.4f  ", degree, sinValue);
            count++;

            // 4. Перехід на новий рядок після кожних 10 значень
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}

