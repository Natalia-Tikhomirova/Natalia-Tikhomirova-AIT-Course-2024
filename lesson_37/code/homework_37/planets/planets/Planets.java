package homework_37.planets.planets;

// Занести планеты солнечной системы в список, содержащий:
// - наименование;
// - расстояние до Солнца;
// - массу;
// - количество спутников.

import java.util.Objects;

public class Planets {

    private String  name;
    private double distanceTiTheSun;
    private double weight;
    private int numberOfSatellites;

    public Planets(String name, double distanceTiTheSun, double weight, int numberOfSatellites) {
        this.name = name;
        this.distanceTiTheSun = distanceTiTheSun;
        this.weight = weight;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public double getDistanceTiTheSun() {
        return distanceTiTheSun;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planets)) return false;
        return Double.compare(distanceTiTheSun, planets.distanceTiTheSun) == 0 && Double.compare(weight, planets.weight) == 0 && numberOfSatellites == planets.numberOfSatellites && Objects.equals(name, planets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceTiTheSun, weight, numberOfSatellites);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceTiTheSun=").append(distanceTiTheSun);
        sb.append(", weight=").append(weight);
        sb.append(", numberOfSatellites=").append(numberOfSatellites);
        sb.append('}');
        return sb.toString();
    }
} // end of class
