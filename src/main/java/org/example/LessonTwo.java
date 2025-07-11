package org.example;

public class LessonTwo {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        // Теперь передаем дату как строку - конструктор сам преобразует ее в Date
        products[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599.99, true);
        products[1] = new Product("iPhone 16 Pro", "15.01.2025",
                "Apple Inc.", "USA", 6499.99, false);
        products[2] = new Product("Xiaomi 14T Pro", "10.03.2025",
                "Xiaomi", "China", 3999.99, true);
        products[3] = new Product("Google Pixel 9", "05.02.2025",
                "Google", "USA", 5299.99, false);
        products[4] = new Product("Huawei P60 Pro", "20.12.2024",
                "Huawei", "China", 4799.99, true);

        // Выводим информацию о товарах
        System.out.println("Каталог товаров:");
        for (Product product : products) {
            product.printProductInfo();
        }
    }
}
