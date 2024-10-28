package homework_33.week_day;

//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.
// Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг)
// Проверьте работу метода с помощью теста.

public enum WeekDay {
    MONDAY("Monday","WeekDay",1), TUESDAY("Tuesday","WeekDay",2), WEDNESDAY("Wednesday", "WeekDay",3), THURSDAY("Thursday","WeekDay",4), FRIDAY("Friday","WeekDay",5), SATURDAY("Saturday","WeekEnd",6), SUNDAY("Sunday","WeekEnd",7);


    // fields

    private String name;
    private String type;
    private int number;

    WeekDay(String name, String type, int number) {
        this.name = name;
        this.type = type;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }


    public WeekDay plusDay(int quantity){
        int index = this.ordinal() + quantity; // Получаем текущий индекс + количество дней
        WeekDay[] weekDays = WeekDay.values(); // Получаем массив всех дней недели
        int res = index % weekDays.length;     // Используем остаток от деления, чтобы "закольцевать" неделю

        return weekDays[res];                  // Возвращаем день недели по вычисленному индексу
    }

} // end of class
