package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P34_Testy;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.isSameFile;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/user/zajavka/super/boot/tut.txt");
        System.out.println(path.subpath(0, 4));

        FileSystems.getDefault().getPath("");

        System.out.println(Paths.get("/zaj/./../quiz", " soFi.txt").normalize());

        Path path1 = Paths.get("zaj/../cat");
        Path path2 = Paths.get("catalog2");

        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));

        Path path3 = Paths.get("src/").resolve(Paths.get("asdf.txt"));
        Path path4 = Paths.get("src/./WARSZTATY/../asdf.txt");

        Path path5 = Paths.get("src/asdf.txt");
        Path path6 = Paths.get("src/asdf.jpg");

              System.out.println(isSameFile(path3, path4));
        System.out.println(path3.equals(path4) + ",");
        System.out.println(path3.normalize().equals(path4.normalize()));
    }
}
