package domain;

import java.util.Date;
import java.util.ArrayList;
import database.OrderDB;

public class Order {
    private int customerID;
    private ArrayList<OrderItem> orderItems = new ArrayList<OrderItem> (5);
    private Date orderDate;
    private int orderNumber;

    public void add() {
        OrderDB.add(this);
    }
    
    public void addItem(OrderItem item) {
        System.out.println("Inside Order.addItem\n  " + item);
        orderItems.add(item);
        item.setLineNumber(orderItems.size());
    }
    
    public static Order createOrder(Customer c){
        Order order = new Order();
        order.setCustomerID(c.getCustomerId());
        order.setOrderDate(new Date());
        return order;
    }
    
    public static ArrayList<Order> findCustomerOrders(int customerID){
        return OrderDB.findCustomerOrders(customerID);
    }
    
    public static Order get(int i) {
        return OrderDB.get(i);
    }
    
    public int getCustomerID() {
        return customerID;
    }
    
    public static int getNumberOfOrders() {
        return OrderDB.getNumberOfOrders();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setCustomerID(int id) {
        this.customerID = id;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public String toString() {
        String returnString;
        returnString = orderNumber + "   " + orderDate.toString() + " Customer: " + customerID;
        for(int i = 0; i < orderItems.size(); i++) {
            returnString = returnString + "\n     " + orderItems.get(i);
        }
        
        return returnString;
    }
}
