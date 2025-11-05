package animals;
//makesound- полиморфизм, один и тот же метод, но поведение разное из за конкретного животного
public class Lion extends Vertebrate {

    public Lion(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " рычит: Рррр!");
    }

    @Override
    public void feed() {
        System.out.println(getName() + " ест мясо.");
    }

    public String toString() {
        return getName();
    }
}