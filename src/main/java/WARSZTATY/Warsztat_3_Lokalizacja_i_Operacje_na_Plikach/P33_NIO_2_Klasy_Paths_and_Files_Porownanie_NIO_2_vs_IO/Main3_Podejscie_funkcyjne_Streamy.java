package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main3_Podejscie_funkcyjne_Streamy {
    public static void main(String[] args) throws IOException {
        Path pathIn = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/");

        //
        List<Path> lines = Files.list(pathIn).collect(Collectors.toList());
        lines.forEach(System.out::println);

        List<Path> absolute = Files.list(pathIn)
//                .filter(Files::isRegularFile)
                .filter(Files::isDirectory)
                .map(Path::toAbsolutePath)
                .collect(Collectors.toList());

        absolute.forEach(System.out::println);


        // listy z pliku
        Path pathIn2 = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO/file.txt");

        List<String> stringList = Files.lines(pathIn2)
                .map(l -> l.toUpperCase())
                .filter(l -> l.contains("S"))
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);

    }
}
