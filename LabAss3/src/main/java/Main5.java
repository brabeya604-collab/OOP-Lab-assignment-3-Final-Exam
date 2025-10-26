// Program 5: Abstract class Employee

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double basicSalary;
    double bonus;

    Manager(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 50000, 10000);
        Employee programmer = new Programmer("Bob", 102, 800, 60);

        manager.displayInfo();
        System.out.println();
        programmer.displayInfo();
    }
}

