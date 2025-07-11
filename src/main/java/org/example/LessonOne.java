Yan, [07.07.2025 20:44]
public class LessonOne {

    // 1. Метод для печати трех слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Метод для проверки знака суммы
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Метод для определения цвета по значению
    public static void printColor() {
        int value = 50;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Метод для сравнения двух чисел
    public static void compareNumbers() {
        int a = 15;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Метод для проверки суммы в диапазоне
    public static boolean isSumInRange(int num1, int num2) {
        int sum = num1 + num2;
        return sum >= 10 && sum <= 20;
    }

    // 6. Проверка положительное ли число
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Проверка отрицательное ли число
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки несколько раз
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    // 10. Инвертирование массива (0 и 1)
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
    }

    // 11. Заполнение массива числами 1..100
    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12. Умножение чисел <6 на 2
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13. Заполнение диагоналей матрицы
    public static void fillDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
    }

    // 14. Создание массива с одинаковыми значениями
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    // Вспомогательный метод для печати массива (без Arrays.toString())
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Вспомогательный метод для печати матрицы (без Arrays.toString())

    Yan, [07.07.2025 20:44]
    public static void printMatrix(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.print("  [");
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);
                if (i < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        System.out.println("1. printThreeWords():");
        printThreeWords();

        System.out.println("\n2. checkSumSign():");
        checkSumSign();

        System.out.println("\n3. printColor():");
        printColor();

        System.out.println("\n4. compareNumbers():");
        compareNumbers();

        System.out.println("\n5. isSumInRange(5, 10):");
        System.out.println(isSumInRange(5, 10));

        System.out.println("\n6. checkNumberSign(-5):");
        checkNumberSign(-5);

        System.out.println("\n7. isNegative(-3):");
        System.out.println(isNegative(-3));

        System.out.println("\n8. printStringMultipleTimes(\"Hello\", 3):");
        printStringMultipleTimes("Hello", 3);

        System.out.println("\n9. isLeapYear(2024):");
        System.out.println(isLeapYear(2024));

        System.out.println("\n10. invertArray([1, 0, 1]):");
        int[] array10 = {1, 0, 1};
        invertArray(array10);
        printArray(array10);

        System.out.println("\n11. fillArray():");
        printArray(fillArray());

        System.out.println("\n12. multiplyLessThanSix([1, 5, 3, 2, 11]):");
        int[] array12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array12);
        printArray(array12);

        System.out.println("\n13. fillDiagonals(4x4):");
        int[][] matrix13 = new int[4][4];
        fillDiagonals(matrix13);
        printMatrix(matrix13);

        System.out.println("\n14. createArray(5, 10):");
        printArray(createArray(5, 10));
    }
}