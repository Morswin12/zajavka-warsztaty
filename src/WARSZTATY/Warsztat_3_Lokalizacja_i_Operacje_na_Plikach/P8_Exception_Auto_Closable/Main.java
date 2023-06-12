package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P8_Exception_Auto_Closable;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        example2(Paths.get("someFile.txt"), Paths.get("someFileP8.txt"));
    }

    public static void example2(Path path1, Path path2) {
        try (Door door = new Door()
 //                String variable="abc" - możemy tu użyć tyko klasy która implementuje interfejs Auto Closable
        ) {
            System.out.println("Opening the door");
        } catch (Exception e) {
            System.out.println("Handling door exception: " + e.getMessage());
        } finally {
            System.out.println("Calling finally");
        }
    }

    static class Door implements AutoCloseable {

        public Door() {
            System.out.println("Calling door constructor. ");
        }

        @Override
        public void close() throws IOException {
            System.out.println("Calling close!");
            throw new RuntimeException("Throw exception");
        }
    }
}
