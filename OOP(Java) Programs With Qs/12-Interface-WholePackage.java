package allinone;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("FountainPen is writing...");
    }

    void refill() {
        System.out.println("FountainPen is being refilled...");
    }

    void changeNib() {
        System.out.println("Nib changed.");
    }
}

class Monkey {
    void jump() {
        System.out.println("Monkey jumps.");
    }

    void bite() {
        System.out.println("Monkey bites.");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Human eats.");
    }

    public void sleep() {
        System.out.println("Human sleeps.");
    }

    void speak() {
        System.out.println("Human speaks.");
    }
}

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    void ring() {
        System.out.println("SmartTelephone rings.");
    }

    void lift() {
        System.out.println("Call lifted.");
    }

    void disconnect() {
        System.out.println("Call disconnected.");
    }
}

interface TVRemote {
    void powerOn();
    void powerOff();
}

interface SmartTVRemote extends TVRemote {
    void openApp(String app);
}

class TV implements TVRemote {
    public void powerOn() {
        System.out.println("TV on.");
    }

    public void powerOff() {
        System.out.println("TV off.");
    }
}

public class MainProgram {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();

        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        h.speak();

        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();

        Monkey m = new Human();
        m.jump();
        m.bite();

        TV tv = new TV();
        tv.powerOn();
        tv.powerOff();
    }
}