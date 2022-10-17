public class Product {
    private String name;
    private double price;
    private int inventory;
    private double totalSum;
    Product(String name, int price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public int getInventory() {
        return inventory;
    }
    public String getName() {
        return name;
    }
    public double getTotalSum() {
        return totalSum;
    }
    public double getPrice() {
        return price;
    }

    public void buy(int amount) {
        inventory -= amount;
        totalSum += amount * getPrice();
    }


}

