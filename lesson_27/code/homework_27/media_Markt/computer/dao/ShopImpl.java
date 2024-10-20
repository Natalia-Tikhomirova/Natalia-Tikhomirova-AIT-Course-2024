package homework_27.media_Markt.computer.dao;

import homework_27.media_Markt.computer.model.Computer;

public class ShopImpl implements Shop {

     private Computer[]computers;
     private int size;

    public ShopImpl( int capacity) {
        this.computers = new Computer[capacity];
        this.size = 0;
    }


    @Override
    public boolean addComputer(Computer computer) {
        if(computer == null){
            return false;
        }
        if(size == computers.length){
            return false;
        }

        if(findComputerByBarCode(computer.getBarCode()) != null){
            return false;
        }
        computers[size] = computer;
        size++;
        return true;

    }

    @Override
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }

    @Override
    public Computer findComputerByBarCode(long barCode) {
        for (int i = 0; i < size; i++) {
            if(computers[i].getBarCode() == barCode){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer removeComputer(long barCode) {
        for (int i = 0; i < size; i++) {
            if(computers[i] != null && computers[i].getBarCode() == barCode){
                Computer victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
     public boolean findDiscountedComputers(){
        boolean discountedComputers = false; // Флаг для проверки наличия компьютеров со скидкой

        for (int i = 0; i < size; i++) {

            if (computers[i] != null && computers[i].isDiscount()) {
                discountedComputers = true;
                break;
            }
        }
        if(discountedComputers){
            System.out.println("Computers with discount: ");
            for (int i = 0; i < size; i++) {
                if(computers[i] != null && computers[i].isDiscount()){
                    System.out.println(computers[i]);
                }
            }
        }else {
            System.out.println("No discounted computers available.");
        }
        return discountedComputers;
    }

    @Override
    public  int size(){
        return size;
    }

} // end of class
