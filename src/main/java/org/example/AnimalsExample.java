package org.example;
class Animal {
    private static int animalCount = 0;
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected boolean canSwim;

    public Animal(String name, int runLimit, int swimLimit, boolean canSwim) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.canSwim = canSwim;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + runLimit + " м.)");
        }
    }

    public void swim(int distance) {
        if (!canSwim) {
            System.out.println(name + " не умеет плавать.");
            return;
        }
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + swimLimit + " м.)");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10, true);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFed;

    public Cat(String name) {
        super(name, 200, 0, false);
        this.isFed = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFed = true;
            System.out.println(name + " поел из миски и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть из миски. Недостаточно еды.");
        }
    }

    public boolean isFed() {
        return isFed;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            System.out.println("Количество еды должно быть положительным.");
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

public class AnimalsExample {
    public static void main(String[] args) {
        // Тестирование животных
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog.run(150);
        dog.run(600);
        dog.swim(5);
        dog.swim(15);

        cat.run(100);
        cat.run(250);
        cat.swim(5);

        // Тестирование котов и миски
        Bowl bowl = new Bowl(30);
        Cat[] cats = {
                new Cat("Васька"),
                new Cat("Рыжик"),
                new Cat("Черныш"),
                new Cat("Пушок")
        };

        // Кормим всех котов
        for (Cat c : cats) {
            c.eat(bowl, 10);
        }

        // Проверяем сытость
        for (Cat c : cats) {
            System.out.println(c.name + " сыт: " + c.isFed());
        }

        // Добавляем еду в миску
        bowl.addFood(20);

        // Пробуем покормить снова
        cats[0].eat(bowl, 10);
        System.out.println(cats[0].name + " сыт: " + cats[0].isFed());// Выводим статистику
        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}
