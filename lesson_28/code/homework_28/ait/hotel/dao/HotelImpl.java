package homework_28.ait.hotel.dao;

import homework_28.ait.hotel.model.Pets;

public class HotelImpl implements Hotel {

    private Pets[] pets;
    private double[]stayDuration;
    private int count;

    public HotelImpl(int capacity) {
        this.pets = new Pets[capacity];
        this.stayDuration = new double[capacity];
        this.count = 0;
    }


    @Override
    public boolean addPet(Pets pets, int days) {
        if(count >= this.pets.length){
            return false;
        }
        if(pets == null || days <= 0){
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (this.pets[i].getId() == pets.getId()) {
                return false;
            }
        }
        this.pets[count] = pets;
        stayDuration[count] = days;
        count++;
        return true;
    }

    @Override
    public Pets findPetsByBreed(String breed) {
        for (int i = 0; i < count; i++) {
            if(pets[i].getBreed().equals(breed)){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public Pets findPetsById(int id) {
        for (int i = 0; i < count; i++) {
            if(pets[i].getId() == id){
                return pets[i];
            }
        }
        return null;
    }

    @Override
    public  Pets removePetsWithExpiredStay() {
        for (int i = 0; i < count; i++) {
            if(stayDuration[i] <= 0){
                Pets removedPet = pets[i];

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