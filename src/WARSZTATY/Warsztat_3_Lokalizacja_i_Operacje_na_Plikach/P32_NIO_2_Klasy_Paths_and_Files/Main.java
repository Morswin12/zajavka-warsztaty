package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P32_NIO_2_Klasy_Paths_and_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Path i Paths
//        File i Files
        Path path = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/file.txt");
        Path path2 = Paths.get("src/././WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/file.txt");
        Path pathCopied = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/fileCopied.txt");
        Path newDirectory = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/NewCatalog");
        Path newDirectories = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/NewCatalog1/NewCatalog2/NewCatalog3");
        Path pathFileToMove = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/newFileToMove.txt");
        Path movedPath = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/movedFile.txt");
        Path deletePath = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P32_NIO_2_Klasy_Paths_and_Files/deletePath.txt");

        System.out.println("Czu ścieżka istnieje: " + Files.exists(path));
        try {
            // stworzy jeden katalog
//            System.out.println(Files.createDirectory(newDirectory));

            // może stworzyć wiele katalogów
//            System.out.println(Files.createDirectories(newDirectories));

            // kopiuje pliki/catalogi ale tyklo pierwszy nowy plik/catalog
//            System.out.println(Files.copy(path, pathCopied));

            // przeniesienie lub zmiana nazwy pliku
//            System.out.println(Files.move(pathFileToMove, movedPath));

            // usuwanie lub rzucanie wyjątku
//            Files.delete(movedPath);

            // usuwanie jesli istnieje
//            System.out.println(Files.deleteIfExists(deletePath));

            // czyta wszystkie linie z pliku do listy stringów (jak streamy)
            List<String> stringList = Files.readAllLines(path);
            System.out.println(stringList);
            stringList.forEach(line -> System.out.println("Line: " + line));

            // czyta wszystkie bajty z pliku (jak streamy)
            byte[] bytes = Files.readAllBytes(path);
            System.out.println("\n" + bytes);

            // sprawdzenie, czy ścieżki wskazują ten sam plik/katalog
            System.out.println("\nFiles.isSameFile: " + Files.isSameFile(path, pathCopied));
            System.out.println("\nFiles.isSameFile: " + Files.isSameFile(path, path2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
