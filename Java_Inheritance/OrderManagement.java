package Java_Inheritance;
class Order {
    String orderId;
    String orderDate;

    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder();
        order.orderId = "ORD123";
        order.orderDate = "2025-07-01";
        order.trackingNumber = "TRK123456";
        order.deliveryDate = "2025-07-02";
        System.out.println(order.getOrderStatus());
    }
}