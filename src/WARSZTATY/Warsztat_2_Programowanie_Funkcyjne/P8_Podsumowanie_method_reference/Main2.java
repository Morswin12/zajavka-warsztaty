package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P8_Podsumowanie_method_reference;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of(new Ship())
//                .map(ship  -> ship.getModel())
                .map(Ship::getModel);
        System.out.println(optionalS);

        Optional<String> optionalS2 = Optional.of(new Ship("Klacz"))
                .map(ship -> ship.getModel(ship));

        Optional<Ship> predator = Optional.of("Predator")
                .map(Ship::new);
        System.out.println(predator);
    }
}
