package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String dajName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog "+ name ;
    }
}
