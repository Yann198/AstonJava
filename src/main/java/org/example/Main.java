package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите программу:");
        System.out.println("1 - Вычисление факториала");
        System.out.println("2 - Площадь треугольника");
        System.out.println("3 - Арифметические операции");
        System.out.println("4 - Сравнение чисел");
        System.out.print("Введите номер: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                runFactorialProgram(scanner);
                break;
            case 2:
                runTriangleAreaProgram(scanner);
                break;
            case 3:
                runArithmeticProgram(scanner);
                break;
            case 4:
                runComparisonProgram(scanner);
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }

    // 1. Факториал
    private static void runFactorialProgram(Scanner scanner) {
        System.out.print("Введите число для вычисления факториала: ");
        int n = scanner.nextInt();
        long result = FactorialCalculator.calculateFactorial(n);
        System.out.println("Факториал " + n + " = " + result);
    }

    // 2. Площадь треугольника
    private static void runTriangleAreaProgram(Scanner scanner) {
        System.out.print("Введите сторону A: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону B: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону C: ");
        double c = scanner.nextDouble();

        double area = TriangleArea.calculateArea(a, b, c);
        System.out.printf("Площадь треугольника = %.2f\n", area);
    }

    // 3. Арифметические операции
    private static void runArithmeticProgram(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        System.out.println(x + " + " + y + " = " + ArithmeticOperations.add(x, y));
        System.out.println(x + " - " + y + " = " + ArithmeticOperations.subtract(x, y));
        System.out.println(x + " * " + y + " = " + ArithmeticOperations.multiply(x, y));
        System.out.println(x + " / " + y + " = " + ArithmeticOperations.divide(x, y));
    }

    // 4. Сравнение чисел
    private static void runComparisonProgram(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println(NumberComparator.compare(a, b));
    }
}
