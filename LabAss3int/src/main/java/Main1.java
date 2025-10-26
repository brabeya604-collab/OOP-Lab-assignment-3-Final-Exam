// Program 1: Interface Shape with Rectangle, Circle, Triangle

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 3);
        Shape c = new Circle(4);
        Shape t = new Triangle(6, 2);

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Triangle Area: " + t.getArea());
    }
}
