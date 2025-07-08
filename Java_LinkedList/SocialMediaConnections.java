package Java_LinkedList;
import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

public class SocialMediaConnections {
    User head;

    public void display() {
        User temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + ", Friends: " + temp.friendIds);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaConnections smc = new SocialMediaConnections();
        User u1 = new User(1, "Alice", 25);
        User u2 = new User(2, "Bob", 26);
        u1.friendIds.add(2);
        u2.friendIds.add(1);
        u1.next = u2;
        smc.head = u1;
        smc.display();
    }
}