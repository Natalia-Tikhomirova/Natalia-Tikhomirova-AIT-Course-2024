package homework_11;

// У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок?
// Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Shooter {
    public static void main(String[] args) {

        // стрелок может попасть в мишень. Учитывается в пределы какого круга он попал
        // 0 - не попал
        // 1- попал ...

        // сумма всех чисел - результат ( ск очков набрал )

        Random random = new Random();

        int [] result = new int[10]; // массив из результатов, объявили

        for (int i = 0; i < result.length; i++) {
          //  int res = random.nextInt(11); // присвоение
            //result [i] = res;

            result [i] = random.nextInt(11);
            System.out.print(result [i] + " , ");
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < result.length; i++) {

            sum = sum + result[i];

            System.out.println(" Summa = " + sum);

            boolean apple = false;

            for (int i1= 0; i < result.length; i++) {

                if (result[i] == 10){
                    apple = true;
                }

            }
            System.out.println("Hit the apple: " + apple );
        }


    }

}
