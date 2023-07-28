package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P16_IO__in_out_InputStream_OutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        try {
//            System.out.println(new File(
//                    "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
//                            "P16_IO__in_out_InputStream_OutputStream/someFiled2.txt")
//                    .createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        File inputFile = new File(
                "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P16_IO__in_out_InputStream_OutputStream/someFiledInput.txt");

        File outputFile = new File(
                "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P16_IO__in_out_InputStream_OutputStream/someFiledOutput.txt");

        File inputFile2 = new File(
                "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P16_IO__in_out_InputStream_OutputStream/24.jpg");

        File outputFile2 = new File(
                "src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P16_IO__in_out_InputStream_OutputStream/24_COPY.jpg");

        justCopyNotBuffer(inputFile, outputFile);

        byte[] bytes = "ą".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        System.out.println("ć: " + Arrays.toString("ć".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ę: " + Arrays.toString("ę".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ł: " + Arrays.toString("ł".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ń: " + Arrays.toString("ń".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ó: " + Arrays.toString("ó".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ś: " + Arrays.toString("ś".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ż: " + Arrays.toString("ż".getBytes(StandardCharsets.UTF_8)));
        System.out.println("ź: " + Arrays.toString("ź".getBytes(StandardCharsets.UTF_8)));

        justCopyNotBuffer(inputFile2, outputFile2);
    }

    private static void justCopyNotBuffer(File inputFile, File outputFile) throws IOException {
        try (
                InputStream input = new FileInputStream(inputFile);
                OutputStream output = new FileOutputStream(outputFile)
        ) {
            int value = input.read();
            System.out.printf("Start Reading File: [%s]%n", inputFile);
            System.out.printf("Reading value: [%s], char: [%s]%n", value, (char) value);

            while (value != -1) {
                int modified = value;
                if (modified > 65 && modified < 250) {
                    modified += 5;
                }
                System.out.printf("Writing value: [%s], char: [%s], modVal: [%s], modChar: [%s] %n",
                        value, (char) value, modified, (char) modified);
                output.write(modified);
                value = input.read();
                System.out.printf("Reading value: [%s], char: [%s]%n", value, (char) value);
            }
            //signed variables   - ze znakiem +/-
            //unsigned variables - bez znaku (liczby 0 i liczby dodatnie)
        }
    }

}
