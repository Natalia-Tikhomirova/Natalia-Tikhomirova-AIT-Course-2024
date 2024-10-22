package homework_29.car_garage.ait.cars.dao;

import homework_29.car_garage.ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = size;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber() == regNumber){
                Car removedCar = cars[i];
                cars[i] = cars [size - 1];
                cars[size - 1] = null;
                size--;
                return removedCar;
            }
        }

        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)){ // т.к. String, то getRegNumber().equals(regNumber)
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findcarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model)); // или так: model.equals(car.getModel())
    }

    @Override
    public Car[] findcarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findcarsByEngine(double min, double max) {
        return findCarsByPredicate(car -> car.getEngine() > min && car.getEngine() < max);
    }

    @Override
    public Car[] findcarsByColor(String color) {
        return findCarsByPredicate(car -> car.getColor().equals(color));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }

    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[]findCarsByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(cars[i])){ // объект проходит тест
                count++; // тут лежит размер будущего массива
            }
        }
        // читаем массив и перекладываем результаты в новый
       Car[]res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }

} // end of class
