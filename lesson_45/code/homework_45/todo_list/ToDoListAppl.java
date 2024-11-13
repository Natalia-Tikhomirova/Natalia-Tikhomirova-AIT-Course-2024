package homework_45.todo_list;

//В приложении ToDoList сделать сохранение/чтение задач в файл.
// Сделать сейчас сохранение в файл.

import homework_45.todo_list.dao.ToDoListImpl;
import homework_45.todo_list.model.Task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoListAppl {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Buy groceries", "Milk, bread, and eggs", LocalDate.of(2024, 5, 1)));
        tasks.add(new Task("Complete homework", "Math and science homework", LocalDate.of(2024, 4, 30)));
        tasks.add(new Task("Read book", "Finish reading Java book", LocalDate.of(2024, 6, 15)));
        tasks.add(new Task("Plan vacation", "Book tickets for summer trip", LocalDate.of(2024, 7, 20)));
        tasks.add(new Task("Attend meeting", "Project meeting with the team", LocalDate.of(2024, 5, 5)));

        ToDoListImpl toDoList = new ToDoListImpl(tasks);

        toDoList.addTask("Go to the gym", "Morning workout session", LocalDate.of(2024, 5, 2));
        System.out.println("All Tasks after adding a new one:");
        toDoList.printTasks();





        // отправляем в файл

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("todo_list.txt"))) {
            oos.writeObject(tasks);
            System.out.println("Tasks saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
            throw new RuntimeException("Error saving tasks to file.", e);
        }
    }

} // end of class
