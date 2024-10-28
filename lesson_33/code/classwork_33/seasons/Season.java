package classwork_33.seasons;

public enum Season {
    WINTER("Winter",90,1), SPRING("Spring",92,2), SUMMER("Summer",92,3), AUTUMN("Autumn",91,4); //перечисляем константы (название, продолжительность, порядковый номер)

    // fields

    private String name;
    private int duration;
    private int number;

    Season(String name, int duration, int number) {
        this.name = name;
        this.duration = duration;
        this.number = number;
    }

    // сеттеры не нужны, мы ничего не устанавливаем

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Season{");
        sb.append("name='").append(name).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
} // end of class
