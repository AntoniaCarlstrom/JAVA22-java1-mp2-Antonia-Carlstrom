import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Customer kund = new Customer(0, 0);

        DiscountedProducts rea = new DiscountedProducts("Royal Canine rea", 499, 10, 0.2);

        Product kattmat = new Product("Hill's kattmat", 599, 10);

        Product tuggben = new Product("Tuggben", 20, 100);

        // Scanner för kundens val
        Scanner scanner = new Scanner(System.in);

        // Loop för att visa meny
        while (true) {
            System.out.println("1. Buy " + rea.getName() + ", " + rea.getDiscountedPrice() + " SEK, " + rea.getInventory() + " left");
            System.out.println("2. Buy " + kattmat.getName() + ", " + kattmat.getPrice() + " SEK, " + kattmat.getInventory() + " left");
            System.out.println("3. Buy " + tuggben.getName() + ", " + tuggben.getPrice() + " SEK, " + tuggben.getInventory() + " left");
            System.out.println("4. QUIT");

            num = scanner.nextInt();

            // Vad som händer när kunden gör val
            if (num == 1) {
                rea.buy(1);
                kund.buyThings(1, rea.getDiscountedPrice());

            } else if (num == 2) {
                kattmat.buy(1);
//
                kund.buyThings(1, kattmat.getPrice());

            } else if (num == 3) {
                tuggben.buy(1);
//
                kund.buyThings(1, tuggben.getPrice());

            } else if (num == 4) {
                System.out.println("You bought " + kund.getProductAmount() + " items. Total cost: " + kund.getTotalSum());
                System.exit(0);
            }

        }


    }
}