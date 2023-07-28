package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P36_Podsumowanie_Zadan_z_Bartkiem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main_Exe2 {
    public static void main(String[] args) {
        Path rootPath = Paths.get("src/WARSZTATY");
        List<String> prohibitedExtension = List.of(".rar", ".pdf", ".java");
        String searchingContent = "zajavka";
        try {

            Files.walk(rootPath)
                    .filter(path -> Files.isRegularFile(path))
                    .filter(path1 -> !prohibitedExtension.contains(getPathExtension(path1))).filter(Files::isRegularFile)
//                    .filter(file -> checkIfContentExistInFile(file, searchingContent))
                    .filter(path -> pathContains(searchingContent, path))
                    .forEach(file -> System.out.println(file.toAbsolutePath()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean pathContains(String searchingContent, Path path) {
        try {
            return Files.lines(path).anyMatch(line -> line.contains(searchingContent));
        } catch (IOException e) {
            System.err.println("Unable to check file content for: " + path + " and word: " + searchingContent
                    + ". Messagr: " + e.getMessage());
            return false;
        }
    }

    private static String getPathExtension(Path path) {
        String fileName = path.getFileName().toString();
        int index = fileName.lastIndexOf('.');
        if (index == -1) {
            return fileName;
        }
        return fileName.substring(index);
    }

}
