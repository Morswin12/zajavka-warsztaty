package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P13_IO__in_out__Podsumowanie;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("zajavka.txt");
        System.out.println("File: " + file);
        System.out.println("File exist: " + file.exists());
        try {
            System.out.println("File createNewFile(): " + file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File getParent: " + file.getParent());
        System.out.println("File canWrite(): " + file.canWrite());
        System.out.println("File isFile(): " + file.isFile());
        System.out.println("File isDirectory(): " + file.isDirectory());
        System.out.println("File listFiles(): " + Arrays.toString(file.listFiles()));
        System.out.println("File length(): " + file.length());

        File file1 = new File("src/Warsztaty");

        System.out.println("file1 length(): " + file1.length());
        System.out.println("file1 listFiles(): " + Arrays.toString(file1.listFiles()));

        File file2 = new File("someFolder/secondFolder/thirdFolder");
        System.out.println("file2.mkdir() : " + file2.mkdir());
        System.out.println("file2.mkdirs() : " + file2.mkdirs());
    }

}
