package homework_46.ait.todolist;

import homework_46.ait.todolist.dao.ToDoList;
import homework_46.ait.todolist.dao.ToDoListImpl;
import homework_46.ait.todolist.model.Task;
import homework_46.ait.todolist.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{

    private static final String FILE_NAME = "task_list.dat"; // Имя файла для сохранения списка задач

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в ToDo Application!");

        ToDoList toDoList = new ToDoListImpl();
        Scanner scanner = new Scanner(System.in);

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            System.out.print("Введите ваш выбор: ");
            // Проверка на корректный ввод числа (потому что сама вляпалась, введя буквы)))
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число для выбора.");
                scanner.next(); // пропустить некорректный ввод
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // считываем перевод строк

            // execute
            switch (choice) {
                case 1 -> {
                    System.out.print("Введите задачу: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task,LocalDate.now());
                    toDoList.addTask(t);
                        System.out.println("Задача успешно добавлена.");
                }
                case 2 -> {
                    System.out.println("Ваши задачи:");
                    toDoList.viewTasks();
                }
                case 3 -> {
                    System.out.print("Введите номер задачи для удаления: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                        System.out.println("Задача успешно удалена.");
                }
                case 4 -> {
                    System.out.println("Сохранение задач...");
                    // call method
                    toDoList.saveTasks(FILE_NAME);
                }
                case 5 -> {
                    // call method
                    System.out.println("Загрузка задач...");
                    toDoList.loadTasks(FILE_NAME);
                }
                case 6 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный ввод. Пожалуйста, выберите корректный вариант.");
            }
        }
    }

} // end of class