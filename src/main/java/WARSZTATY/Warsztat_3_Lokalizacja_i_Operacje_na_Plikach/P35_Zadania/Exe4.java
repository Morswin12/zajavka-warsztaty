package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P35_Zadania;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class Exe4 {
    public static void main(String[] args) {
        Path path = Paths.get(".");
//        String extension = "txt";
        FileTime[] fileTimeArray = new FileTime[2];
        Path[] pathsArray = new Path[2];
        pathsArray[0] = null;
        pathsArray[1] = null;
        fileTimeArray[0]= FileTime.from(0, TimeUnit.HOURS);
        fileTimeArray[1]= FileTime.from(10000000, TimeUnit.HOURS);
        try {
            Files.walk(path)
                    .filter(Files::isRegularFile)
                    .forEach(file -> addToArray(file, fileTimeArray, pathsArray));
            System.out.println("File which was modified last time is: " + pathsArray[0].getFileName()
                    + "\nDate of modification is: " + fileTimeArray[0]
            + "\nAbsolute path is: " + pathsArray[0].toAbsolutePath());
            System.out.println("File which was modified oldest time is: " + pathsArray[1].getFileName()
                    + "\nDate of modification is: " + fileTimeArray[1]
            + "\nAbsolute path is: " + pathsArray[1].toAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void addToArray(Path file, FileTime[] fileTimes, Path[] pathsArray) {
        try {
            FileTime lastModifiedTime = Files.getLastModifiedTime(file);
            if (lastModifiedTime.compareTo(fileTimes[0])>0) {
                fileTimes[0] = lastModifiedTime;
                pathsArray[0] = file;
            }
            if (lastModifiedTime.compareTo(fileTimes[0]) < 0) {
                fileTimes[1] = lastModifiedTime;
                pathsArray[1] = file;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}