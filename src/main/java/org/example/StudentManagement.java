package org.example;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class StudentManagement {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Добавление студентов
        students.add(new Student("Иван Иванов", "Группа 101", 1,
                Map.of("Математика", 4.5, "Физика", 4.0, "История", 5.0)));
        students.add(new Student("Петр Петров", "Группа 101", 1,
                Map.of("Математика", 3.0, "Физика", 2.5, "История", 3.5)));
        students.add(new Student("Сидор Сидоров", "Группа 102", 2,
                Map.of("Математика", 2.0, "Физика", 2.0, "История", 2.5)));

        System.out.println("=== Исходный список студентов ===");
        students.forEach(System.out::println);

        removeUnderperformingStudents(students);
        promoteSuccessfulStudents(students);

        System.out.println("\n=== Список после обработки ===");
        students.forEach(System.out::println);

        System.out.println("\n=== Студенты 2 курса ===");
        printStudents(students, 2);
    }

    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.calculateAverageGrade() < 3.0);
    }

    public static void promoteSuccessfulStudents(Set<Student> students) {
        students.forEach(student -> {
            if (student.calculateAverageGrade() >= 3.0) {
                student.promoteToNextCourse();
            }
        });
    }

    public static void printStudents(Set<Student> students, int course) {
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(System.out::println);
    }
}
