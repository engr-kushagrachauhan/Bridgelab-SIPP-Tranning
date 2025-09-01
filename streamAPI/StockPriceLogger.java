package streamAPI;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(101.5, 102.3, 100.8, 103.7);

        prices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
