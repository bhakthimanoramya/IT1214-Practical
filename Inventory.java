import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added!");
    }

    // Remove item by ID
    public void removeItem(String id) {
        items.removeIf(i -> i.getId().equals(id));
        System.out.println("Item removed (if found).");
    }

    // Update quantity
    public void updateQuantity(String id, int qty) {
        for (Item i : items) {
            if (i.getId().equals(id)) {
                i.setQuantity(qty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search by ID or Name
    public Item search(String key) {
        for (Item i : items) {
            if (i.getId().equalsIgnoreCase(key) || i.getName().equalsIgnoreCase(key)) {
                return i;
            }
        }
        return null;
    }

    // Display all
    public void displayAll() {
        if (items.isEmpty()) System.out.println("Inventory empty!");
        else items.forEach(System.out::println);
    }
}
