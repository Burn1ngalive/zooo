package animals;

public abstract class Reptile extends Vertebrate {

    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void shedSkin() {
        System.out.println(name + " меняет кожу.");
    }
}