package domain;

import java.io.Serializable;
import java.text.NumberFormat;

public class LineItem implements Serializable {

    private Inventory product;
    private int quantity;

    public LineItem() {}

    public void setProduct(Inventory p) {
        product = p;
    }

    public Inventory getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity;
        return total;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}