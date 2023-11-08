// Interface defining an employee
interface Employee {
    void work();
}

// Base class for a person
class Person {
    private String name;

    // Constructor to set the name
    public Person(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}

// Class representing a Manager, extending Person and implementing Employee interface
class Manager extends Person implements Employee {
    public Manager(String name) {
        super(name);
    }

    // Implementation of work() method from Employee interface
    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }
}

// Class representing a Worker, extending Person and implementing Employee interface
class Worker extends Person implements Employee {
    public Worker(String name) {
        super(name);
    }

    // Implementation of work() method from Employee interface
    @Override
    public void work() {
        System.out.println(getName() + " is working on a task.");
    }
}

// Main class to demonstrate employees
public class KaberukaCompanywrk2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Kaberuka");
        Worker worker = new Worker("Regis");

        // Call the work() method for manager and worker
        manager.work();
        worker.work();
    }
}
