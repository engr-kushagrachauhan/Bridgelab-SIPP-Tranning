package streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1200.0),
            new Claim("Auto", 2000.0),
            new Claim("Health", 1500.0),
            new Claim("Home", 3000.0),
            new Claim("Auto", 1800.0)
        );

        Map<String, Double> avgClaimByType = claims.stream()
            .collect(Collectors.groupingBy(Claim::getType,
                     Collectors.averagingDouble(Claim::getAmount)));

        System.out.println(avgClaimByType);
    }
}

class Claim {
    private String type;
    private double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}
