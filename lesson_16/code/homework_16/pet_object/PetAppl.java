package homework_16.pet_object;

import homework_16.pet_object.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1,"dog1", 9, "Birbo" );
        Pet pet2 = new Pet(2,"dog2", 7, "James" );
        Pet pet3 = new Pet(3,"dog3", 4, "Turbo" );
        Pet pet4 = new Pet(4,"dog4", 5, "Bruce" );
        Pet pet5 = new Pet(5,"cat", 12, "Bagira" );

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(pet4);
        System.out.println(pet5);

        System.out.println("_________________________________________________________________");

        //System.out.println("The animal : " + pet1 + " eat.");
        //System.out.println("The animal : " + pet2 + " sleep.");
        //System.out.println("The animal : " + pet3 + " bark.");
        //System.out.println("The animal : " + pet4 + " walk.");
        //System.out.println("The animal : " + pet5 + " play.");

        System.out.println("___________________________________________________________________");

        pet1.eat();
        pet2.sleep();
        pet3.petVoice();
        pet4.walk();
        pet5.play();

    }
}
