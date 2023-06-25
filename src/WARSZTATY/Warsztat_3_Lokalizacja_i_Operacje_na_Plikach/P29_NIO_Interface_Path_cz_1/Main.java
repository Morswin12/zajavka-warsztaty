package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P29_NIO_Interface_Path_cz_1;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        // URI-Uniform Resources Identifier
        // oznacza to, że na początku musimy napisać jakiego typu zasobów dotyczy ścieżka:
        // np: https://...
        // file://...

        examplesUsedPath();

        examplesUsingURIWithPath();

        exampleUsingFileSysytem();


    }

    private static void exampleUsingFileSysytem() {
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath(".src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P29_NIO_Interface_Path_cz_1/newFile.txt");
        System.out.println(fileSystem);
        System.out.println(path);
    }

    private static void examplesUsingURIWithPath() {
        try {
//            URI uri1 = new URI("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P29_NIO_Interface_Path_cz_1/newFile.txt");
//            Path path1 = Paths.get(uri1);
            URI uri2 = new URI("file://src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P29_NIO_Interface_Path_cz_1/newFile.txt");
            Path path2 = Paths.get(uri2);

            File file = path2.toFile();
            Path path = file.toPath();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void examplesUsedPath() {
        Path path = Paths.get(".src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P29_NIO_Interface_Path_cz_1/newFile.txt");
        System.out.println("path: " + path);
        System.out.println("Files.exists(path): " + Files.exists(path));
        Path path2 = Paths.get(".src","WARSZTATY","Warsztat_3_Lokalizacja_i_Operacje_na_Plikach","P29_NIO_Interface_Path_cz_1","newFile.txt");
        System.out.println("path2: " + path2);
    }
}
