package homework_22.address;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AddressTest {

    private Address address;
    final String validcity = "Moscow";
    final int validindex = 12345;

    @BeforeEach
    void setUp() {
        address = new Address(validcity, validindex);
    }

    @Test
    void testValidCity() {
        address.setCity(validcity);
        assertEquals("Moscow", address.getCity());
    }
    @Test
    void testValidIndex() {
        address.setIndex(validindex);
        assertEquals(12345, address.getIndex());
    }

    @Test
    void testinValidCity() {
        address.setCity("moscow");
        assertEquals(validcity, address.getCity(), "City with lowercase should not be valid");
    }

    @Test
    void testNullCity(){
        address.setCity(null);
        assertEquals(validcity, address.getCity(),"City should not be null");
    }

    @Test
    void testEmptyCity(){
        address.setCity("");
        assertEquals(validcity, address.getCity());
    }


    @Test
    void testInvalidIndexToShort(){
        address.setIndex(1234);
        assertEquals(validindex,address.getIndex());
    }

    @Test
    void testInvalidIndexToLong(){
        address.setIndex(123456);
        assertEquals(validindex,address.getIndex());
    }
} // end of class
