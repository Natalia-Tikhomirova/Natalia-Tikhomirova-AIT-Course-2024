package homework_27.media_Markt.computer.dao;

import homework_27.media_Markt.computer.model.Computer;

public interface Shop {

    boolean addComputer(Computer computer);
    void printComputers();
    Computer findComputerByBarCode(long barCode);
    Computer removeComputer(long barCode);
    boolean findDiscountedComputers();
    int size();

} // end of class
