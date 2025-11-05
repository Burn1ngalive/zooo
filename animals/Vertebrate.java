package animals;

public abstract class Vertebrate implements Animal {
    private String name;
    private int age;
    private double weight;

    public Vertebrate(String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Имя не может быть пустым");
        this.name = name;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) {
        if (weight <= 0) throw new IllegalArgumentException("Вес должен быть положительным");
        this.weight = weight;
    }

    public void sleep() { System.out.println(name + " спит..."); }
    public void move() { System.out.println(name + " двигается."); }

    public abstract void makeSound();
    public abstract void feed();
}