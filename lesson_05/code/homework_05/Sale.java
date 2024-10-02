package homework_05;

// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

// 1. Рассчитать стоимость каждого товара с учётом индивидуальных скидок.
// Discount = Price * ( 1 - (Selling price / 100 )
//2. Найти общую стоимость покупки.
// Total Cost = N * Discount A + M * Discount B
//3. Если общая стоимость превышает 100 евро, добавить дополнительную скидку в 5%.
//4. Рассчитать итоговую стоимость и общую величину скидки.
// Final Cost = Total cost * 0.95
// Discount A = N * X * ( D/100) ; Discount B = M * Y * ( C/100 );
// Total Discount = Discount A + Discount B
// Final Discount = Total Discount + Additional Discount
// Additional Discount = (A + B) * 0.95 if A + B > 100

public class Sale {
    public static void main(String[] args) {

        double a = 100; // priceA в евро
        double b = 20;  // priceB в евро
        double d = 0.15; // Discount A
        double c = 0.50; // Discount B
        double n = 3;  // кол-во товаров A
        double m = 5; //  кол-во товаров B

      //  double res1 = finalCost (); // Final Cost
        double res2 = (a+b)*0.95; // Additional Discount

        // здесь будет вызов метода

      //  System.out.println( " Final Cost = " + res1); {

        }
       // System.out.println( " Additional Discount = " + res2);{

        }


//    }  end of main

    // Final Discount = Total Discount + (A + B) * 0.95 if A + B > 100
    // Additional Discount = (A + B) * 0.95 if A + B > 100

   // public static double (){



       // double res1 = (d+c)+res2
       // double res2 = (a+b)*0.95
   // }


//} // end of class
