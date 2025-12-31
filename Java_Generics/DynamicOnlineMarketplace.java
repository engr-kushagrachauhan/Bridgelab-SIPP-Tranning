package Java_Generics;
interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class DiscountUtility {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * percentage / 100;
    }
}