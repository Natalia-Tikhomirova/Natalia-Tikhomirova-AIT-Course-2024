package homework_37.compititions.model;

import java.util.Objects;

public class Athlete {

    private String lastName;
    private String firstName;
    private int registrationNumber;
    private String club;
    private double result;

    public Athlete(String lastName, String firstName, int registrationNumber, String club, double result) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getClub() {
        return club;
    }

    public double getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Athlete athlete)) return false;
        return registrationNumber == athlete.registrationNumber && Double.compare(result, athlete.result) == 0 && Objects.equals(lastName, athlete.lastName) && Objects.equals(firstName, athlete.firstName) && Objects.equals(club, athlete.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, registrationNumber, club, result);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Athlete{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", club='").append(club).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
} // end of class
