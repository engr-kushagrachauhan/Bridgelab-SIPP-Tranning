package collectors;
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Customer1", 200.0),
            new Order("Customer2", 150.0),
            new Order("Customer1", 100.0),
            new Order("Customer3", 300.0)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                     Collectors.summingDouble(Order::getAmount)));

        System.out.println(revenueByCustomer);
    }
}

class Order {
    private String customer;
    private double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
}
