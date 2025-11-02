package OOPs;

abstract class Abstraction_Employee {
    private String name; //encapsulation - accessed via getName()
    private int id; //encapsulation - accessed via getId()

    public Abstraction_Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract void work();

    // Encapsulated access
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}