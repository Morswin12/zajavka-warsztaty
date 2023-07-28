package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P7_Exceptions_Try_With_Resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        example(Paths.get("someFile1.txt"), Paths.get("someNewFile.txt"));

    }

    public static void example(final Path path1, final Path path2) {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            String line = in.readLine();
            out.write(line + "  changed");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
