package Java_LinkedList;
class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    Item head;

    public void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + ": " + temp.quantity + " units @ ₹" + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.head = new Item("Pen", 101, 50, 5.5);
        ims.head.next = new Item("Notebook", 102, 30, 25.0);
        ims.display();
    }
}