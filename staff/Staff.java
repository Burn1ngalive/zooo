package staff;

public abstract class Staff {
    protected String id;
    protected double salary;

    public Staff(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}