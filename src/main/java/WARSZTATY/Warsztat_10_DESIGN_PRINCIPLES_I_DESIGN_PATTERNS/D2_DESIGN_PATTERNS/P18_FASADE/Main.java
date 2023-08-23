package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P18_FASADE;

public class Main {
    /* Facade (Fasada)  -> Polega na tym, że majac kilka interfejsów chcemy w jakichś sposób ujednolicić, zunifikować
                        dostęp do tych interfejsów (wprowadzić jeden punkt dostępu do tych wszystkich interfejsów).
                        Tworzymy takie jedno źródło prawdy.
                        Interfejsy, które chcemy zgrupowań powinny być do Siebie podobne.

                        Przykład:
                        Fasadą może być tworzenie auta i tym jednym procesem pod spodem mamy zbiór ogromnej ilości
                        czynności stanowiących całość procesu.


     */
    public static void main(String[] args) {

        CarFactoryFacade carFactoryFacade = new CarFactoryFacade();
        carFactoryFacade.produceCar();
    }
}
