package Java_Inheritance;

class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println(name + " is a Teacher of " + subject);
    }
}

class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println(name + " works in " + department + " department");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Smith";
        t.subject = "Math";
        t.displayRole();
    }
}