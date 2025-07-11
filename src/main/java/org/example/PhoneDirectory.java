package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    // Хранилище данных: фамилия -> список телефонов
    private Map<String, List<String>> directory = new HashMap<>();

    /**
     * Добавляет запись в справочник
     * @param surname Фамилия
     * @param phoneNumber Номер телефона
     */
    public void add(String surname, String phoneNumber) {
        // Если фамилии еще нет в справочнике - создаем новую запись
        directory.putIfAbsent(surname, new ArrayList<>());

        // Добавляем телефон к существующей фамилии
        directory.get(surname).add(phoneNumber);
    }

    /**
     * Возвращает список телефонов по фамилии
     * @param surname Фамилия для поиска
     * @return Список телефонов или пустой список, если фамилия не найдена
     */
    public List<String> get(String surname) {
        // Возвращаем копию списка или пустой список, если фамилии нет
        return new ArrayList<>(directory.getOrDefault(surname, List.of()));
    }

    /**
     * Выводит весь справочник (для демонстрации)
     */
    public void printAll() {
        System.out.println("Телефонный справочник:");
        directory.forEach((surname, phones) -> {
            System.out.println(surname + ": " + String.join(", ", phones));
        });
    }
}
