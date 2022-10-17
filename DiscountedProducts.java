public class DiscountedProducts extends Product {
    public double discount;

    DiscountedProducts(String name, int price, int inventory, double discount) {
        super(name, price, inventory);
        this.discount = discount;
    }
    public double getDiscountedPrice() {
        return getPrice() - getPrice() * discount;
    }


}
