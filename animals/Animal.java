package animals;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " ест корм.");
    }
}