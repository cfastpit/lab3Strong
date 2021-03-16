package database;

import domain.Inventory;
import java.util.ArrayList;
import domain.OrderItem;

public class InventoryDB {
    private static ArrayList<Inventory> items = new ArrayList<Inventory>(5);
    
    public static void add(Inventory item) {
        items.add(item);
    }
    
    public static Inventory find(String id) {
        for (int i = 0; i< items.size(); i++){
            if (items.get(i).getProductId() == id)
                return items.get(i);
        }
        
        return null;
    }
    
    public static Inventory get(int i){
        return items.get(i);
    }
    public static ArrayList<Inventory> getInventory() {
        ArrayList<Inventory> getInventory = null;
        return getInventory;
    }

    public static int getNumberOfInventory(){
        return items.size();
    }
    
    public static void initialize(){
        Inventory inv;
        
        inv = new Inventory();
        inv.setProductId("100");
        inv.setDescription("Item One");
        inv.setPrice(21.95);
        inv.setQuantityOnHand(5);
        inv.add();
        
        inv = new Inventory();
        inv.setProductId("200");
        inv.setDescription("Item Two");
        inv.setPrice(15.65);
        inv.setQuantityOnHand(7);
        inv.add();
        
        inv = new Inventory();
        inv.setProductId("300");
        inv.setDescription("Item Three");
        inv.setPrice(35.75);
        inv.setQuantityOnHand(10);
        inv.add();
    }
}
