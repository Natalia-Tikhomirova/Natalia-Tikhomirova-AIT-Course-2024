package homework_46.ait.todolist.dao;

import homework_46.ait.todolist.model.Task;

import java.util.List;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);                        // Добавить задачу

    // remove Task
    Task removeTask(int taskNumber);                   // Удалить задачу по номеру

    // print list of Tasks
    void viewTasks();                                  // Показать все задачи

    List<Task> getAllTasks();                          // Получить список задач

    // quantity of tasks
    int quantity();                                    // Получить количество задач

    void saveTasks(String fileName);

    void loadTasks(String fileName);

} // end of class