package application_template_new.ait.todolist.dao;
import application_template_new.ait.todolist.model.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToDoListImpl implements ToDoList {

    private List<Task> tasks;
    private int quantity;
    private LocalDate time;

    public ToDoListImpl() {
        this.tasks = new ArrayList<>();
        this.quantity = 0;
    }

    // Реализация метода добавления задачи
    @Override
    public boolean addTask(Task task) {
        if(task == null || tasks.contains(task)) {
            return false;
        }
        tasks.add(task);
        quantity = tasks.size();
        return true;
    }

    // Реализация метода удаления задачи
    @Override
    public Task removeTask(int taskNumber) {
        if(taskNumber >= 1 && taskNumber <= quantity) {
            Task victim = tasks.get(taskNumber - 1);
            tasks.remove(victim);
            System.out.println("Task: " + victim.getTask() + " is removed.");
            quantity--;
            return victim;
        }
        System.out.println("Wrong number of task.");
        return null;
    }

    // Реализация метода для просмотра всех задач
    @Override
    public void viewTasks() {
        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));
    }

    // Реализация метода для получения всех задач
    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    // Реализация метода для получения количества задач
    @Override
    public int quantity() {
        return quantity;
    }

    // Реализация метода для сохранения задач в файл
    @Override
    public void saveTasks(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(new ArrayList<>(tasks));
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении: " + e.getMessage());
        }
    }

    // Реализация метода для загрузки задач из файла
    @Override
    public void loadTasks(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Task> readTasks = (List<Task>) ois.readObject();
            tasks = new ArrayList<>(readTasks);
            quantity = tasks.size();
            System.out.println("Список задач загружен успешно.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке: " + e.getMessage());
        }
    }
}