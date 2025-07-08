package Java_LinkedList;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    Movie head, tail;

    public void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.director);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.head = new Movie("Inception", "Nolan", 2010, 8.8);
        mms.tail = mms.head;
        mms.displayForward();
    }
}