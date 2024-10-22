package homework_28.ait.hotel.dao;

import homework_28.ait.hotel.model.Pet;

public class HotelImpl implements Hotel {

    private Pet[] pets;
    private int []stayDuration;
    private int count;

    public HotelImpl(int capacity) {
        this.pets = new Pet[capacity];
        this.stayDuration = new int[capacity];
        this.count = 0;
    }


    @Override
    public boolean addPet(Pet pet, int days) {
        if(count >= pets.length){ // почему не получается через просто pets.length
            return false;
        }
        if(pets == null || days <= 0){
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (this.pets[i].getId() == pet.getId()) { // почему не получается через просто pets.length
                return false;
            }
        }
        pets[count] = pet;
        stayDuration[count] = days;
        count++;
        return true;
    }

    @Override
    public Pet findPetsByBreed(String breed) {
        for (int i = 0; i < count; i++) {
            if(pets[i].getBreed().equals(breed)){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pet findPetsById(int id) {
        for (int i = 0; i < count; i++) {
            if(pets[i].getId() == id){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pet removePetsWithExpiredStay() {
        for (int i = 0; i < count; i++) {
            if(stayDuration[i] <= 0){
                Pet removedPet = pets[i];

                pets[i] = pets[count - 1];
                stayDuration[i] = stayDuration[count - 1];
                pets[count - 1] = null;
                count--;
                return removedPet;
            }
        }
        return null;
    }


    @Override
    public double totalEarnings() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = pets[i].getDailyRate() * stayDuration[i];
        }
        return total;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void printPets() {
        for (int i = 0; i < count; i++) {
            System.out.println(pets[i]);
        }
    }
} // end of class