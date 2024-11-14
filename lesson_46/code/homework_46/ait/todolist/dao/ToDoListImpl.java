package homework_46.ait.todolist.dao;

import homework_46.ait.todolist.model.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static classwork_46.ait.todolist.ToDoListAppl.FILE_NAME;

public class ToDoListImpl implements ToDoList {

    // хранилище
    private List<Task> tasks; // Список задач
    private int quantity;     // Количество задач
    private LocalDate time;   // Дата последнего изменения списка задач

    public ToDoListImpl() {
        this.tasks = new ArrayList<>();
        this.quantity = 0;
        this.time = LocalDate.now();
    }

    @Override
    public boolean addTask(Task task) {
        // Проверка на null и дубликаты
        if (task == null || tasks.contains(task)) {
            System.out.println("Задача уже существует или введена некорректно.");
            return false;
        }
        tasks.add(task);
        quantity = tasks.size();
        time = LocalDate.now(); // Обновляем дату изменения
        System.out.println("Задача добавлена: " + task);
        return true;
    }

    @Override
    public Task removeTask(int taskNumber) {
        // Проверка корректности номера задачи
        if (taskNumber >= 1 && taskNumber <= quantity) {
            Task victim = tasks.remove(taskNumber - 1); // Удаление задачи
            System.out.println("Задача " + victim.getTask() + " удалена.");
            quantity = tasks.size();
            time = LocalDate.now(); // Обновляем дату изменения
            return victim;
        }
        System.out.println("Неверный номер задачи.");
        return null;
    }

    @Override
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            IntStream.range(0, tasks.size())
                    .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));
        }
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks); // Защита оригинального списка
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public void saveTasks(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
            System.out.println("Задачи успешно сохранены в файл: " + FILE_NAME);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadTasks(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Task> readTask = (List<Task>) ois.readObject();
            quantity = readTask.size();
            time = LocalDate.now(); // Обновляем дату последнего изменения
            System.out.println("Задачи успешно загружены из файла: " + FILE_NAME);
            viewTasks(); // Печать списка задач после загрузки

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

} // end of class
