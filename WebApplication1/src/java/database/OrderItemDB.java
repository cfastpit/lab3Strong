package database;

import domain.OrderItem;
import java.util.ArrayList;

public class OrderItemDB {
    private static ArrayList<OrderItem> items = new ArrayList<OrderItem>(5);
    
    public static void add(OrderItem item) {
        items.add(item);
    }
}
