package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D1_DESIGN_PRINCIPLES.P3_Composition_Over_Inheritance;

public class Main {
    public static void main(String[] args) {
        /* composition over inheritance (Kompozycja ponad Dziedziczenie)
            - powinniśmy pisać klasy u siebie w kodzie w ten sposób, by mogły one osiągać zachowanie polimorficzne,
                a następnie powinniśmy te klasy z tymi zachowaniami polimorficznymi używać u siebie w kodzie stosując
                kompozycję

            2 typy relacji, w jakich klasy mogą się znajdować:
                - is-a  (Jabłko jest Owocem, a Pies jest Zwierzęciem, Samochód jest ŚrodkiemTransportu )
                - has-a (Jabłko ma Pestki, a Pies ma Nogi, Samochód ma Koła)

            Inheritance -> Dziedziczenie  (IS-A);
            Wady i Zalety dziedziczenia:
            Zalety:
                - utrzymujemy strukturę hierarchiczną w kodzie (rozkładamy model na "warstwy");
                - pozwala nam na re-użycie kodu, żebyśmy go nie powtarzali

            Wady:
                - Problem z Enkapsulacją, ponieważ informacje z rodzica przeciekają do Klas dziedziczących poprzez
                dziedziczenie;
                - możemy dziedziczyć tylko z jednej klasy;
                - gdy zmienimy klasę bazową możemy dodać funkcjonalności, które "przeciekną" do dziecka, a których
                dziecko nie jest w stanie obsłużyć i których nie potrzebuje;

            Composition -> Kompozycja   (HAS-A):
            Zalety:
                - Stajemy się mniej zależni od innych klas niż w przypadku dziedziczenia (np. jeśli zrobimy jakąś zmianę
                 w kole to Samochód niekoniecznie będzie o niej wiedział (w przeciwieństwie do dziedziczenia),
                 enkapsulacja nie jest złamana;
                - większa elastyczność;

            Wady:
                - wymaga większej ilości kodu do napisania niż dziedziczenie;
                - trudniejsze zrozumienie kodu z perspektywy kogoś, kto ten kod będzie czytać;

           Coupling - odnosi się to do "elastyczności i sztywności powiązań" między obiektami:
                - strongly coupling -> klasy są ze sobą powiązane mocno (dziedziczenie);
                - loosely coupling  -> klasy są luźno ze sobą powiązane (kompozycja, ale najlepiej taka, że w polu
                    jednej klasy i jest interfejs, a nie konkretna klasa, a dzięki temu możemy użyć wszystkich klas,
                    które implementują ten interfejs);


         */
    }
}
