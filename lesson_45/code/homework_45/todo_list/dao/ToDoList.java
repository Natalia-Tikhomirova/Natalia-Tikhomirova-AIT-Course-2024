package homework_45.todo_list.dao;

import homework_45.todo_list.model.Task;

import java.time.LocalDate;
import java.util.List;

public interface ToDoList {

    void addTask(String title, String description, LocalDate date);

    List<Task> getAllTasks();

    Task getTaskByName(String title);

    void updateTask(String title, String newDescription, LocalDate newDate);

    void deleteTask(String title);

    void deleteAllTasks();

    void printTasks();


} // end of class
