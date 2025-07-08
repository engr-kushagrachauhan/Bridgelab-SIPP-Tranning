package Java_LinkedList;
class Book {
    String title;
    String author;
    String genre;
    int id;
    boolean available;
    Book prev, next;

    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

public class LibraryManagementSystem {
    Book head, tail;

    public void display() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " (" + (temp.available ? "Available" : "Checked out") + ")");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.head = new Book("1984", "George Orwell", "Fiction", 1, true);
        lms.tail = lms.head;
        lms.display();
    }
}