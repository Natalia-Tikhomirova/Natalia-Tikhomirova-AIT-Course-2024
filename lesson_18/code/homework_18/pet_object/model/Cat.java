package homework_18.pet_object.model;

// - порода
// - рост
// - вес

public class Cat  extends Pet{

    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String petType, int age, String name, String breed, double height, double weight) {
        super(id, petType, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public void petVoice(){
        System.out.println( getName() + " сказала: Мяу!");
    }
} // end of class
