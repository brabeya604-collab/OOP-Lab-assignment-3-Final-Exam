// Program 2: Animal interface with Dog class

interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}

