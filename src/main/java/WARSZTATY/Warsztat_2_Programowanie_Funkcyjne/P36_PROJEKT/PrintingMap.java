package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P36_PROJEKT;

import java.util.Map;

public class PrintingMap {
    //    public static <K, V> void printingMap(Map<K, V> map) {
    public static void printingMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}
