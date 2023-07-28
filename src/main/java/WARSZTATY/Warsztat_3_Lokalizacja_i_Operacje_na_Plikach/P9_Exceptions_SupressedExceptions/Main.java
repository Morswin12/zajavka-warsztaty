package WARSZTATY.Warsztat_3_Lokalizacja_i_Operacje_na_Plikach.P9_Exceptions_SupressedExceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (Door door = new Door()
        ) {
//            throw new RuntimeException("Exception during opening the door!");
//            System.out.println("Opening the door");
        } catch (Exception e) {
            System.out.println("Normal exception: " + e.getMessage());
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
            e.printStackTrace();
        } finally {
            System.out.println("Calling finally");
//            throw new RuntimeException("Exception in finally!");
        }
    }

    static class Door implements AutoCloseable {

        public Door() {
            System.out.println("Calling door constructor. ");
        }

        @Override
        public void close() throws IOException {
            System.out.println("Calling close!");
//            throw new RuntimeException("Some goro exception occured during close()");
        }
    }
}
