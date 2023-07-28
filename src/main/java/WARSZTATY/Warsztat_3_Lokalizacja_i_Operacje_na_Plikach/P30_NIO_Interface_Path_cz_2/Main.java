package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P30_NIO_Interface_Path_cz_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        // URI  -  Uniform Resource Identifier
        Path path = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P30_NIO_Interface_Path_cz_2/someFile.txt");
        Path path3 = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P30_NIO_Interface_Path_cz_2/someFile.txt");
        Path path1 = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P30_NIO_Interface_Path_cz_2/oneDirectory/someFile1.txt").toAbsolutePath();
        Path path2 = Paths.get("src/WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P30_NIO_Interface_Path_cz_2/twoDirectory/someFile2.txt").toAbsolutePath();

        // toString
        String toString = path.toString();
        System.out.println("toString():   " + toString);

        // getNameCount()  - podaje ilość elementów w ścierzce
        int nameCount = path.getNameCount();
        System.out.println("getNameCount():   " + nameCount);

        // getName(index) - podaje nazwę katalogu o podanym indeksie od początku gdzie 0 jest perwszym katalogiem
        Path getPath = path.getName(0);
        System.out.println("getName(0):   " + getPath);
        Path getPath2 = path.getName(nameCount - 1);
        System.out.println("getName(4):   " + getPath2);
//        Path getPath3 = path.getName(7);
//        System.out.println(getPath3);

        // getFileName() - podaje nazwę katalogu lub pliku ostatniego na ścieżce
        Path getFileName = path.getFileName();
        System.out.println("getFileName():   " + getFileName);

        // toAbsolutePath()  - podaje ścieżkę absoutną od roota
        Path toAbsolutePath = path.toAbsolutePath();
        System.out.println("toAbsolutePath():  " + toAbsolutePath);

        // isAbsolute() - sprawdza czy jest absolutna
        boolean absolute = path.isAbsolute();
        System.out.println("isAbsolute():  " + absolute);

        // getParent()  - podaje ścieżkę do naszego pliku, ale bez naszego pliku
        Path parent = path.getParent();
        System.out.println("getParent():   " + parent);
        Path absolutePathParent = path.toAbsolutePath().getParent();
        System.out.println("toAbsolutePath().getParent():  " + absolutePathParent);

        // getRoot()  - poda root jeśli ścieża jest absolutna lub null, jeśli nie jest
        Path root = path.getRoot();
        System.out.println("getRoot():  " + root);
        Path root2 = path.toAbsolutePath().getRoot();
        System.out.println("toAbsolutePath().getRoot():  " + root2);

        // subpath(indeks_1, index_2) - PODAJE ŚCIEŻKE OD indeks_1, do index_2 (pierwszy katalog to 0)
        Path subpath = path.subpath(1,3);
        System.out.println("subpath():  " + subpath);

        // relativize() pokazuje jak pierwszego pliku dostać się do drugiego pliku ..\..\twoDirectory\someFile2.txt
        // 2 kroki do tyłu wejść w twoDirecto ry\someFile2
        System.out.println(Files.exists(path1));
        System.out.println(Files.exists(path2));
        Path relativize = path1.relativize(path2);
        System.out.println("relativize():  " + relativize);

        // resolve() - skleja ze sobą 2 ścieżki, jeżeli nie są absolutne lub jeśli druga nie jest absolutna, jeśli są
        // absolutne lub druga jest absolutna to wydrukuje tylko drugą
        Path resolve = path.resolve(path3);
        System.out.println("resolve():  " + resolve);

        // normalize() - normalizuje ścieżkę np usuwa cofnięcie się i powrót
        Path path4 = Paths.get("src/../src/WARSZTATY/.../WARSZTATY/Warsztat_3_Lokalizacja_i_Operacje_na_Plikach/P30_NIO_Interface_Path_cz_2/someFile.txt");
        Path normalize = path.normalize();
        System.out.println("normalize():  " +path4);
        System.out.println("normalize():  " + normalize);

        // toRealPath() - sprawdza czy podana ścieżka istnieje i drukuje śceżkę absloutna, jeśli nie to rzuca wyjątek
        Path toRealPath = path.toRealPath();
        System.out.println("toRealPath():  " +path4);
        System.out.println("toRealPath():  " + toRealPath);


        // WD - Working Directory - katalog w którym jest cały nasz projekt ( w którym wykonywana jest praca)
        // dlatego nie można używać scieżek absolutnych
        Path workingDirectoryPathPoint = Paths.get(".");
        System.out.println("workingDirectoryPath: " + workingDirectoryPathPoint );
        Path pathWD = workingDirectoryPathPoint.toRealPath();
        System.out.println("workingDirectoryPath:  " + pathWD);

    }
}
