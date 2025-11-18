package zoo;

import animals.Animal;
import java.util.ArrayList;

public class Enclosure {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " помещён(а) в вольер.");
    }

    public void makeAllSounds() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public void feedAll() {
        for (Animal a : animals) {
            a.eat();
        }
    }
}