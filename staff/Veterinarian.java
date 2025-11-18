package staff;

import animals.Animal;

public class Veterinarian extends Staff {

    public Veterinarian(String id, double salary) {
        super(id, salary);
    }

    @Override
    public void work() {
        System.out.println("Ветеринар проводит осмотр животных.");
    }

    public void examineAnimal(Animal animal) {
        System.out.println("Ветеринар осматривает: " + animal.getName());
    }
}