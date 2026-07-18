package Task2;

import java.util.HashMap;

public class Main {

    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {

        System.out.println("Grocery List:");

        for (String item : groceryList.keySet()) {
            System.out.println(item + ": " + groceryList.get(item) + "$");
        }

        System.out.println();
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public static void main(String[] args) {

        Main manager = new Main();

        manager.addItem("Apples", 2.50);
        manager.addItem("Milk", 3.20);
        manager.addItem("Bread", 1.80);

        manager.displayList();

        System.out.println("Is Milk in the list? " + manager.checkItem("Milk"));
        System.out.println();
        System.out.println("Total cost: " + manager.calculateTotalCost()+ "$");
        System.out.println();
        manager.removeItem("Milk");
        System.out.println("Updated Grocery List:");
        manager.displayList();
        System.out.println("New total cost: " + manager.calculateTotalCost() + "$");
    }
}