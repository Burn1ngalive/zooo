package animals;
//змея наследуется от рептилий(reptile), не от позвоночных(vertebrate)
public abstract class Reptile extends Vertebrate {

    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }

    public void crawl() {
        System.out.println(getName() + " ползёт.");
    }
}