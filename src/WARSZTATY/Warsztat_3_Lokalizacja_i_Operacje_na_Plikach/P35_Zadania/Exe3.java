package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P35_Zadania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe3 {
    public static void main(String[] args) {
        Path path = Paths.get("src/WARSZTATY");
        String extension = "txt";
        try {
            Files.walk(path)
                    .filter(Files::isRegularFile)
                    .forEach(file -> printFileAndSize(file));
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printFileAndSize(Path file) {
        try {
            System.out.println("File: " + file.getFileName() + ", is located on: \n" + file.toAbsolutePath()
                    +"\nSize is: " + Files.size(file) + " bytes, "+ (Files.size(file)/1000) + " kb\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
