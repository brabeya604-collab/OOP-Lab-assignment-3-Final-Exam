// Program 3: Flyable interface with Spacecraft, Airplane, Helicopter

interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft flies in outer space.");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane flies in the sky.");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter hovers and flies at low altitude.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Flyable s = new Spacecraft();
        Flyable a = new Airplane();
        Flyable h = new Helicopter();

        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}
