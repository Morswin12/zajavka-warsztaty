package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P35_Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exe2 {
    public static void main(String[] args) {
        Path path = Paths.get("src/WARSZTATY");
        String extension = "txt";
        String searchingContent = "zajavka";
        try {
            Files.walk(path)
                    .filter(Files::isRegularFile)
                    .filter(file -> checkEkstension(file, extension))
                    .filter(file -> checkIfContentExistInFile(file, searchingContent))
                    .forEach(file -> System.out.println(file.toAbsolutePath()));
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean checkIfContentExistInFile(Path file, String content) {
        boolean result = false;
        try (BufferedReader writer = Files.newBufferedReader(file)
        ) {
            String line = null;
            while ((line = writer.readLine()) != null) {
                if (line.contains(content)) {
                    result = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Jakiś błąd w kodzie: " + e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    private static boolean checkEkstension(Path file, String extension) {
        String[] split = file.getFileName().toString().split("\\.");
        if (split.length != 2) {
            return false;
        } else {
            return extension.equals(split[1]);
        }
    }
}
