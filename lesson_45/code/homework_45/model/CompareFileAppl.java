package homework_45.model;

//Задание 1. В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
// Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты.
// Результат должен быть выведен на консоль в виде сообщения.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class CompareFileAppl {
    public static void main(String[] args) {
// Проверка на количество аргументов
        if (args.length != 2) {
            System.out.println("Wrong number of arguments. Please provide source and destination file paths.");
            return;
        }

        // Печать имен файлов
        System.out.println("Source file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        // Получение объектов File для проверки длины файлов
        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        // Проверка на длину файлов
        if (file1.length() != file2.length()) {
            System.out.println("Files are different: they have different lengths.");
            return;
        }

        try (FileInputStream fin1 = new FileInputStream(args[0]);
             FileInputStream fin2 = new FileInputStream(args[1])) {

            // Сравнение содержимого по байтам
            int byteFile1;
            int byteFile2;
            int position = 0;

            while ((byteFile1 = fin1.read()) != -1 && (byteFile2 = fin2.read()) != -1) {
                if (byteFile1 != byteFile2) {
                    System.out.println("Files are different: they differ at byte position " + position);
                    return;
                }
                position++;
            }

            System.out.println("Files are identical: they have the same length and content.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }

} // end of class
