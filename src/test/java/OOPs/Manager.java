package OOPs;

class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }
}

class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code.");
    }
}