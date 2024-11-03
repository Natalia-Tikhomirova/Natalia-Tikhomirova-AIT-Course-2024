package classwork_37.city_bus;

// - создать список городских маршрутов на основе автобусов из городского автопарка;
//- отсортировать автобусы в порядке убывания их вместимости;
//- подсчитать общую вместимость автобусов из автопарка.

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Bus implements Comparable<Bus> {

    private String model;
    private String regNumger;
    private String rout;
    private int busCapacity;

    public Bus(String model, String regNumger, String rout, int busCapacity) {
        this.model = model;
        this.regNumger = regNumger;
        this.rout = rout;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumger() {
        return regNumger;
    }

    public void setRegNumger(String regNumger) {
        this.regNumger = regNumger;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return Objects.equals(regNumger, bus.regNumger);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNumger);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("model='").append(model).append('\'');
        sb.append(", regNumger='").append(regNumger).append('\'');
        sb.append(", rout='").append(rout).append('\'');
        sb.append(", busCapacity=").append(busCapacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(@NotNull Bus o) {
        return - Integer.compare(this.getBusCapacity(),o.getBusCapacity()); // сортировка от большего к меньшему, поэтому ставим минус
    }
}
