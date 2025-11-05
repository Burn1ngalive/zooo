import animals.*;
import staff.Veterinarian;
import staff.Zookeeper;
import zoo.Enclosure;

public class Main {
    public static void main(String[] args) {
       
        Lion simba = new Lion("Симба", 5, 190);
        Elephant dumbo = new Elephant("Дамбо", 10, 5000);
        Snake kaa = new Snake("Каа", 2, 15);

        Enclosure zoo = new Enclosure();

        zoo.addAnimal(simba);
        zoo.addAnimal(dumbo);
        zoo.addAnimal(kaa);

        System.out.println("\nВсе животные издают звуки:");
        zoo.makeAllSounds();

        System.out.println("\nКормим всех животных:");
        zoo.feedAll();

        Veterinarian vet = new Veterinarian("12345", 50000);
        Zookeeper keeper = new Zookeeper();

        System.out.println("\nДействия персонала:");
        vet.work();
        vet.examineAnimal(simba);  
        keeper.work();
        keeper.feedAnimalsInEnclosure(zoo);

    }
}