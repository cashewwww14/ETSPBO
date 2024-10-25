import java.util.ArrayList;

public class FoodOrder {
    protected ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0;
        isPaid = false;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        totalPrice += item.getPrice();
    }

    public void removeMenuItem(MenuItem item) {
        if (menuItems.remove(item)) {
            totalPrice -= item.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void pay() {
        isPaid = true;
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Paid: " + (isPaid ? "Yes" : "No"));
    }
}
