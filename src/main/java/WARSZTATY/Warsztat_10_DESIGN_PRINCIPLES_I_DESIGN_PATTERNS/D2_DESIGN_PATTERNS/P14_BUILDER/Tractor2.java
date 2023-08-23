package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P14_BUILDER;

import lombok.ToString;

@ToString
public class Tractor2 {

    private final String brand;
    private final String model;
    private final String horsePower;
    private final CaroseryColor color;
    private final Fuel fuel;
    private final String year;
    private final Boolean tur;
    private final Boolean tuz;

    private Tractor2(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.horsePower = builder.horsePower;
        this.color = builder.color;
        this.fuel = builder.fuel;
        this.year = builder.year;
        this.tur = builder.tur;
        this.tuz = builder.tuz;
    }

    public static Builder builder() {
        return new Tractor2.Builder();
    }

    public static class Builder {
        private String brand;
        private String model;
        private String horsePower;
        private CaroseryColor color;
        private Fuel fuel;
        private String year;
        private Boolean tur;
        private Boolean tuz;


        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder horsePower(String horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder color(CaroseryColor color) {
            this.color = color;
            return this;
        }

        public Builder fuel(Fuel fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder tur(Boolean tur) {
            this.tur = tur;
            return this;
        }

        public Builder tuz(Boolean tuz) {
            this.tuz = tuz;
            return this;
        }

        public Tractor2 build() {
            return new Tractor2(this);
        }
    }
}
