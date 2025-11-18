package staff;

import zoo.Enclosure;

public class Zookeeper extends Staff {

    public Zookeeper() {
        super("unknown", 0);
    }

    @Override
    public void work() {
        System.out.println("Смотритель убирает в вольере.");
    }

    public void feedAnimalsInEnclosure(Enclosure enclosure) {
        System.out.println("Смотритель кормит всех животных в вольере.");
        enclosure.feedAll();
    }
}