// Запускатор всех 4 тестов ;)
import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        // Создаем экземпляр TestNG
        TestNG testNG = new TestNG();

        // Список классов с тестами
        List<Class<?>> testClasses = new ArrayList<>();
        testClasses.add(FactorialCalculatorTest.class);
        testClasses.add(TriangleAreaTest.class);
        testClasses.add(ArithmeticOperationsTest.class);
        testClasses.add(NumberComparatorTest.class);

        // Устанавливаем классы для запуска
        testNG.setTestClasses(testClasses.toArray(new Class[0]));

        // Запускаем тесты
        testNG.run();

        // Проверяем статус выполнения
        if (testNG.hasFailure()) {
            System.exit(1); // Код ошибки, если есть падающие тесты
        } else {
            System.exit(0); // Успех
        }
    }
}