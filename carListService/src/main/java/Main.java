import service.CarManager;

// Главный класс приложения
public class Main {

    // Метод main, точка входа в программу
    public static void main(String[] args) {
        // Создание объекта класса CarManager
        CarManager carManager = new CarManager();
        // Запуск управления автомобилями
        carManager.startCarManager();
    }
}

