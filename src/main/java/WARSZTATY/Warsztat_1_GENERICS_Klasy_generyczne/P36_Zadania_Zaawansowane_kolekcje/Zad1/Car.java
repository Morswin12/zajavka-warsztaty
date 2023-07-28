package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad1;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && model.equals(car.model) && year.equals(car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return "Car: " + year
                + ", "+ brand
                + ", " + model
                + " | ";
    }

    @Override
    public int compareTo(Car o) {
        int i = this.year.compareTo(o.year);
        if (i == 0) {
            i += this.brand.compareTo(o.brand);
        }
        if (i == 0) {
            i = this.model.compareTo(o.model);
        }
        return i;
    }
}
