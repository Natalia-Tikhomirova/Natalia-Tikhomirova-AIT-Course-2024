package homework_09;

public class MaximumOf3tern {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 7;

        int max = ( a > b ? a : b) > c ? ( a > b ? a : b ) : c;

        System.out.println( " Maximum =  " + max );

    }
}
