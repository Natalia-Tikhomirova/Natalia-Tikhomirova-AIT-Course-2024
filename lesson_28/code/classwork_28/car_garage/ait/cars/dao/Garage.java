package classwork_28.car_garage.ait.cars.dao;

import classwork_28.car_garage.ait.cars.model.Car;

public interface Garage {

    boolean addCar(Car car);
    Car removeCar(String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findcarsByModel(String model);
    Car[] findcarsByCompany(String company);
    Car[] findcarsByEngine(double min, double max);
    Car[] findcarsByColor(String color);
    int size();
    void printCars();



}
