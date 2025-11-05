package animals;
//makesound- полиморфизм, один и тот же метод, но поведение разное из за конкретного животного
public class Snake extends Reptile {

    public Snake(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " шипит: Шшш!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест мышей.");
    }

    public String toString() {
        return getName();
    }
}