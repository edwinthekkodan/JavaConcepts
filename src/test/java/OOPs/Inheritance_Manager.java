package OOPs;

class Manager extends Abstraction_Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }
}

class Developer extends Abstraction_Employee {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code.");
    }
}