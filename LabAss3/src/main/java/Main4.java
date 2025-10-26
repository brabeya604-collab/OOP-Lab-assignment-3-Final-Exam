// Program 4: Abstract class Animal with eat() and sleep()

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat.");
    }

    void sleep() {
        System.out.println("Lion sleeps during the day.");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats fresh prey.");
    }

    void sleep() {
        System.out.println("Tiger sleeps in the shade.");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass and leaves.");
    }

    void sleep() {
        System.out.println("Deer sleeps lightly in the forest.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }
}
