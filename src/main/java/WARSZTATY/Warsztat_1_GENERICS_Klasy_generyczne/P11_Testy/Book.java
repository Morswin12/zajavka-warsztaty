package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P11_Testy;

public class Book<AUTHOR> {
    AUTHOR author;

    public Book(AUTHOR author) {
        this.author = author;
    }

    public static void main(String[] args) {
        System.out.print(new Book("Prus").get());
        System.out.print(new Book<String>("Mickiewicz").get());
        System.out.print(new Book<>("Sienkiewicz").get());
    }

    public String get() {
        return author.toString();
    }
}
