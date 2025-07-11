import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attractions;

    // Конструктор парка
    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    // Внутренний класс для аттракционов
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("Аттракцион: %s | Время работы: %s | Цена: %.2f руб.",
                    attractionName, workingHours, price);
        }
    }
}