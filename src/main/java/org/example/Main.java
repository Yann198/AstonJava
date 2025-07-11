package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneBook = new PhoneDirectory();

        // Добавляем записи
        phoneBook.add("Иванов", "+7 123 456-78-90");
        phoneBook.add("Петров", "+7 987 654-32-10");
        phoneBook.add("Иванов", "+7 555 555-55-55"); // Второй номер для Иванова
        phoneBook.add("Сидоров", "+7 111 222-33-44");
        phoneBook.add("Петров", "+7 999 888-77-66"); // Второй Петров (однофамилец)

        // Выводим весь справочник
        phoneBook.printAll();

        // Поиск номеров
        System.out.println("\nПоиск по фамилии:");
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Несуществующая фамилия: " + phoneBook.get("Васильев"));
    }
}
