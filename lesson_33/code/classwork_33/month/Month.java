package classwork_33.month;

// Задайте Enum Month, определите месяца, их наименования и количество в них дней.
//Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
//Пример: AUG + 6 month = FEB
//Проверьте работу метода в приложении.

public enum Month {

    JAN("January",31),FEB("February",28),MAR("March",31),APR("April",30),MAY("May",31),JUN("June",30),JUL("July",31),AUG("August",31), SEP("September",30),OCT("Octouber",31),NOV("November",30), DEC("December",31);

    // fields
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("name='").append(name).append('\'');
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }

    public Month plusMonth(int quantity){
//        int n = month.ordinal();
//        int index = n + quantity; // новое quantity

        int index = this.ordinal() + quantity;
        Month[] months = Month.values(); // чтобы получить длину массива в след строке
        int res = index % months.length; // индекс нового месяца: 13 % 12 = 1, 7 % 12 = 7

        return months[res];
    }


} // end of class
