package homework_08;

// Напечатайте на экране шахматную доску размером 8х8.
// 0 - белая клеточка, 1 - черная.
// Левая верхняя клеточка должна быть 0, левая нижняя - 1.


public class ChessDeck {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        while (x < 8) {
            while (y < 8){
                System.out.print( (x + y) % 2 + " | "); // остаток от деления на 2 равен 0 или 1
                y++;
            }
            System.out.println(); // next line
            y = 0;
            x++;
        }
        System.out.println("Done!");
    }
}

