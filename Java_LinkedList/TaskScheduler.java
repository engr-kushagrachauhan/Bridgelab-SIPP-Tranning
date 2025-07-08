package Java_LinkedList;
class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {
    Task head;

    public void display() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.name + " with Priority " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        Task t1 = new Task(1, "Email", 1, "2025-07-09");
        Task t2 = new Task(2, "Meeting", 2, "2025-07-10");
        t1.next = t2;
        t2.next = t1;
        ts.head = t1;
        ts.display();
    }
}