package homework_05;

public class Schopping {

    public static void main(String[] args) {

        int artA = 100;
        int discountA = 10;
        int quantityA = 1;

        int withDiscountA = artA * (1 - discountA / 100);
        int costA = withDiscountA * quantityA;

        int artB = 30;
        int discountB = 5;
        int quantityB = 2;

        int priceNoDiscount = artA + artB;

        int withDiscountB = artB * (1 - discountB / 100);
        int costB = withDiscountB * quantityB;

        int totalCost = costA + costB;

        int totalDiscount = totalCost - priceNoDiscount;

        System.out.println("Total discount " + totalDiscount + " %");


        if(totalCost > 100){
            totalCost *= 0.95;
            System.out.println("End price " + totalCost + " Euro");

        }

    }
}

