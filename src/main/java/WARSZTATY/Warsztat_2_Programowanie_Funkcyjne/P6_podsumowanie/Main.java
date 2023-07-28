package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P6_podsumowanie;

public class Main {

    public static void main(String[] args) {
        ITraveller traveller = s -> System.out.println("I'm traveling to: " +  s);
        traveller.travel("Kielce");
    }
}
