package staff;
// полиморфизм в методе examineanimal берет animal -> вызывает makesound


public class Veterinarian implements Staff {
    private String license;  
    private double salary;   

    public Veterinarian(String license, double salary) {
        setLicense(license);
        setSalary(salary);
    }

    public String getLicense() { return license; }
    public void setLicense(String license) {
        if (license == null || license.isEmpty())
            throw new IllegalArgumentException("Лицензия обязательна");
        this.license = license;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.salary = salary;
    }

    
    @Override
    public void work() {
        System.out.println("Ветеринар работает с животными");
    }

    @Override
    public void cleanEnclosure(zoo.Enclosure enclosure) {
        System.out.println("Ветеринар чистит вольер");
    }

    
    public void examineAnimal(animals.Animal animal) {
        System.out.println("Ветеринар осматривает животное: " + animal);
        animal.makeSound();  
    }
}