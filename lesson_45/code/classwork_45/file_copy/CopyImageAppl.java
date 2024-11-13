package classwork_45.file_copy;

// пишем утилиту для копирования файла
// имена файлов передаются в аргументах командной строки

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageAppl {
    public static void main(String[] args) {

        // String[] args - этот массив отвечает за получение аргументов
        // проверяем, что аргументов именно 2
        if (args.length != 2){
            System.out.println("Wrong numbers of arguments.");
        }
        // print file names
        System.out.println("Source file:" + args[0]);
        System.out.println("Destimation file:" + args[1]);

        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);

            // читать из файла пока != -1, пишем в 1-й файл
            int a = fin.read();
            while (a!=-1){
                fout.write(a); // пишем в файл
                a = fin.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
} //end of class
