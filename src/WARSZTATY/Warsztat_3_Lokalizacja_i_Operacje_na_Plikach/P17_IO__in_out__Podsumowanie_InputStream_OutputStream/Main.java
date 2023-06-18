package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P17_IO__in_out__Podsumowanie_InputStream_OutputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Input/OutputStream

        File inputFile = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P17_IO__in_out__Podsumowanie_InputStream_OutputStream/toRepeatFile.txt");

        File outputFile = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P17_IO__in_out__Podsumowanie_InputStream_OutputStream/outputFile.txt");

        someMethodToCopyFile(inputFile, outputFile);
    }

    private static void someMethodToCopyFile(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new FileInputStream(inputFile);
                OutputStream output = new FileOutputStream(outputFile)
        ) {
            int value = input.read();
            System.out.printf("Read value: [%s], char: [%s] %n", value, (char) value);

            while (value != -1) {
                output.write(value );
                output.write(32);
                System.out.printf("Write value: [%s], char: [%s] %n", value, (char) value);
                value = input.read();
                System.out.printf("Read value: [%s], char: [%s] %n", value, (char) value);
            }
        }

    }
}
