package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P7_Exceptions_Try_With_Resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {
    public static void main(String[] args) throws IOException {
        example(Paths.get("someFile1.txt"), Paths.get("someXXExtraNewFile.txt"));

    }

    public static void example(final Path path1, final Path path2) throws IOException {

        try (
                BufferedReader in = Files.newBufferedReader(path1);
                BufferedWriter out = Files.newBufferedWriter(path2)
        ) {
            String line = in.readLine();
            System.out.println(line);
            out.write(line + "  bez catcha dzięki try with resourches");
        }
    }
}
