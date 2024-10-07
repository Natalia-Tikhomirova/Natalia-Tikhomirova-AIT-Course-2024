package homework_18.pet_object;

import homework_18.pet_object.model.Cat;
import homework_18.pet_object.model.Dog;


public class HouseAppl {

    public static void main(String[] args) {

        Dog dog = new Dog(1,"dog",9,"Birbo","Cirneco dell'Etna",49,13.5);

        Dog dog1 = new Dog(2,"dog",7,"James","Cirneco dell'Etna",48,14.5);

        System.out.println(dog);
        System.out.println(dog1);

        dog.petVoice();
        dog1.petVoice();

        System.out.println("______________________________________________");

        Cat cat = new Cat(1, "cat",12,"Bagira","Oriental",15,5);
        Cat cat1 = new Cat(2, "cat",5,"Musya","Mix",16,6);
        Cat cat2 = new Cat(3, "cat",7,"Plusha","British",20,8);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

        cat.petVoice();
        cat1.petVoice();
        cat2.petVoice();

    } // end of main
} // end of class
