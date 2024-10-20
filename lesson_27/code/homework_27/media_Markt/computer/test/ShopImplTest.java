package homework_27.media_Markt.computer.test;

import homework_27.media_Markt.computer.dao.Shop;
import homework_27.media_Markt.computer.dao.ShopImpl;
import homework_27.media_Markt.computer.model.Computer;
import homework_27.media_Markt.computer.model.Laptop;
import homework_27.media_Markt.computer.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShopImplTest {

    Shop shop;
    Computer[]computers;
    int size = 0;

    @BeforeEach
    void setUp() {

        shop = new ShopImpl(5);
        computers = new Computer[5];

        computers[0] = new Laptop(1234567890L,"Apple",8,256,"MacBook",1500,true,14,2.5,24,"pink");
        computers[1] = new Laptop(1234567891L,"i5",8,256,"Acer",1500,false,14,2.5,24,"pink");
        computers[2] = new Laptop(1234567892L,"i7",16,512,"HP",2500,true,14,2.5,24,"pink");
        computers[3] = new Smartphone(1234567893L,"Apple",8,512,"Iphone",1500,false,7.6,0.2,24,"blue",123456789101121L);
        computers[4] = new Smartphone(1234567894L,"X1",16,512,"Samsung",2000,true,6.6,0.3,24,"gold",123456789101122L);

        for (int i = 0; i < computers.length; i++) {
            shop.addComputer(computers[i]);
        }
    }

    @Test
    void addComputerTest() {
        assertFalse(shop.addComputer(null));
        assertFalse(shop.addComputer(computers[1]));
    }


    @Test
    void findComputerByBarCodeTest() {
        assertEquals(computers[0],shop.findComputerByBarCode(1234567890L));
        assertNull(shop.findComputerByBarCode(1234567895L));
    }

    @Test
    void removeComputerTest() {
        assertEquals(computers[0],shop.removeComputer(1234567890L));
        assertEquals(4,shop.size());
        assertNull(shop.removeComputer(1234567899L));
    }

    @Test
    void findDiscountedComputers() {
        boolean foundcomputer = shop.findDiscountedComputers();
        assertTrue(foundcomputer,"Computers with discounts should be found.");

    }

    @Test
    void printComputersTest() {
        System.out.println("==========================================");
        shop.printComputers();
    }
}// end of class