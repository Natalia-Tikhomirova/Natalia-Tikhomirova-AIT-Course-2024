package homework_28.ait.hotel.model;

import java.util.Objects;

public abstract class Pets {

    protected int id;
    protected String breed;
    protected int age;
    protected String name;
    double dailyRate; // ставка за сутки

    public Pets(int id, String breed, int age, String name, double dailyRate) {
        this.id = id;
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pets pets)) return false;
        return id == pets.id && Double.compare(dailyRate, pets.dailyRate) == 0 && Objects.equals(breed, pets.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, breed, dailyRate);


    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pets{");
        sb.append("id=").append(id);
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dailyRate=").append(dailyRate);
        sb.append('}');
        return sb.toString();
    }
} // end of class
