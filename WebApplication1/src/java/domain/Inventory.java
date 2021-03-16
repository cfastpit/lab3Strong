package domain;

import database.InventoryDB;
import java.util.ArrayList;

public class Inventory {
    String description;
    private double price; 
    private String productId;
    private int quantityOnHand;
    
    public void add() {
        InventoryDB.add(this);
    }
    
    public static Inventory find(String id) {
        return InventoryDB.find(id);
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }
    public static ArrayList<Inventory> getInventory() {
        return InventoryDB.getInventory();
    }

    public static Inventory get(int i){
        return InventoryDB.get(i);
    }
    
    public static int getNumberOfInventory(){
        return InventoryDB.getNumberOfInventory();
    }
    
    public static void initialize(){
        InventoryDB.initialize();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
    
    public String toString() {
        return productId + "  " + description + "   " + price + "   " + quantityOnHand; 
    }
}
