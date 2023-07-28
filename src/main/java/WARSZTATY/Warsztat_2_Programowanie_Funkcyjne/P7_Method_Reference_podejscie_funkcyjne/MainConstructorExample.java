package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

import java.util.Optional;

public class MainConstructorExample {

    public static void main(String[] args) {
        MainConstructorExample main = new MainConstructorExample();
        main.run();

    }

    static void printDoggyStatic(final Dog dog) {
        System.out.println(dog);
    }

    private void run() {
        SteeringWheel steeringWheel = new SteeringWheel(51.30);

        Car car = Optional.of(steeringWheel)
//                .map(sw -> new Car(sw))
                .map(Car::new)
                .orElse(new Car(new SteeringWheel(0.0)));

        System.out.println(car);
    }

}
