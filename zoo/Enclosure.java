package zoo;
//инкапсуляция private-> добавляет/удаляет животного, также полиморфизм(хранение через интерфейс animal)
import animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
            System.out.println(animal + " добавлено в вольер.");
        }
    }

    public void removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println(animal + " удалено из вольера.");
        }
    }

    public void feedAll() {
        for (Animal a : animals) {
            a.feed();
        }
    }

    public void makeAllSounds() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}