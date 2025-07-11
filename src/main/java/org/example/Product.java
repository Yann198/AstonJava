package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String name;
    private Date productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    // Конструктор принимает строку с датой и преобразует ее в Date
    public Product(String name, String productionDateStr,
                   String manufacturer, String countryOfOrigin,
                   double price, boolean isReserved) {
        this.name = name;
        this.productionDate = parseDate(productionDateStr);
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    // Метод для преобразования строки в Date
    private Date parseDate(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return format.parse(dateStr);
        } catch (ParseException e) {
            System.err.println("Ошибка формата даты для: " + dateStr + ". Используется текущая дата.");
            return new Date(); // Возвращаем текущую дату в случае ошибки
        }
    }

    // Геттеры и остальные методы остаются без изменений
    public String getName() { return name; }
    public Date getProductionDate() { return productionDate; }
    public String getManufacturer() { return manufacturer; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public double getPrice() { return price; }
    public boolean isReserved() { return isReserved; }

    public void printProductInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + dateFormat.format(productionDate));
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + countryOfOrigin);
        System.out.println("Цена: $" + price);
        System.out.println("Статус: " + (isReserved ? "Забронирован" : "Доступен"));
        System.out.println("---------------------");
    }
}