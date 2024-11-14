package application_template_new.ait.todolist.dao;

import application_template_new.ait.todolist.model.Task;

import java.util.List;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    List<Task> getAllTasks(); // взять весь список

    // quantity of tasks
    int quantity();

    // Реализация метода для сохранения задач в файл
    void saveTasks(String fileName);

    // Реализация метода для загрузки задач из файла
    void loadTasks(String fileName);
}