package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P36_Podsumowanie_Zadan_z_Bartkiem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_Exe1 {
    public static void main(String[] args) {

        Path rootPath = Paths.get("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P36_Podsumowanie_Zadan_z_Bartkiem");
        String extention = "txt";

        printSpecificpath(rootPath, extention);
    }

    private static void printSpecificpath(Path rootPath, String extension) {
        if (extension == null || !Files.exists(rootPath)) {
            throw new RuntimeException("Extension is null");
        } else {

            try {
                Files.list(rootPath).forEach(path -> heldlePath(path, extension));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void heldlePath(Path path, String extension) {
        if (Files.isDirectory(path)) {
            printSpecificpath(path, extension);
        } else if (Files.isRegularFile(path) && isFileSpecificExtension(extension, path)) {
            System.out.println(path.toAbsolutePath());
        }
    }

    private static boolean isFileSpecificExtension(String extension, Path path) {
        String[] split = path.getFileName().toString().split("\\.");

        if (split.length != 2) {
            return false;
        } else {
            return extension.equals(split[1]);
        }
    }
}
