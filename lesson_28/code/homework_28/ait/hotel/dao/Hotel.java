package homework_28.ait.hotel.dao;

import homework_28.ait.hotel.model.Pets;

public interface Hotel {

    boolean addPet(Pets pets,int days);
    Pets findPetsByBreed(String breed);
    Pets findPetsById(int id);
    Pets removePetsWithExpiredStay ();
    double totalEarnings();
    int count();
    void printPets();


} // end of class
