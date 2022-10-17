public class Customer {
    private int productAmount;
    private double totalSum;

    Customer(int productAmount, double totalSum) {
        this.productAmount = productAmount;
        this.totalSum = totalSum;
    }

    int buyThings(int amount, double getPrice) {
        productAmount += amount;
        totalSum += getPrice;
        return amount;
    }
    public double getTotalSum() {
        return this.totalSum;
    }
    int getProductAmount() {
        return this.productAmount;
    }



}
