// Program 1: Abstract class Animal with sound()

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars: Roarrr!");
    }
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger growls: Grrr!");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}
