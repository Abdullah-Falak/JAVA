// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass: Lion
class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    void sound() {
        System.out.println("Lion roars.");
    }
}

// Subclass: Tiger
class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats deer and wild boar.");
    }

    @Override
    void sound() {
        System.out.println("Tiger growls.");
    }
}

// Subclass: Panther
class Panther extends Animal {
    @Override
    void eat() {
        System.out.println("Panther eats small mammals and birds.");
    }

    @Override
    void sound() {
        System.out.println("Panther snarls.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();

        System.out.println("Lion:");
        lion.eat();
        lion.sound();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();

        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}