package staff;

import zoo.Enclosure;
import animals.Animal;

public class Zookeeper implements Staff {

    @Override
    public void work() {
        System.out.println("Смотритель ухаживает за животными");
    }

    @Override
    public void cleanEnclosure(Enclosure enclosure) {
        System.out.println("Смотритель чистит вольер");
    }

    
    public void feedAnimalsInEnclosure(Enclosure enclosure) {
        for (Animal a : enclosure.getAnimals()) {
            a.feed();  
        }
    }
}