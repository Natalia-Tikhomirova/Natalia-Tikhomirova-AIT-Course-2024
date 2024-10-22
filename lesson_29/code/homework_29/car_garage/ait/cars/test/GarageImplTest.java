package homework_29.car_garage.ait.cars.test;

import homework_28.ait.employee.model.Employee;
import homework_29.car_garage.ait.cars.dao.Garage;
import homework_29.car_garage.ait.cars.dao.GarageImpl;
import homework_29.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[]cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        // TODO add cars to garage

        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCarTest() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car newCar = new Car("Number5", "Model5", "Company3", 2.0, "Green");
        assertTrue(garage.addCar(newCar));
        assertEquals(5,garage.size());
        Car oneMoreCar = new Car("Number6", "Model4", "Company2", 2.0, "Green");
        assertFalse(garage.addCar(oneMoreCar));
    }

    @Test
    void removeCarTest() {

        assertEquals(cars[2],garage.removeCar("Number3"));
        assertEquals(3,garage.size());
        assertNull(garage.removeCar("Number6"));
    }

    @Test
    void findCarRegNumberTest() {
        assertEquals(cars[3],garage.findCarByRegNumber("Number4"));
        assertNull(garage.findCarByRegNumber("Number7"));

    }

    @Test
    void findcarsByModelTest() {
        Car[]expected = {cars[0],cars[2]};
        Car[]actual = garage.findcarsByModel("Model1");
        assertArrayEquals(expected,actual);
    }

    @Test
    void findcarsByCompanyTest() {
        Car[]expected = {cars[0], cars[1]};
        Car[]actual = garage.findcarsByCompany("Company1");
        assertArrayEquals(expected,actual);
    }

    @Test
    void findcarsByEngineTest() {
        Car[] expected = {cars[3]};
        Car[] actual = garage.findcarsByEngine(1.5,2.5);
        assertArrayEquals(expected,actual);



    }

    @Test
    void findcarsByColorTest() {
        Car[]expected = {cars[0],cars[2]};
        Car[]actual = garage.findcarsByModel("Model1");
        assertArrayEquals(expected,actual);
    }


    @Test
    void testSize() {
        assertEquals(4,garage.size());
    }


    @Test
    void testPrintCars() {
        garage.printCars();
    }
} // end of class