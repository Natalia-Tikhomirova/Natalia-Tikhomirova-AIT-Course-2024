package homework_33.diary;

// Начать реализацию приложения "Список дел".

//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню

public enum Diary {
    ADD_TASK(1, "Add task"), VIEW_ALL_TASKS(2, "View all tasks"), REMOVE_TASK(3, "Remove task number: "), EXIT(4, "Exit menu");

    // fields

    private int number;
    private String punkt;

    Diary(int number, String punkt) {
        this.number = number;
        this.punkt = punkt;
    }

    public int getNumber() {
        return number;
    }

    public String getPunkt() {
        return punkt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Diary{");
        sb.append("number=").append(number);
        sb.append(", punkt='").append(punkt).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // end of class
