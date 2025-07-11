package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример корректного массива
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Пример массива с некорректными данными
        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "X"}
        };

        // Пример массива неправильного размера
        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            System.out.println("Сумма корректного массива: " + sumArray(correctArray));
            System.out.println("Сумма массива с некорректными данными: " + sumArray(incorrectDataArray));
            System.out.println("Сумма массива неправильного размера: " + sumArray(incorrectSizeArray));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }

        // Демонстрация ArrayIndexOutOfBoundsException
        try {
            generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format(
                            "Некорректные данные в ячейке [%d][%d]: '%s'", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }

    public static void generateArrayIndexOutOfBoundsException() {
        int[] arr = new int[5];
        // Попытка доступа к несуществующему индексу
        int value = arr[10];
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
