package homework_26.warehouse.detail.dao;

// •	унаследовать методы из интерфейса Stock

import homework_26.warehouse.detail.model.Detail;

public class StockImpl implements Stock{

    private Detail[]details;
    private int size;

    public StockImpl(int capacity) {
        this.details = new Detail[capacity];
        this.size = size;
    }

    @Override
    public boolean addDetail(Detail detail) {
        return false;
    }

    @Override
    public Detail findDetail(long barCode) {
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        return null;
    }

    @Override
    public double totalWeight() {
        return 0;
    }

    @Override
    public double averageWeight() {
        return 0;
    }
} // end of class
