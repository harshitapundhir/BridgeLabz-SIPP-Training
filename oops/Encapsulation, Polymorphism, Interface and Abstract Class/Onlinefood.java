
import java.util.*;

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity()) * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Veg Discount: ₹" + discount;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double extraCharge) {
        super(itemName, price, quantity);
        this.extraCharge = extraCharge;
        this.discount = 0;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + extraCharge) - discount;
    }

    public void applyDiscount(double percent) {
        discount = (getPrice() * getQuantity() + extraCharge) * (percent / 100);
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: ₹" + discount;
    }
}

public class Onlinefood {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
            }

            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();

        orderList.add(new VegItem("Paneer Butter Masala", 200, 2));
        orderList.add(new NonVegItem("Chicken Biryani", 250, 2, 50));

        processOrder(orderList);
    }
}
