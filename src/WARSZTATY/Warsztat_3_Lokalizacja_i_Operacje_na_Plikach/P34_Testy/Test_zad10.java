package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P34_Testy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test_zad10 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Goro IT\\ZAJAVKA\\WarsztatyZajavka\\WarsztatyZajavka\\scr\\WARSZTATY\\Warsztat_3_Lokalizacja_i_Operacje_na_Plikach\\P34_Testy.bootcamp.txt");
        System.out.println(path.toAbsolutePath());
        try {
            Files.lines(path)
                    .flatMap(line -> Stream.of(line.split("a")))
                    .forEach(System.out::println);


        } catch (IOException e) {
            e.getMessage();
        }
    }
}
