package Java_Inheritance;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentor;

    void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentor);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.name = "Alice";
        e.id = 1;
        e.salary = 70000;
        ((Developer)e).programmingLanguage = "Java";
        e.displayDetails();
    }
}