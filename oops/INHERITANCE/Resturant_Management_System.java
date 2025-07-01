package OOPS.INHERITANCE;

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class Resturant_Management_System {
    public static void main(String[] args) {
        Worker w1 = new Chef("Marco", 201);
        Worker w2 = new Waiter("Anna", 202);

        w1.performDuties();
        w2.performDuties();
    }
}
