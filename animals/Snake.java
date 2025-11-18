package animals;

public class Snake extends Animal {

    public Snake(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " шипит: Шшшш!");
    }
}