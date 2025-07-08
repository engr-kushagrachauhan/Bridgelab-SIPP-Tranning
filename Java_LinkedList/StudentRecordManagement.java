package Java_LinkedList;
class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentRecordManagement {
    Student head;

    public void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();
        srm.head = new Student(1, "John", 20, 'A');
        srm.head.next = new Student(2, "Alice", 21, 'B');
        srm.display();
    }
}