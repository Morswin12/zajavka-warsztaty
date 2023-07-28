package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P22_IO__in_out_Serialization_Deserialization_cz_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File destination = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P21_IO__in_out_Serialization_Deserialization_cz_1/carsList.wathever");

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Ford Mustang", 1967L, List.of(new Door("left"), new Door("right"))));
//        cars.add(new Car("BMW 3", 2015L, List.of(new Door("left"), new Door("right"))));
//        cars.add(new Car("Mercedec G-class", 2004L, List.of(new Door("left"), new Door("right"))));
//
//        serializeCars(cars, destination);

        List<Car> carsDeserialized = deserializedCars(destination);
        for (Car car : carsDeserialized) {
            System.out.println(car);
        }
//        System.out.println(carsDeserialized);
    }

    private static void serializeCars(List<Car> cars, File destination) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(destination)
                )
        )
        ) {
            for (Car car : cars) {
                outputStream.writeObject(car);

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
                    System.out.println("Object is not Car!");
                }
                Car carRead = (Car) objects;
                System.out.println("Succesfully read a Car: " + carRead);
                result.add(carRead);
            }

        } catch (EOFException e) {
            System.out.println("End of File!");
        }

        return result;
    }
}
