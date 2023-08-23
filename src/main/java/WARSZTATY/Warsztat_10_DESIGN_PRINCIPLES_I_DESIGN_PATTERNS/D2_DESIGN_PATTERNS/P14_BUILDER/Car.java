package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P14_BUILDER;

import lombok.ToString;

@ToString
public class Car {
    private final String brand;

    private final String model;
    private final String year;
    private final String towbar;
    private final String sunRoof;
    private final String skiRack;
    private Car(final Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.towbar = builder.towbar;
        this.sunRoof = builder.sunRoof;
        this.skiRack = builder.skiRack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String brand;
        private String model;
        private String year;
        private String towbar;
        private String sunRoof;
        private String skiRack;
        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder towbar(String towbar) {
            this.towbar = towbar;
            return this;
        }

        public Builder sunRoof(String sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public Builder skiRack(String skiRack) {
            this.skiRack = skiRack;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }

}
