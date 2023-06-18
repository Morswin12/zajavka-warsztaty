package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P21_IO__in_out_PODSUMOWANIE_Reader_Writer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P21_IO__in_out_PODSUMOWANIE_Reader_Writer/copiedFile.txt");
        File outputFile = new File("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P21_IO__in_out_PODSUMOWANIE_Reader_Writer/copiedFile2.txt");

        List<String> stringListFromInput = readTheText(inputFile);

        writeToNewFile(outputFile, stringListFromInput);

    }

    private static List<String> readTheText(File inputFile) throws IOException {
        List<String> result = new ArrayList<>();
        try (
                BufferedReader inputReader = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8))
                ) {
            String readLine = inputReader.readLine();
            while (Objects.nonNull(readLine)) {
                result.add(readLine);
                readLine = inputReader.readLine();
            }
        }
                return result;
    }

    private static void writeToNewFile(File outputFile, List<String> stringListFromInput) throws IOException {
        try (
                BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))
                ) {
            for (String s : stringListFromInput) {
                outputWriter.write(s + " goro jest super programistą");
                outputWriter.newLine();
                outputWriter.flush();
            }
        }
    }
}
