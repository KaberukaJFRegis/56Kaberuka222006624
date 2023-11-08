// Interface defining a family member
interface FamilyMember {
    void introduce();
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

// Class representing a Parent, extending Person and implementing FamilyMember interface
class Parent extends Person implements FamilyMember {
    public Parent(String name) {
        super(name);
    }

    // Implementation of introduce() method from FamilyMember interface
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a parent.");
    }
}

// Class representing a Child, extending Person and implementing FamilyMember interface
class Child extends Person implements FamilyMember {
    public Child(String name) {
        super(name);
    }

    // Implementation of introduce() method from FamilyMember interface
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a child.");
    }
}

// Main class to demonstrate family members
public class KaberukaFamilywrk1 {
    public static void main(String[] args) {
        Parent parent = new Parent("Kaberuka");
        Child child = new Child("John");

        // Call the introduce() method for parent and child
        parent.introduce();
        child.introduce();
    }
}
