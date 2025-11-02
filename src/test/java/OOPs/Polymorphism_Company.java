package OOPs;

public class Polymorphism_Company {
    public static void main(String[] args) {
        Abstraction_Employee emp1 = new Manager("Alice", 101);
        Abstraction_Employee emp2 = new Developer("Bob", 102);

        emp1.showDetails();
        emp1.work(); // Polymorphic call

        emp2.showDetails();
        emp2.work(); // Polymorphic call
    }
}