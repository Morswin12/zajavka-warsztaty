package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P11_IO__in_out__Koncept_systemu_plikow;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // file          (plik)
        // directory     (katalog)
        // root          (korzeń)  C:\ w Windows lub / w Linuxie
        // file system   (odczyt plików)
        // Path         (ścieżka)
        //      Windows - /
        //      Linux   - \
        // absolute path    C:\Goro IT\ZAJAVKA\WarsztatyZajavka\WarsztatyZajavka\someNewFile.txt
        // relative path    WarsztatyZajavka\someNewFile.txt
        // znaczniki:
        //      /./././.        - w terminalu jedna kropka . to obecny folder
        //      /../../../..    - w terminalu dwie kropka .. to poprzedni folder



        System.out.println(File.separator);
        System.out.println(System.getProperty("file.separator"));


    }
}
