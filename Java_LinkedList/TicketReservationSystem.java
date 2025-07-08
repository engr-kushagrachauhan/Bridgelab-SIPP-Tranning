package Java_LinkedList;
class Ticket {
    int id;
    String customer;
    String movie;
    String seat;
    String time;
    Ticket next;

    Ticket(int id, String customer, String movie, String seat, String time) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

public class TicketReservationSystem {
    Ticket head;

    public void display() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println("Ticket for " + temp.customer + " - " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        Ticket t1 = new Ticket(1, "John", "Inception", "A1", "18:00");
        Ticket t2 = new Ticket(2, "Alice", "Matrix", "A2", "19:00");
        t1.next = t2;
        t2.next = t1;
        trs.head = t1;
        trs.display();
    }
}