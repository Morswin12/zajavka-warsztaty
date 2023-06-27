package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P37_Projekt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
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
        printFileNameAndFileSize();


//        BigDecimal zero = BigDecimal.ZERO;
//        List<BigDecimal> nissan = purchases.stream()
//                .filter(pur -> pur.getSamochod().getCar_company().equals("Nissan"))
//                .map(purchase -> purchase.getSamochod().getPrice())
//                .collect(Collectors.toList());
//        for (BigDecimal bigDecimal : nissan) {
//            zero = zero.add(bigDecimal);
//        }
//        System.out.println(nissan);
//        System.out.println(zero);


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
                System.out.println(longListEntry.getKey()+",  "+longListEntry.getValue());
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
}
