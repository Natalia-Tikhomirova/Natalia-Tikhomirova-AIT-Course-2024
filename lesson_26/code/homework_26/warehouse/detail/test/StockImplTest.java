package homework_26.warehouse.detail.test;

import homework_26.warehouse.detail.dao.Stock;
import homework_26.warehouse.detail.dao.StockImpl;
import homework_26.warehouse.detail.model.Detail;
import homework_26.warehouse.detail.model.Gear;
import homework_26.warehouse.detail.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StockImplTest {

     Stock stock;
     Detail[] details;

    @BeforeEach
    void setUp() {

        stock = new StockImpl(10);
        details = new Detail[5];
        details[0] = new Gear(1234567890L,10,"M","V",1.5,0.5,5);
        details[1] = new Gear(1234567891L,15,"M1","V1",2,0.5,5);
        details[2] = new Gear(1234567892L,11,"M2","V2",2.5,0.5,5);
        details[3] = new Lever(1234567893L,16,"M1","V3",3.5,15);
        details[4] = new Lever(1234567894L,120,"M1","V4",1,25);

    }

    @Test
    void addDetail() {
    }

    @Test
    void findDetail() {
    }

    @Test
    void updateDetail() {
    }

    @Test
    void removeDetail() {
    }

    @Test
    void totalWeight() {
    }

    @Test
    void averageWeight() {
    }
} // end of class