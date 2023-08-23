package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P15_PROTOTYPE;

import lombok.SneakyThrows;

public class Main {
    // Prototype
    // shallow copy     -> kopiuje obiekt oraz referencje do pól
    // deep copy        -> kopiuje obiekt oraz kopiuje wszystkie pola (klasy zależne);
    //      Używamy, gdy chcemy skopiować już istniejącą klasę i ewentualnie coś w niej zmienić, zamiast tworzyć
    //              wszystko od nowa. ma to większe znaczenie, gdy np. wyniki niektórych

    @SneakyThrows
    public static void main(String[] args) {
        PrototypeCar originalCar = new PrototypeCar();

        PrototypeCar clonedCar = originalCar.clone();

        System.out.println(originalCar == clonedCar);
        System.out.println(originalCar.getSteeringWheel() == clonedCar.getSteeringWheel());
        System.out.println(originalCar.getBrand() == clonedCar.getBrand());
        System.out.println(originalCar.getModel() == clonedCar.getModel());
        System.out.println(originalCar.getDoors() == clonedCar.getDoors());

        System.out.println("OriginalCar: " + originalCar);
        System.out.println("ClonedCar: " + clonedCar);

        clonedCar.getDoors().add("back door");

        System.out.println("OriginalCar: " + originalCar);
        System.out.println("ClonedCar: " + clonedCar);


//        CopyCar copyCar = new CopyCar();
//        SteeringWheel steeringWheel = new SteeringWheel();
//        steeringWheel.setDiameter(10.5);
//        copyCar.setSteeringWheel(steeringWheel);
//
//        CopyCar shallowCopy = copyCar.shallowCopy();
//        System.out.println(shallowCopy);
//        CopyCar deepCopy = copyCar.deepCopy();
//        System.out.println(deepCopy);
//
//        System.out.println((copyCar == shallowCopy) + "  copyCar == shallowCopy");
//        System.out.println(copyCar.equals(shallowCopy) + "  copyCar.equals(shallowCopy)");
//
//        System.out.println((copyCar.getSteeringWheel() == shallowCopy.getSteeringWheel()) + "  (copyCar.getSteeringWheel() == shallowCopy.getSteeringWheel())");
//        System.out.println(copyCar.getSteeringWheel().equals(shallowCopy.getSteeringWheel()) + "  (copyCar.getSteeringWheel().equals(shallowCopy.getSteeringWheel()))");
//
//        System.out.println((copyCar.getSteeringWheel() == deepCopy.getSteeringWheel()) + "  (copyCar.getSteeringWheel() == deepCopy.getSteeringWheel())");
//        System.out.println(copyCar.getSteeringWheel().equals(deepCopy.getSteeringWheel()) + "  (copyCar.getSteeringWheel().equals(deepCopy.getSteeringWheel()))");


    }

}
