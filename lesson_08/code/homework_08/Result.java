package homework_08;

 // Чему равно значение выражения x-- + --x при x = 5? Проверьте свое предположение с помощью кода.

public class Result {
    public static void main(String[] args) {

        int x = 5;  // присваиваем х значение 5
        int x1 = x--;
        int x2 = --x;
        int y = x-- + --x;
        y= x1 + x2;

        System.out.println(" Result = " + y );
        System.out.println(" x = " + x1 + " + " +x2 + " = 8 ");

        // по данным GPT можно было проще
        // int x = 5;
        //int result = x-- + --x;
        //System.out.println("Результат: " + result);


    } // end of main

} // end of class
