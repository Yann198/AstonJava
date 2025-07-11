package org.example;

interface GeometricShape {
    // Цвета фигуры
    String getFillColor();
    String getBorderColor();

    // Расчет площади
    double calculateArea();

    // Дефолтный метод для расчета периметра (если возможно реализовать общую логику)
    default double calculatePerimeter() {
        return 0; // По умолчанию возвращаем 0, переопределяем в конкретных фигурах
    }

    // Вывод информации о фигуре
    default void printInfo() {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границ: " + getBorderColor());
        System.out.println("----------------------");
    }
}

class Circle implements GeometricShape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements GeometricShape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculateArea() {
        // Формула Герона
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class GeometryApp {
    public static void main(String[] args) {
        GeometricShape[] shapes = {
                new Circle(5, "Красный", "Черный"),
                new Rectangle(4, 6, "Синий", "Белый"),
                new Triangle(3, 4, 5, "Зеленый", "Желтый")
        };

        for (GeometricShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            shape.printInfo();
        }
    }
}
