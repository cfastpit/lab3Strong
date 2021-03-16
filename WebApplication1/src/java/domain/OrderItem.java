package domain;

import database.OrderItemDB;

public class OrderItem {
    private String description;
    private int lineNumber;
    private int quantity;
    private double price;
    private String productID;
    
    public void add() {
        OrderItemDB.add(this);
    }
    
    public static OrderItem createOrderItem(Inventory inv){
        OrderItem item = new OrderItem();
        item.setProductID(inv.getProductId());
        item.setDescription(inv.getDescription());
        item.setPrice(inv.getPrice());
        return item;
    }

    public String getDescription() {
        return description;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public String getProductID(){
        return productID;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setProductID(String id){
        this.productID = id;
    }
    
    public String toString() {
        return lineNumber + " " + getDescription() + " price : " + price + " quantity: " + quantity;
    } 
}
