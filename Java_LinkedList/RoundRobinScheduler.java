package Java_LinkedList;
class Process {
    int id;
    int burstTime;
    int priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

public class RoundRobinScheduler {
    Process head;

    public void display() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.id + ", Burst Time: " + temp.burstTime);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler rrs = new RoundRobinScheduler();
        Process p1 = new Process(1, 5, 2);
        Process p2 = new Process(2, 3, 1);
        p1.next = p2;
        p2.next = p1;
        rrs.head = p1;
        rrs.display();
    }
}