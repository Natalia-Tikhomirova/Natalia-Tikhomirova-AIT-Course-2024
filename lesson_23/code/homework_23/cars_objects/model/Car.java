package homework_23.cars_objects.model;

 // Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км. Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
 // - марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
 // - тип расходуемого топлива: d, b, d, d, b
 // - стоимость 1 литра топлива: d - 1.6, b - 1.8
 // - расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
 // - стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49
 // Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

public class Car {

    // fields
    private String brand;
    private String fuelType;                                  // diesel or petrol
    private double fuelPricePerLitre;                         // price per liter
    private double fuelConsumptionPer100Km;                   // consumption per 100 km
    private double rentalCostPerWeek;                         // rental cost per week
    private int totalDistance;                                // общее расстояние поездки

    // constructor
    public Car(String brand, String fuelType, double fuelPricePerLitre, double fuelConsumptionPer100Km, double rentalCostPerWeek, int totalDistance) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.fuelPricePerLitre = fuelPricePerLitre;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.rentalCostPerWeek = rentalCostPerWeek;
        this.totalDistance = totalDistance;
    }


    // getters and setters
    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double calculateTotalCost() {
        // Расчет общей стоимости аренды и топлива:
        double fuelNeeded = (fuelConsumptionPer100Km / 100) * totalDistance; // Расход топлива на дистанцию
        double fuelCost = fuelNeeded * fuelPricePerLitre; // Общая стоимость топлива
        return fuelCost + rentalCostPerWeek; // Общая стоимость
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", fuelType='").append(fuelType).append('\'');
        sb.append(", fuelPricePerLitre=").append(fuelPricePerLitre);
        sb.append(", fuelConsumptionPer100Km=").append(fuelConsumptionPer100Km);
        sb.append(", rentalCostPerWeek=").append(rentalCostPerWeek);
        sb.append(", totalDistance=").append(totalDistance);
        sb.append('}');
        return sb.toString();
    }

} // end of class




