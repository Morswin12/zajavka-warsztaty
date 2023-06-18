package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P19_IO__in_out_PODSUMOWANIE_BufferedInputStream_BufferedOutputStream;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(
                "./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P19_IO__in_out_PODSUMOWANIE_BufferedInputStream_BufferedOutputStream/" +
                        "P18_IO__in_out__BufferedInputStream_BufferedOutputStream/toRepeatFile.txt"
        );
        File outputFile = new File(
                "./src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/" +
                        "P19_IO__in_out_PODSUMOWANIE_BufferedInputStream_BufferedOutputStream/" +
                        "P18_IO__in_out__BufferedInputStream_BufferedOutputStream/copiedFile.txt"
        );
        double nano1 = LocalTime.now().getNano();
        LocalTime before = LocalTime.now();

        copyFileWithBuffered(inputFile, outputFile);

        LocalTime after = LocalTime.now();
        double nano2 = LocalTime.now().getNano();

        double i = (nano2 - nano1)/1000;
        System.out.println("Nanos: " + i);
        System.out.println("Nanos: " + Duration.between(before, after).get(ChronoUnit.NANOS)/1000000 + " ms");
    }

    private static void copyFileWithBuffered(File inputFile, File outputFile) throws IOException {
        try (
                InputStream inputBuffered = new BufferedInputStream(new FileInputStream(inputFile));
                OutputStream outputBuffered = new BufferedOutputStream(new FileOutputStream(outputFile));
        ) {

            byte[] inputBufferedArray = inputBuffered.readNBytes(16);
            System.out.printf("Reading file: [%s], chars: [%s] length: [%s] %n", Arrays.toString(inputBufferedArray),
                    Arrays.toString(bufferToChar(inputBufferedArray)), inputBufferedArray.length);

            while (inputBufferedArray.length > 0) {

                outputBuffered.write(inputBufferedArray);
                outputBuffered.flush();
                System.out.printf("Writing file: [%s], chars: [%s] inputBufferedArray.length: [%s] %n", Arrays.toString(inputBufferedArray),
                        Arrays.toString(bufferToChar(inputBufferedArray)), inputBufferedArray.length);

                inputBufferedArray = inputBuffered.readNBytes(16);
                System.out.printf("Reading file: [%s], chars: [%s] inputBufferedArray.length: [%s] %n", Arrays.toString(inputBufferedArray),
                        Arrays.toString(bufferToChar(inputBufferedArray)), inputBufferedArray.length);

            }

        }


    }

    private static char[] bufferToChar(byte[] buffer) {
        char[] bufferCopy = new char[buffer.length];
        char[] chars = new char[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            if (10 == buffer[i]) {
                bufferCopy[i] = 32;
            }
//            System.out.println(Arrays.toString(new byte[]{buffer[i]})+ "   " + Arrays.toString(new char[]{(char) buffer[i]}));
            chars[i] = (char) bufferCopy[i];
        }
        return chars;
    }
}
