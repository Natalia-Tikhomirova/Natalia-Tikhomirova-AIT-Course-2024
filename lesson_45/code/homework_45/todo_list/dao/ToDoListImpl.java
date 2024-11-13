package homework_45.todo_list.dao;

import homework_45.todo_list.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ToDoListImpl implements ToDoList{

    private List<Task> tasks;

    public ToDoListImpl(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void addTask(String title, String description, LocalDate date) {
        Task task = new Task(title, description, date); // Создаем новую задачу
        tasks.add(task); // Добавляем в список
        System.out.println("Task added: " + task.getTitle()); // Печатаем имя задачи
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Task getTaskByName(String title) {
        Optional<Task> task = tasks.stream()
                .filter(t -> t.getTitle().equalsIgnoreCase(title))
                .findFirst();
        return task.orElse (null);
    }

    @Override
    public void updateTask(String title, String newDescription, LocalDate newDate) {
        tasks.stream()
                .filter(t -> t.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .ifPresentOrElse(task -> {
                    task.setDescription(newDescription);
                    task.setDate(newDate);
                    System.out.println("Task updated: " + task.getTitle());
                }, ()-> System.out.println("Task not found: " + title));

    }

    @Override
    public void deleteTask(String title) {
        tasks.removeIf(task -> task.getTitle().equalsIgnoreCase(title));
        System.out.println("Task deleted: " + title);
    }

    @Override
    public void deleteAllTasks() {
        tasks.clear();
        System.out.println("All tasks have been deleted.");
    }

    @Override
    public void printTasks() {
        tasks.stream()
                .map(task -> task.getTitle() + " - " + task.getDescription() + " Due: " + task.getDate() + ")")
                .forEach(System.out::println);

    }
} // end of class
