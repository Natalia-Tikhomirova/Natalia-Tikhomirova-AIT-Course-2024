package homework_16.student_object.model;

 // Создать класс Студент (Student) с приватными полями:
// - id
// - имя
// - фамилия
// - год рождения
// - специализация

// Стандартные методы:
// - конструктор на все поля;
// - геттеры и сеттеры на все поля;
// - метод display.

// Дополнительные методы:
// - учиться
// - взять отпуск
// - сдать экзамен
// - отчислиться

public class Student {

    //field

    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String special;
    private boolean gender;

    // constructor


    public Student(int id, String name, String lastName, int yearOfBirth, String special, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.special = special;
        this.gender = gender;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String displayStudent(){
        return String.format("ID: %d,name: %s, lastName: %s, yearOfBearth: %d, special: %s, gender: %s",id,name,lastName,yearOfBirth,special,gender);
    }

    // Дополнительные методы: учиться, взять отпуск, сдать экзамен, отчислиться.

    public void study(){
        System.out.println( "The student " + name + " " + lastName + " учится.");
    }
    public void vacation(){
        System.out.println( "The student " + name + " " + lastName + " уехал в отпуск.");
    }
    public void exam(){
        System.out.println( "The student " + name + " " +  lastName + " сдает экзамен.");
    }
    public void dropOut(){
        System.out.println( "The student " + name + " " +  lastName + " отчислен.");
    }

} // end of class
