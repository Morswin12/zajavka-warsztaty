package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

public class Main {
    /*
    DECORATOR -> taki tuning samochodu. Gdy mamy jakieś klasy z zewnętrznej biblioteki (których nie możemy modyfikować)
                chcemy dodać im jakieś nowe funkcjonalności to używamy wzorca dekorator. Dzięki temu otrzymujemy
                ulepszoną klasę, ale jednocześnie mamy dostęp do oryginalnej klasy.
     */
    public static void main(String[] args) {
        Car car = new CarImpl();
        System.out.println(car.create());
        Car car1 = new NeonDecorator(car);
        System.out.println(car1.create());
        Car car2 = new RimsDecorator(car);
        System.out.println(car2.create());
        Car car3 = new SpoilerDecorator(new CarImpl());
        System.out.println(car3.create());
        Car car4 = new RimsDecorator(car1);
        Car car5 = new SpoilerDecorator(car4);
        System.out.println(car4.create());
        System.out.println(car5.create());
        System.out.println(new NeonDecorator(new SpoilerDecorator(new NeonDecorator(new RimsDecorator(new CarImpl())))).create());

        Car car6 = new CarDecorator(new CarImpl()) {
            @Override
            public String create() {
                return super.create() + withTurbo();
            }

            private String withTurbo() {
                return " with Turbo";
            }
        };
        System.out.println(car6.create());


        // przy użyciu lambdy

        Car originalCar = new CarImpl();
        Car car8 = () -> "Cotam cotam " + originalCar.create() + " with Extra power";
        System.out.println(car8.create());
    }
}
