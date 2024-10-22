package homework_28.ait.hotel.model;

import java.util.Objects;

public class Dog extends Pet {

    private String petType;

    public Dog(int id, String breed, int age, String name, double dailyRate, String petType) {
        super(id, breed, age, name, dailyRate);
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(petType, dog.petType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), petType);
    }
} // end of class
