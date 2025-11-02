package OOPs;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
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