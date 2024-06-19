package abstractClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal", "big", 100.0);

        Dog dog = new Dog("Wolf", "big", 100.0);
        dog.makeNoise();

//        Dog dog2 = new Dog("German shepherd", "big", 100.0);
//        dog2.makeNoise();
        doAnimalStuff(dog);

//        USING ARRAY LISTS TO STORE ABSTRACT DETAILS
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German shepherd", "big", 100.0));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Puffer fish", "big", 89));
        animals.add(new Dog("Pug", "small", 20));

        animals.add(new Horse("Friesian", "large", 1000));

        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
