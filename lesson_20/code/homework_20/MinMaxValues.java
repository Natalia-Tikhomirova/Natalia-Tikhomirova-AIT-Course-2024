package homework_20;

// Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double. Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class MinMaxValues {
    public static void main(String[] args) {


        String[] types = {"byte", "short", "int", "long", "char", "float", "double"};

        // Если аргументы не переданы, выводим значения для всех типов:
        if (args.length == 0) {
            for (int i = 0; i < types.length; i++) {
                printMinMax(types[i]);
            }
        } else {
            // Обработка аргументов:
            for (int i = 0; i < args.length; i++) {
                String arg = args[i].toLowerCase(); // Приводим к нижнему регистру
                if (isValidType(arg)) {
                    printMinMax(arg);
                } else {
                    System.out.println("Неверный тип: " + arg);
                }
            }
        }
    } // end of main

    // Метод для проверки корректности типа:
    private static boolean isValidType(String type) {
        switch (type) {
            case "byte":
            case "short":
            case "int":
            case "long":
            case "char":
            case "float":
            case "double":
                return true;
            default:
                return false;
        } // end of switch
    } // end of method

    // Метод для вывода минимальных и максимальных значений
    private static void printMinMax(String type) {
        switch (type) {
            case "byte":
                System.out.println("byte: Минимальное значение = " + Byte.MIN_VALUE + ", Максимальное значение = " + Byte.MAX_VALUE);
                break;
            case "short":
                System.out.println("short: Минимальное значение = " + Short.MIN_VALUE + ", Максимальное значение = " + Short.MAX_VALUE);
                break;
            case "int":
                System.out.println("int: Минимальное значение = " + Integer.MIN_VALUE + ", Максимальное значение = " + Integer.MAX_VALUE);
                break;
            case "long":
                System.out.println("long: Минимальное значение = " + Long.MIN_VALUE + ", Максимальное значение = " + Long.MAX_VALUE);
                break;
            case "char":
                System.out.println("char: Минимальное значение = " + (int) Character.MIN_VALUE + ", Максимальное значение = " + (int) Character.MAX_VALUE);
                break;
            case "float":
                System.out.println("float: Минимальное значение = " + Float.MIN_VALUE + ", Максимальное значение = " + Float.MAX_VALUE);
                break;
            case "double":
                System.out.println("double: Минимальное значение = " + Double.MIN_VALUE + ", Максимальное значение = " + Double.MAX_VALUE);
                break;
        } // end of switch
    } // end of method
} // end of class
