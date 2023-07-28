package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P35_Zadania;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exe1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/WARSZTATY");
//        System.out.println(path.toAbsolutePath());
        String ends = "java";

        File[] files = path.toFile().listFiles();
        System.out.println(Arrays.stream(files).map(p -> p.getName()).collect(Collectors.toList()));
        Map<String, String> stringStringMap = new HashMap<>();
        listOfAllFilesWithExe1(path, ends, stringStringMap);
        System.out.println(stringStringMap);

        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            System.out.println("Key: " + entry.getValue() + ", \n        Value: " + entry.getKey());
        }
    }

    private static void listOfAllFilesWithExe1(Path path, String ends, Map<String, String> map) throws IOException {

        File file = path.toFile();
        File[] files = file.listFiles();

        if (file.isFile() && file.toPath().endsWith(ends)) {
            map.put(file.getAbsolutePath(), file.getName());
//            System.out.println(file.getName()+"  "+  file.getAbsolutePath());
        } else if (files.length > 0) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    listOfAllFilesWithExe1(file1.toPath(), ends, map);
                } else {
                    if (file1.toPath().getFileName().toString().endsWith(ends)) {

                        map.put(file1.getAbsolutePath(), file1.getName());
//                    System.out.println(file1.getName()+ "  " +  file1.getAbsolutePath());
                    }
                }
            }
        }


    }

    private static void listOfAllFilesWithExe2(Path path, String ends, Map<String, String> map) throws IOException {

        File file = path.toFile();
        File[] files = file.listFiles();

        if (file.isFile() && file.toPath().endsWith("txt")) {
            map.put(file.getAbsolutePath(), file.getName());
//            System.out.println(file.getName()+"  "+  file.getAbsolutePath());
        } else if (files.length > 0) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    listOfAllFilesWithExe1(file1.toPath(), ends, map);
                } else {
                    if (file1.toPath().getFileName().toString().endsWith("txt")) {

                        map.put(file1.getAbsolutePath(), file1.getName());
//                    System.out.println(file1.getName()+ "  " +  file1.getAbsolutePath());
                    }
                }
            }
        }


    }
}
