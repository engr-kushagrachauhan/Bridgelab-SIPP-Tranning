package Java_Generics;
abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public abstract void display();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
    public void display() { System.out.println("Electronics: " + name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
    public void display() { System.out.println("Groceries: " + name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
    public void display() { System.out.println("Furniture: " + name); }
}

class Storage<T extends WarehouseItem> {
    private java.util.List<T> items = new java.util.ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public void displayItems() {
        for (T item : items) {
            item.display();
        }
    }
    public static void displayAllItems(java.util.List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            item.display();
        }
    }
}