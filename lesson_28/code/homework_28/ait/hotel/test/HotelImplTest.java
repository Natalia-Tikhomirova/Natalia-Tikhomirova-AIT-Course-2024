package homework_28.ait.hotel.test;

import homework_28.ait.hotel.dao.Hotel;
import homework_28.ait.hotel.dao.HotelImpl;
import homework_28.ait.hotel.model.Cat;
import homework_28.ait.hotel.model.Dog;
import homework_28.ait.hotel.model.Pets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HotelImplTest {

    private Hotel hotel;
    private Pets[]pets;

    @BeforeEach
    void setUp() {
        hotel = new HotelImpl(10);
        pets = new Pets[5];

        pets[0] = new Dog(1,"Cirneco dell'Etna",9,"Birbo",5,"dog");
        pets[1] = new Dog(2,"Cirneco dell'Etna",4,"Turbo",7,"dog");
        pets[2] = new Dog(3,"Cirneco dell'Etna",7,"James",3,"dog");
        pets[3] = new Cat(4,"Oriental",12,"Bagira",14,"cat");
        pets[4] = new Cat(5,"British",13,"Plusha",10,"cat");

        // TODO add pets to hotel
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int days = random.nextInt(30) + 1;
            hotel.addPet(pets[i],days);
        }
    }

    @Test
    void testAddPetTest() {
        assertTrue(hotel.addPet(pets[0],5 ));
        assertFalse(hotel.addPet(pets[0], 7));
        assertTrue(hotel.addPet(new Dog(2, "Cirneco dell'Etna", 4, "Birbo", 7, "dog"), 6));
    }

    @Test
    void testFindPetsByBreedTest() {


    }

    @Test
    void testFindPetsByIdTest() {

    }

    @Test
    void testRemovePetsWithExpiredStayTest() {
        hotel.addPet(pets[0], 0);
        hotel.addPet(pets[1], 2);
        hotel.removePetsWithExpiredStay();
        assertEquals(5, hotel.count());
    }

    @Test
    void testTotalEarningsTest() {
    }

    @Test
    void testCountTest() {
        assertEquals(5,hotel.count());
    }

    @Test
    void testPrintPetsTest() {
        hotel.printPets();
    }
} // end of class