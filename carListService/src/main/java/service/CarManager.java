package service;

import entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Класс для управления автомобилями
public class CarManager {
    private List<Car> carList;

    // Конструктор, инициализирующий список автомобилей
    public CarManager() {
        carList = new ArrayList<>();
    }

    // Метод для добавления нового автомобиля в список
    public void addCar(String brand, int year, String regNumber) {
        Car newCar = new Car(brand, year, regNumber);
        if (!carList.contains(newCar)) {
            carList.add(newCar);
            displayAllCars();
        } else {
            System.out.println("Автомобиль с таким номером уже существует.");
            displayAllCars();
        }
    }



    // Метод для удаления автомобиля из списка по номеру регистрации
    public void removeCar(String regNumber) {
        carList.removeIf(car -> car.getRegNumber().equals(regNumber));
        displayAllCars();
    }

    // Метод для удаления всех автомобилей из списка
    public void removeAllCars() {
        carList.clear();
        displayAllCars();
    }

    // Метод для отображения всех автомобилей в списке
    public void displayAllCars() {
        System.out.println("\nТекущий список автомобилей:");
        for (Car car : carList) {
            System.out.println(car.toString());
        }
    }

    // Метод для запуска управления автомобилями
    public void startCarManager() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Добавить новый автомобиль\n2. Удалить автомобиль по номеру регистрации\n3. Удалить все автомобили\n4. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите марку: ");
                    scanner.nextLine();
                    String brand = scanner.nextLine();

                    System.out.print("Введите год выпуска: ");
                    int year = scanner.nextInt();

                    System.out.print("Введите номер регистрации: ");
                    scanner.nextLine();
                    String regNumber = scanner.nextLine();

                    addCar(brand, year, regNumber);
                    break;
                case 2:
                    System.out.print("Введите номер регистрации автомобиля для удаления: ");
                    scanner.nextLine();
                    String regNumToRemove = scanner.nextLine();

                    removeCar(regNumToRemove);
                    break;
                case 3:
                    removeAllCars();
                    break;
                case 4:
                    displayAllCars();
                    System.out.println("Завершение программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте снова.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}















