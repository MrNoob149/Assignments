package Task3;

import java.util.ArrayList;

public class Task3 {

    private ArrayList<Item> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category) {
        groceryList.add(new Item(item, cost, category));
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            Item item = groceryList.get(i);
            System.out.println(item.getName() + " " + item.getCost() + "$ (" + item.getCategory() + ")");
        }
        System.out.println();
    }

    public void displayByCategory(String category) {

        System.out.println("Items in category: " + category);

        for (int i = 0; i < groceryList.size(); i++) {
            Item item = groceryList.get(i);

            if (item.getCategory().equalsIgnoreCase(category)) {
                System.out.println(item.getName() + " " + item.getCost() + "$");
            }
        }

        System.out.println();
    }

    public double calculateTotalCost() {

        double total = 0;

        for (int i = 0; i < groceryList.size(); i++) {
            Item item = groceryList.get(i);

            System.out.println(item.getName());
        }

        return total;
    }

    public static void main(String[] args) {

        Task3 manager = new Task3();

        manager.addItem("Apple", 1.20, "Fruits");
        manager.addItem("Banana", 0.80, "Fruits");
        manager.addItem("Milk", 2.50, "Dairy");
        manager.addItem("Bread", 1.75, "Bakery");

        manager.displayList();

        manager.displayByCategory("Fruits");

        System.out.println("Total Cost: " + manager.calculateTotalCost() + "$");
    }
}