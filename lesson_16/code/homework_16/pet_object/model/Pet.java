package homework_16.pet_object.model;

// Создать класс Pet (Домашнее животное) с приватными полями:
// - id
// - вид
// - возраст
// - кличка
// Стандартные методы:
// - конструктор на все поля;
// - геттеры и сеттеры на все поля;
// - метод toString.
//Дополнительные методы: спать, есть, делать звук, играть, гулять

public class Pet {

    //field
    private int id;
    private String petType;
    private int age;
    private String name;

    // constructor

    public Pet(int id, String petType, int age, String name) {
        this.id = id;
        this.petType = petType;
        this.age = age;
        this.name = name;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOfTheDog() {
        return name;
    }

    public void setNameOfTheDog(String nameOfTheDog) {
        this.name = nameOfTheDog;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petType='" + petType + '\'' +
                ", age=" + age +
                ", nameOfTheDog='" + name + '\'' +
                '}';
    }

    //Дополнительные методы: спать, есть, делать звук, играть, гулять

    public void sleep(){
        System.out.println( "The animal " + name +  " sleep.");
    }

    public void eat(){
        System.out.println( "The animal " + name + " eat.");
    }
    public void petVoice(){
        System.out.println( "The animal " + name + " bark.");
    }
    public void play(){
        System.out.println( "The animal " + name + " play.");
    }
    public void walk(){
        System.out.println( "The animal " + name + " walk.");
    }

} // end of class
