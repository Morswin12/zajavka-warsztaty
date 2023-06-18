package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P23_IO__in_out_Serialization_Deserialization_cz_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File destination = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P23_IO__in_out_Serialization_Deserialization_cz_2/objectCars.wathever");

        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Ford Mustang", 1967L, List.of(new Door("left"), new Door("right"))));
//        cars.add(new Car("BMW 3", 2015L, List.of(new Door("left"), new Door("right"))));
//        cars.add(new Car("Mercedec G-class", 2004L, List.of(new Door("left"), new Door("right"))));

//        serialize(cars, destination);
//        System.out.println("SERIALIZED");
//        System.out.println();
//        System.out.println();

        System.out.println("DESERIALIZED START");
        deserializedCars(destination);
        System.out.println("DESERIALIZED END");
    }

    private static void serialize(List<?> objects, File destination) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(destination)
                )
        )
        ) {
            for (Object object : objects) {
                outputStream.writeObject(object);

            }

        }
    }

    private static List<Car> deserializedCars(File destination) throws IOException, ClassNotFoundException {
        List<Car> result = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(destination)
                )
        )
        ) {
            while (true) {
                Object objects = inputStream.readObject();
                if (!(objects instanceof Car)) {
                    System.out.println("Object is not Concrete!");
                }
                Car concreteObject = (Car) objects;
                System.out.println("Successfully read a Object: " + concreteObject);
                result.add(concreteObject);
            }

        } catch (EOFException e) {
            System.out.println("End of File!");
        }

        return result;
    }
}
