package animals;

public abstract class Vertebrate extends Animal {

    public Vertebrate(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public void move() {
        System.out.println(name + " движется.");
    }
}