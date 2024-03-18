package entity;

// Класс для представления автомобиля
public class Car {
    private String brand;
    private int year;
    private String regNumber;

    // Конструктор для создания объекта автомобиля
    public Car(String brand, int year, String regNumber) {
        this.brand = brand;
        this.year = year;
        this.regNumber = regNumber;
    }

    // Методы доступа к полям объекта автомобиля
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getRegNumber() {
        return regNumber;
    }

    // Переопределение метода toString для вывода информации об автомобиле
    public String toString() {
        return brand + ", " + year + ", " + regNumber;
    }
}
