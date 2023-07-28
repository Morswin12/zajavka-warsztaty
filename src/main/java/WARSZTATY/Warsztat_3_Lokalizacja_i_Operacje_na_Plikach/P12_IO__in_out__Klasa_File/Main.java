package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P12_IO__in_out__Klasa_File;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("someFile1.txt");
        System.out.println(file1.exists());
        System.out.println();

//        File file2 = new File("./src/WARSZTATY/" +
//                "Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P12_IO__in_out__Klasa_File/someFile2.txt");
        File file2 = new File("./src/WARSZTATY/" +
                "Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P12_IO__in_out__Klasa_File");
        if (!file2.exists()) {
            System.out.println("File: " + file2 + " not available!");
        } else {
            System.out.println("File: " + file2 + " exist!  - " + file2.exists());
        }

        System.out.println("file2.getAbsolutePath():    " + file2.getAbsolutePath());
        System.out.println("file2.getTotalSpace():      " + file2.getTotalSpace());
        System.out.println("file2.getParent():          " + file2.getParent());

        if (file2.isFile()) {
            System.out.println("File: " + file2 + " is file ");
            System.out.println("File length(): " + file2.length());
        }

        if (file2.isDirectory()) {
            System.out.println("File: " + " is directory");
            for (File listFile : file2.listFiles()) {
                System.out.println("Subfile: " + listFile );
            }
        }
        System.out.println();

        System.out.println("file2.lastModified():  " + file2.lastModified());

        System.out.println();

        File file4 = new File("someExtraNewFile.txt");
        System.out.println(file4.renameTo(new File("gorororo.txt")));
        System.out.println("file4.delete() :  " + file4.delete());

        File file = new File("asdf/zxcv/qwer/goro.txt");
        System.out.println(file.mkdirs());
        System.out.println(file.getName());
        File file3 = new File("createdFile.txt");
        System.out.println(file3.createNewFile());

    }
}
