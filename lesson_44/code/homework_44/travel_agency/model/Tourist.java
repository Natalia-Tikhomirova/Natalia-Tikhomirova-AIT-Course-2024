package homework_44.travel_agency.model;

import java.util.List;

public class Tourist {

    private String name;
    private List<String> countries;

    public Tourist(String name, List<String> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tourist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", countries=").append(countries);
        sb.append('}');
        return sb.toString();
    }
} // end of class
