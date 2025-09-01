package collectors;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book1", "Fiction", 300),
            new Book("Book2", "Fiction", 250),
            new Book("Book3", "Non-Fiction", 400),
            new Book("Book4", "Non-Fiction", 350),
            new Book("Book5", "Sci-Fi", 500)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre + " -> " + stats);
        });
    }
}

class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}
