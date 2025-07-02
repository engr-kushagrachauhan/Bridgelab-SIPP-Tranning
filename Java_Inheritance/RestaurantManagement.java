package Java_Inheritance;

interface Worker {
    void performDuties();
}

class Persons {
    String name;
    int id;
}

class Chef extends Persons implements Worker {
    public void performDuties() {
        System.out.println(name + " cooks food.");
    }
}

class Waiter extends Persons implements Worker {
    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Worker w1 = new Chef();
        ((Chef)w1).name = "Gordon";
        w1.performDuties();

        Worker w2 = new Waiter();
        ((Waiter)w2).name = "James";
        w2.performDuties();
    }
}