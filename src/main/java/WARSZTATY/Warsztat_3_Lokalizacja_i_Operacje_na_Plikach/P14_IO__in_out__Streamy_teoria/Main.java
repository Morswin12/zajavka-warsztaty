package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P14_IO__in_out__Streamy_teoria;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // IO Stream
        // Stream
        // InputStream / OutputStream
        // Reader / Writer
        // BufferedStream
        //
        // UTF-8, UTF-16, US-ASCII, ISO_8859_1

        // Reader - klasa abstrakcyjne i dziedziczą z niej wszystkie Readery
        // FileReader - klasa, która czyta pojedyncze znaki z pliku | niskigo poziou
        // InputStreamReader - klasa czytająca znaki z przekazanego do niej InputStreama | wysoki poziom
        // BufferedReader - czytająca, grupująca w paczki  | wysoki poziom
        // Writer - Klasa abstrakcyjna, do dziedziczenia przez inne writery
        // FileWriter - stream do zapisywania danych w formie znaowej | niskiego poziomu
        // OutputStreamWriter - klasa zapisująca znaki z przekazanego do niej InputStreama | wysoki poziom
        // BufferedWriter - stream zapisujący, grupująca w paczki  | wysoki poziom
        // PrintWriter - stream ułatwiajacy formatowanie treści  | wysoki poziom
        // InputStream - klasa abstrakcyjna z której dziedziczą inne Input Streamy
        // FileInputStream - klasa odczytująca informacje z plików w postaci bajtów | niski poziom
        // BufferedInputStream - klasa buforująca odczyt bajtów | wysoki poiom
        // ObjectinputStream - klasa, która może odczytac obiekt Javovy | wysoki poziom
        // OutputStream - klasa abstrakcyjna z której dziedziczą inne Output Streamy
        // FileOutputStream - klasa zapisujca pojedyncze bajtów | niski poziom
        // BufferedoUTPUTStream - klasa GRUPUJĄCA OUTPUT STREAM, poprawia wydajność | wysoki poiom
        // ObjectOutputStream - klasa, pozwalająca na zapis do OutoStreama obiektów Java  | wysoki poziom
        // PrintStream - klasa pozwalająca na łatwiejsze formatowanie treści | wysoki poziom

        // .flash() - wymusza zapisanei na dysku
        // .skip() - pozwala pominąć (rzadko używana)


        System.out.println("Charset.defaultCharset(): " + Charset.defaultCharset());

        String someSentence = "asdasd łóćśąźżćó";
        byte[] bytes = someSentence.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println(someSentence);

        String collectedString = new String(bytes, StandardCharsets.UTF_16LE);
        System.out.println(Arrays.toString(someSentence.getBytes(StandardCharsets.UTF_16)));
        String collectedString2 = new String(bytes, StandardCharsets.UTF_8);
        byte[] bytes2 = someSentence.getBytes(StandardCharsets.UTF_8);
        System.out.println(collectedString);
        System.out.println(collectedString2);

        Charset.availableCharsets().keySet().forEach(System.out::println);


//        try (ObjectInputStream objectInputStream = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("someFile1.txt")
//                )
//        )) {
//
//        }

    }
}
