package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

import java.math.BigDecimal;

public class Samochod {
    private final String color;
    private final String car_vin;
    private final String car_company;
    private final String car_model;
    private final String model_year;
    private final BigDecimal price;


    public Samochod(String color, String car_vin, String car_company, String car_model, String model_year, BigDecimal price) {
        this.color = color;
        this.car_vin = car_vin;
        this.car_company = car_company;
        this.car_model = car_model;
        this.model_year = model_year;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getCar_vin() {
        return car_vin;
    }

    public String getCar_company() {
        return car_company;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getModel_year() {
        return model_year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " "  + car_company + " model: " + car_model + '\'' +
                ", color='" + color + '\'' +
                ", VIN='" + car_vin + '\'' +
                ", rocznik='" + model_year + '\'' +
                ", cena ="  + price +
                " euro";
    }
}
