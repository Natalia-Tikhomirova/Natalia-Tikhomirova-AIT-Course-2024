package homework_05;

public class GoodsWithDiscount {

    public static void main(String[] args) {
        double priceA = 10.0; // стоимость товара А
        double priceB = 20.0; // стоимость товара В

        double discountA = 0.05; // скидка на товар А
        double discountB = 0.1; // скидка на товар В

        int nA = 5; // количество штук товара A
        int mB = 4; // количество штук товара B

        double sum = calculateTotalSum(priceA, priceB, discountA, discountB, nA, mB);
        double sumWithDiscount = sum;

        if(sum > 100) {
            sumWithDiscount  = sum - sum * 0.05;
        }
        System.out.println("Total cost is: "  + sum);
        System.out.println("Sum with discount is: " + sumWithDiscount);
    }

    private static double calculateTotalSum(double priceA, double priceB, double discountA, double discountB, int nA, int mB) {
        return priceA*(1-discountA)*nA + priceB*(1-discountB)*mB;
    }

}