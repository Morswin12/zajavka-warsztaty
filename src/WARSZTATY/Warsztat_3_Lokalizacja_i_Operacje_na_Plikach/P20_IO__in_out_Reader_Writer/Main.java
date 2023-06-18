package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P20_IO__in_out_Reader_Writer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File inputFile = new File(
                "./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P20_IO__in_out_Reader_Writer/toRepeatFile.txt"
        );
        File outputFile = new File(
                "./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P20_IO__in_out_Reader_Writer/copiedFile.txt"
        );

        List<String> fileReader = readFile(inputFile);
//        System.out.println(fileReader);
fileReader.forEach(l-> System.out.println(l));
        writeALineByLine(outputFile, fileReader);
    }

    private static List<String> readFile(final File inputFile) throws IOException {
        List<String> newListResult = new ArrayList<>();
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
        ) {
            String line = reader.readLine();
//            System.out.println(line);
            int counter = 0;
            while (line != null) {
                counter++;
                newListResult.add( counter + "  " + line);
                line = reader.readLine();
            }
        }
        return newListResult;
    }

    private static void writeALineByLine(File outputFile, List<String> fileReader) throws IOException {

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8, true))

                ) {
            for (String line : fileReader) {
                writer.write(line);
                writer.flush();
                writer.newLine();
            }
        }

    }
}
