package org.example;

import java.util.Map;
import java.util.HashMap;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Double> grades;

    public Student(String name, String group, int course, Map<String, Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>(grades);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        return grades.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void promoteToNextCourse() {
        this.course++;
    }

    // Геттеры
    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public Map<String, Double> getGrades() { return new HashMap<>(grades); }

    @Override
    public String toString() {
        return String.format(
                "Студент: %s, Группа: %s, Курс: %d, Средний балл: %.2f",
                name, group, course, calculateAverageGrade()
        );
    }
}
