package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P14_BUILDER;

public class Main {
    public static void main(String[] args) {
        /* Builder — używamy, gdy chcemy mieć możliwość stworzenia obiektu przypisując mu wartości tylko wybranych
                pól.
                Zamiast tworzyć ten wzorzec samemu z ręki możemy także użyć Lombok-owej adnotacji "@Builder"

         */

        Car car1 = Car.builder()
                .brand("Ford")
                .model("Mustang")
                .year("1969")
                .skiRack("skiRack")
                .build();

        Car.Builder builder = Car.builder();
        builder.skiRack("no");
        builder.brand("Peugeot");
        builder.model("307SW");
        builder.sunRoof("yes");
        builder.year("2007");
        builder.towbar("yes");
        Car car2 = builder.build();

        System.out.println(car2);
        System.out.println(car1);


        Tractor tractor = Tractor.builder()
                .horsePower("35 KM")
                .tur(true)
                .color("red")
                .fuel(Fuel.DIESEL)
                .tuz(false)
                .brand("Ursus")
                .model("330")
                .year("1988")
                .build();

        System.out.println(tractor);

        Tractor2 tractor2 = Tractor2.builder()
                .horsePower("100 KM")
                .tur(true)
                .color(CaroseryColor.ORANGE)
                .fuel(Fuel.DIESEL)
                .tuz(true)
                .brand("Case")
                .model("750VK")
                .year("2008")
                .build();

        System.out.println(tractor2);
    }

}
