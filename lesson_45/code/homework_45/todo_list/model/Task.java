package homework_45.todo_list.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Task implements Serializable {

    private String title;
    private String description;
    private LocalDate date;

    public Task(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }
} // end of class
