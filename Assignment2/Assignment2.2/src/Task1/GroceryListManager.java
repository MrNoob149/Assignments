package Task1;

import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }

        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        manager.displayList();

        System.out.println("Is Milk in the grocery list? "
                + manager.checkItem("Milk"));

        System.out.println();

        // Remove item
        System.out.println("Removing Milk from the list...");
        manager.removeItem("Milk");

        System.out.println();

        // Display updated list
        System.out.println("Updated Grocery List:");
        manager.displayList();
    }
}