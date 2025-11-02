package OOPs;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Alice", 101);
        Employee emp2 = new Developer("Bob", 102);

        emp1.showDetails();
        emp1.work(); // Polymorphic call

        emp2.showDetails();
        emp2.work(); // Polymorphic call
    }
}