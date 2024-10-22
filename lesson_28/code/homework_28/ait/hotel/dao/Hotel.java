package homework_28.ait.hotel.dao;

import homework_28.ait.hotel.model.Pet;

public interface Hotel {

    boolean addPet(Pet pets, int days);
    Pet findPetsByBreed(String breed);
    Pet findPetsById(int id);
    Pet removePetsWithExpiredStay ();
    double totalEarnings();
    int count();
    void printPets();


} // end of class
