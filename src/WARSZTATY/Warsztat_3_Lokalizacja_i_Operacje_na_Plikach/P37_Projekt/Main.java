package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/625edfcaf77be5002444b113-client-car-purchase-spreadsheet.csv");
        List<String> inputList = new ArrayList<>();
        List<Purchase> purchases = new ArrayList<>();

        // stworzenie listy Stringów gdzie każda linia jest nową pozycją
        readInputFileAndAddContentToLineList(path, inputList);

        // Stworzenie Listy Transakcji z listy Stringów danych wejściowych, gdzie każda pozycja jest nową transakcją
        inputList.forEach(line -> madePurchesListWithLineList(line, purchases));

        // ZAD 2 zapisz Transakcje do plikw sortujc po marce samochodu:
//        recordToFileRaportDependingOnTheCompany(purchases);

        // wydruk posortowanej listy nazwy Producenta i wielkoci pliku z transakcjami
//        printFileNameAndFileSize();

        // ZADANIE 3
//        createNewFileWithRaport(purchases);

        String model = "TL";
        checkAmountOfSelledModel(purchases, model);

        // ZADANIE 4

        createNewFileWithRaportForExe4(purchases);
    }

    private static void createNewFileWithRaportForExe4(List<Purchase> purchases) {
        List<String> raport1 = madeRaportDailySellingCars_Exe_4a(purchases);
        List<String> raport2 = madeRaportDailySellingCars_Exe_4b(purchases);

        Path pathOnNewFilesZad4a = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/Zad_4_pliki/RaportOfDailySellingVar1.txt");
        Path pathOnNewFilesZad4b = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/Zad_4_pliki/RaportOfDailySellingVar2.txt");
        universalMethodToWriteDataToFileFromList(raport1, pathOnNewFilesZad4a);
        universalMethodToWriteDataToFileFromList(raport2, pathOnNewFilesZad4b);

    }

    private static List<String> madeRaportDailySellingCars_Exe_4b(List<Purchase> purchases) {
        TreeMap<LocalDate, BigDecimal> map = purchases.stream().collect(Collectors.toMap(
                Purchase::getData_zakupu,
                value -> BigDecimal.ONE,
                BigDecimal::add,
                TreeMap::new
        ));
        ArrayList<Map.Entry<LocalDate, BigDecimal>> entryArrayList = new ArrayList<>(map.entrySet());
        entryArrayList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        return entryArrayList.stream()
                .map(entry -> "W dniu: " + entry.getKey() + " sprzedano: " + entry.getValue() + " aut." )
                .collect(Collectors.toList());
    }

    private static List<String> madeRaportDailySellingCars_Exe_4a(List<Purchase> purchases) {
        TreeMap<LocalDate, BigDecimal> collect = purchases.stream().collect(Collectors.toMap(
                Purchase::getData_zakupu,
                value -> BigDecimal.ONE,
                BigDecimal::add,
                TreeMap::new
        ));

        return collect.entrySet().stream()
                .map(entry -> "W dniu: " + entry.getKey() + " sprzedano: " + entry.getValue() + " aut.")
                .collect(Collectors.toList());
    }


    private static void createNewFileWithRaport(List<Purchase> purchases) {
        List<String> raportAboutAveragePriceDependentOnCarsModel = madeRaportAboutAveragePriceDependentOnCarsModel(purchases);

        Path pathOnNewFilesZad3 = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/Zad_3_pliki/RaportOfAveragePrice.txt");

        universalMethodToWriteDataToFileFromList(raportAboutAveragePriceDependentOnCarsModel, pathOnNewFilesZad3);
    }

    private static List<String> madeRaportAboutAveragePriceDependentOnCarsModel(List<Purchase> purchases) {
        TreeMap<String, List<BigDecimal>> stringListTreeMap = purchases.stream().collect(Collectors.toMap(
                key -> "" + key.getSamochod().getCar_company() + " " + key.getSamochod().getCar_model(),
                value -> List.of(value.getSamochod().getPrice(), BigDecimal.ONE),
                (left, right) -> List.of(left.get(0).add(right.get(0)), left.get(1).add(BigDecimal.ONE)),
                TreeMap::new
        ));
        return stringListTreeMap.entrySet().stream()
                .map(entry -> "Samochd: " + entry.getKey() + ", sprzedano: " + entry.getValue().get(1)
                        + " szt., gdzie średnia cena to: " + averagePriceOfModel(entry) + " Euro.")
                .collect(Collectors.toList());
    }

    private static BigDecimal averagePriceOfModel(Map.Entry<String, List<BigDecimal>> entry) {
        return entry.getValue().get(0).divide(entry.getValue().get(1), 2, RoundingMode.HALF_UP);
    }


    private static void printFileNameAndFileSize() {
        Path pathOnFiles = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/Zad_2_pliki");
        try {
            Stream<Path> listOfFilesTxt = Files.list(pathOnFiles);
            TreeMap<Long, List<String>> collect = listOfFilesTxt.collect(Collectors.toMap(
                    key1 -> {
                        long size = 0;
                        try {
                            size = Files.size(key1.toAbsolutePath());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return size;
                    },
                    value -> new ArrayList<>(List.of(value.getFileName().toString().replaceAll("\\.txt", ""))),
                    Main::margeObjectToValueInMapIfDuplicate,
                    TreeMap::new
            ));

            for (Map.Entry<Long, List<String>> longListEntry : collect.entrySet()) {
                System.out.println(longListEntry.getKey() + ",  " + longListEntry.getValue());
            }
            System.out.println(collect);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void recordToFileRaportDependingOnTheCompany(List<Purchase> purchases) {
        LinkedHashSet<String> collect = purchases.stream()
                .map(p -> p.getSamochod().getCar_company())
                .collect(Collectors.toCollection(LinkedHashSet::new));
//        System.out.println(collect);

        Map<String, List<Purchase>> mapKeyCompanyValuePurchase = purchases.stream()
                .collect(Collectors.toMap(
                        key -> key.getSamochod().getCar_company(),
                        value -> new ArrayList<>(List.of(value)),
                        Main::margeObjectToValueInMapIfDuplicate,
                        HashMap::new));

//        System.out.println(mapKeyCompanyValuePurchase);
        for (Map.Entry<String, List<Purchase>> stringListEntry : mapKeyCompanyValuePurchase.entrySet()) {

            String pathString = "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P37_Projekt/Zad_2_pliki/"
                    + stringListEntry.getKey() + ".txt";
            Path path = Paths.get(pathString);

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write(stringListEntry.getValue().toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static <R> List<R> margeObjectToValueInMapIfDuplicate(List<R> left, List<R> right) {
        List<R> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }

    private static void readInputFileAndAddContentToLineList(Path path, List<String> inputList) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                inputList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void madePurchesListWithLineList(String line, List<Purchase> purchaseList) {
        String[] split = line.split(",");
        int length = split.length;
        String[] splitDate = split[13].split("-");
        List<Integer> collect = Arrays.stream(splitDate).map(Integer::parseInt)
                .toList();
        String[] priceArray = split[10].split("€");
        String[] price = priceArray[1].split("\"");
//        System.out.println("length: " + length);
//        System.out.println("id: " + split[0] + ", first_name: " + split[1] + ", second_name: " + split[2] + ", email: "
//                + split[3] + ", ip: " + split[4] + ", color: " + split[5] + ", VIN: " + split[6]
//                + ", Company: " + split[7] + ", model: " + split[8] + ", year: " + split[9] + ", price: " + split[10]
//                + ", country: " + split[11] + ", city: " + split[12] + ", date: " + split[13]);
        purchaseList.add(
                new Purchase(
                        new BigDecimal(split[0]),
                        new Osoba(
                                split[1],
                                split[2],
                                split[3],
                                split[4]),
                        new Samochod(
                                split[5],
                                split[6],
                                split[7],
                                split[8],
                                split[9],
                                new BigDecimal(price[0])),
                        new Lokalizacja(
                                split[11],
                                split[12]),
                        LocalDate.of(
                                collect.get(0),
                                collect.get(1),
                                collect.get(2))
                )
        );

    }

    private static void checkAmountOfSelledModel(List<Purchase> purchases, String model) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<BigDecimal> decimalList = new ArrayList<>();
        decimalList.add(BigDecimal.ZERO);
        purchases.stream()
                .filter(purchase -> model.equals(purchase.getSamochod().getCar_model()))
                .forEach(purchase -> {
                            atomicInteger.addAndGet(1);
                            decimalList.add(purchase.getSamochod().getPrice());
                            System.out.println(purchase.getSamochod().getPrice());
                        }
                );
        BigDecimal decimal = BigDecimal.ZERO;
        for (BigDecimal bigDecimal : decimalList) {
            decimal = decimal.add(bigDecimal);
        }
        BigDecimal averagePrice = decimal.divide(BigDecimal.valueOf(atomicInteger.longValue()), 2, RoundingMode.HALF_UP);
        System.out.println("Model: \"" + model + "\" został sprzedany: " + atomicInteger + " razy, średnia cena to: " + averagePrice);
    }

    private static void universalMethodToWriteDataToFileFromList(List<String> raportAboutAveragePriceDependentOnCarsModel, Path pathOnNewFilesZad4a) {
        try (BufferedWriter writer = Files.newBufferedWriter(pathOnNewFilesZad4a)) {
            int id = 1;
            for (String s : raportAboutAveragePriceDependentOnCarsModel) {
                writer.write(id + ". " + s);
                writer.newLine();
                id++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
