package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class Main2_Atrybuty_Plikow {
    public static void main(String[] args) throws IOException {
        Path pathIn = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P33_NIO_2_Klasy_Paths_and_Files_Porownanie_NIO_2_vs_IO/file.txt");

        // wielkość pliku w bajtach (polskie znaki zajmują 2 bajty)
        long size = Files.size(pathIn);
        System.out.println(size);

        // kiedy by modyfikowany plik

        Files.setLastModifiedTime(pathIn, FileTime.from(18234L, TimeUnit.HOURS));
        FileTime lastModifiedTime = Files.getLastModifiedTime(pathIn);
        System.out.println(lastModifiedTime);

        //czy jest plikiem, czy katalogiem
        System.out.println(Files.isDirectory(pathIn));
        System.out.println(Files.isRegularFile(pathIn));

        // czy plik jest ukryty:
        System.err.println(Files.isHidden(pathIn));

        // czy plik jest czytalny, tzn czy mamy uprawnienia do odczytu:
        System.err.println(Files.isReadable(pathIn));

        // czy plik jest wykonywalny (np czy moemy wejść do folderu lub odczytać plik? ) :
        System.err.println(Files.isExecutable(pathIn));





    }
}
