package homework_31;

// Задание 1. Взять на выбор любой из классов: Country - name, population River - name, length
// свой пример и выполнить с ним примеры по аналогии с City, которые мы делали на занятии.

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class River  implements Comparable<River>{

    private String name;
    private int length;

    public River(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof River river)) return false;
        return length == river.length && Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length);
    }

    @Override
    public String toString() {
        return String.format("River name: %s, length: %d", name, length);
    }

    @Override
    public int compareTo(River river) {

        return Integer.compare(this.getLength(),river.getLength());
    }
} // end of class
