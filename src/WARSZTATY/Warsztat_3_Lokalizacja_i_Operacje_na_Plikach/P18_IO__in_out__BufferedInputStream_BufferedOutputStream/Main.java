package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P18_IO__in_out__BufferedInputStream_BufferedOutputStream;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P18_IO__in_out__BufferedInputStream_BufferedOutputStream/24.jpg");

        File outputFile = new File("./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                "P18_IO__in_out__BufferedInputStream_BufferedOutputStream/24Copy.jpg");

//        justCopyNoBuffer(inputFile, outputFile);
        justCopyWithBuffer(inputFile, outputFile);
    }

    private static void justCopyWithBuffer(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new BufferedInputStream(new FileInputStream(inputFile));
                OutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))
        ) {
            byte[] buffer = new byte[1024];
            int length = input.read(buffer);
            System.out.printf("Start buffered reading file: [%s]  %n", inputFile);
            System.out.printf("Reading buffered values: [%s], chars: [%s], length: [%s] %n",
                    byteArrToString(buffer), toCharString(buffer), length
            );

            while (length > 0) {
                System.out.printf("Writing buffered values: [%s], chars: [%s] %n",
                        byteArrToString(buffer), toCharString(buffer)
                        );

                output.write(buffer, 0, length);
                output.flush();  // zmuszamy jave do natycmiastowego zapisy sczytanych danych do pliku

                length = input.read(buffer);
                System.out.printf("Reading buffered values: [%s], chars: [%s], length: [%s] %n",
                        byteArrToString(buffer), toCharString(buffer), length
                );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String toCharString(byte[] input) {
        char[] charArray = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            charArray[i] = (char) input[i];
        }
        return replaceNewLine(Arrays.toString(charArray));
    }

    static String byteArrToString(byte[] input) {
        return replaceNewLine(Arrays.toString(input));
    }

    private static String replaceNewLine(String input) {
        return input.replace("\n", "\\n").replace("\r", "\\r");
    }

    private static void justCopyNoBuffer(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new FileInputStream(inputFile);
                OutputStream output = new FileOutputStream(outputFile)
        ) {
            int value = input.read();
            System.out.printf("Read value: [%s], char: [%s] %n", value, (char) value);

            while (value != -1) {
                output.write(value);
                output.write(32);
                System.out.printf("Write value: [%s], char: [%s] %n", value, (char) value);
                value = input.read();
                System.out.printf("Read value: [%s], char: [%s] %n", value, (char) value);
            }
        }

    }
}
