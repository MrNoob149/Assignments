package Task3;

public class Item {
    private String name;
    private double cost;
    private String category;

    public Item(String name, double cost, String category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory () {
        return category;
    }

    public double getCost() {
        return cost;
    }

}
