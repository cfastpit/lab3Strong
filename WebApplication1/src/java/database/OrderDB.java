package database;

import domain.Order;
import java.util.ArrayList;

public class OrderDB {
    private static ArrayList<Order> orders = new ArrayList<Order>(5);
    private static ArrayList<Order> customerOrders = new ArrayList<Order>(5);
    
    public static void add(Order o) {
        o.setOrderNumber(orders.size()+1);
        orders.add(o);
    }
    
    public static ArrayList<Order> findCustomerOrders(int customerID){
        customerOrders.clear();
        for (int i = 0; i < orders.size(); i++){
            if (customerID == orders.get(i).getCustomerID())
                customerOrders.add(orders.get(i));
        }
        return customerOrders;
    }
    
    public static Order get(int i) {
        return orders.get(i);
    }
    
    public static int getNumberOfOrders() {
        return orders.size();
    }
}