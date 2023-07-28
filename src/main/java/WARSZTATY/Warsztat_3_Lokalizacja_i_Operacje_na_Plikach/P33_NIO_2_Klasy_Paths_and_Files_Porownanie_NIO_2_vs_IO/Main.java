package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // nowe BufferedReader

        Path pathIn = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO/file.txt");
        try {
            Files.createFile(pathIn);
        } catch (IOException e) {
            System.err.println("Ten Plik już istnieje cepie: ");
            System.out.println(e.getMessage());
        }
        List<String> stringList = new ArrayList<>();
        try {
            stringList = Files.readAllLines(pathIn);
        } catch (IOException e) {
            System.out.println("Jakię błąd: " + e.getMessage());
        }
        List<String> stringStream = stringList.stream().map(linne -> linne + "2").collect(Collectors.toList());

        System.out.println(stringStream);

        // nowe BufferedReader - tworzymy go tak jak poniżej:
        // Files.newBufferedReader i zwraca BufferedReader
        try (BufferedReader bufferedReader = Files.newBufferedReader(pathIn);
        ) {
            // tu czytamy linia po lini w pętli
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Błąd z czymśtam: " + e.getMessage());
            e.printStackTrace();

        }


        Path pathOut = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO/fileCopied.txt");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(pathOut)) {
            bufferedWriter.write("gorororo 1");
            bufferedWriter.newLine();
            bufferedWriter.write("gorororo 2");

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
