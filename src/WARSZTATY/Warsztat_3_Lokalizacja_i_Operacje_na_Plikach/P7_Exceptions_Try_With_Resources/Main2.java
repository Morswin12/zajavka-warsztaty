package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P7_Exceptions_Try_With_Resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) {
        example(Paths.get("someFile.txt"), Paths.get("someExtraNewFile.txt"));

    }

    public static void example(final Path path1, final Path path2)
        /*throws IOException - jak tego uyjemy nie musimy lapać wyjątku w catch(IOException)
    */
    {

        try (
                BufferedReader in = Files.newBufferedReader(path1);
                BufferedWriter out = Files.newBufferedWriter(path2)
        ) {
            String line = in.readLine();
            System.out.println(line);
            out.write(line + "  concrete change");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
