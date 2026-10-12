package gestionzoo.main;
import gestionzoo.entite.*;
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Instruction 21 : Constructeurs par defaut
        Aquatic aquaticDefault = new Aquatic();
        Terrestrial terrestrialDefault = new Terrestrial();
        Dauphin dolphinDefault = new Dauphin();
        Pingouin penguinDefault = new Pingouin();
        System.out.println("========== PROSIT 5 : DEFAULT CONSTRUCTORS ==========");
        System.out.println(aquaticDefault);
        System.out.println(terrestrialDefault);
        System.out.println(dolphinDefault);
        System.out.println(penguinDefault);
        System.out.println();

        // Instruction 22 : Constructeurs parametres
        Aquatic aquatic = new Aquatic("Fish", "Shark", 3, false, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Mammal", "Dog", 4, true, 4);
        Dauphin dolphin = new Dauphin("Delphinidae", "Flipper", 6, true, "Sea", 32.5f);
        Pingouin penguin = new Pingouin("Spheniscidae", "Kowalski", 2, false, "Iceberg", 50.0f);

        // Instruction 23 : Redefinition de toString()
        System.out.println("========== PROSIT 5 : TOSTRING ==========");
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 24 : Comportement de nage
        System.out.println("\n========== PROSIT 5 : SWIM ==========");
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        System.out.println("=========================================\n");
        String zooName;
        int nbrCages;

        do {

            System.out.print("Enter the zoo name: ");
            zooName = scanner.nextLine();
            if (zooName.trim().isEmpty()) {
                System.out.println("Error: zoo name cannot be empty.");
            }

        } while (zooName.trim().isEmpty());

        do {

            System.out.print("Enter the number of cages: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: please enter a number.");
                scanner.next();
                System.out.print("Enter the number of cages: ");
            }

            nbrCages = scanner.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Error: number of cages must be positive.");
            }
        } while (nbrCages <= 0);

        Zoo myzoo = new Zoo();

        myzoo.setName(zooName);
        myzoo.setCity("Tunis");
        myzoo.setNbrCages(nbrCages);

        Zoo myzoo2 = new Zoo(
                "myzoo2",
                "London",
                15
        );

        Animal lion = new Animal(
                "Felidae",
                "Lion",
                5,
                true
        );     
        Animal elephant = new Animal(
                "Elephantidae",
                "Elephant",
                10,
                true
        );


        Animal tiger = new Animal(
                "Felidae",
                "Tiger",
                3,
                true
        );


        Animal crocodile = new Animal(
                "Crocodylidae",
                "Crocodile",
                7,
                false
        );


        Animal giraffe = new Animal(
                "Giraffidae",
                "Giraffe",
                4,
                true
        );

        Animal giraffe2 = new Animal(
                "Giraffidae",
                "Giraffe",
                5,
                false
        );

        Animal monkey = new Animal(
                "Cercopithecidae",
                "Monkey",
                2,
                true
        );

        myzoo.addAnimal(lion);
        myzoo.addAnimal(elephant);
        myzoo.addAnimal(tiger);
        myzoo.addAnimal(crocodile);
        myzoo.addAnimal(giraffe);

        System.out.println("\n========== ZOO INFO ==========");

        myzoo.displayzooInfo();

        System.out.println("\n========== ANIMALS ==========");

        myzoo.displayAnimals();

        System.out.println("\n========== SEARCH ==========");

        System.out.println("Position of giraffe: " + myzoo.searchAnimal(giraffe));

        System.out.println("Position of giraffe2: " + myzoo.searchAnimal(giraffe2));

        System.out.println("\n========== DUPLICATE TEST ==========");

        myzoo.addAnimal(giraffe);

        System.out.println("\n========== REMOVE ==========");

        boolean removed = myzoo.removeAnimal(tiger);

        System.out.println("Tiger removed: " + removed);

        System.out.println("\nAnimals after removing Tiger:");

        myzoo.displayAnimals();

        System.out.println("\n========== FULL TEST ==========");

        System.out.println("Is zoo full? " + myzoo.isZooFull());

        myzoo.addAnimal(monkey);

        System.out.println("\n========== COMPARE ZOOS ==========");

        myzoo2.addAnimal(
                new Animal(
                        "Felidae",
                        "Tiger",
                        3,
                        true
                )
        );

        myzoo2.addAnimal(
                new Animal(
                        "Felidae",
                        "Lion",
                        5,
                        true
                )
        );

        Zoo biggerZoo = myzoo.compareZoo(
                myzoo,
                myzoo2
        );

        System.out.println("Zoo with more animals: " + biggerZoo.getName());

        System.out.println("Number of animals: " + biggerZoo.numberOfAnimals());

        scanner.close();
    }
}