package animals;

public class Elephant extends Vertebrate {

    public Elephant(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " трубит: Труууум!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест траву.");
    }

    public String toString() {
        return getName();
    }
}