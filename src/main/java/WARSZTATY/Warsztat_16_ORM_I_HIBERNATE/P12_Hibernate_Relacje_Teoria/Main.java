package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P12_Hibernate_Relacje_Teoria;

public class Main {
    /*
    Relacje -> powiązania między tabelami. Rodzaje relacji:
        -> one-to-one (jeden do jednego) mówi nam, że jedna encja A może być powiązana z co najwyżej jedną encją B i
            odwrotnie. W odniesieniu do baz danych będzie to oznaczało, że rekord jednej encji (tabeli) jest powiązany
            z dokładnie jednym rekordem w innej encji (tabeli).
                Przykłady:
                - Człowiek może mieć tylko jedno serce, a serce może być tylko w jednym człowieku;
                - Kraj <-> Stolica;
                - konto użytkownika <-> Email;

               Co nie jest one-to-one:
                - Kraj (1) <-> miasto (wiele);
                - szef <-> pracownik;
                - nauczyciel matematyki <-> uczeń

        -> one-to-many (jeden do wielu) instancja A może być połączona z wieloma instancjami B, ale instancja B jest
            połączona tylko z jedną instancją A. W odniesieniu do baz danych będzie to oznaczało, że rekord w jednej
            encji (tabeli) jest powiązany z wieloma rekordami w innej encji (tabeli).
                Przykłady:
                - jedno mieszkanie może mieć wiele łazienek, ale jedna łazienka może być tylko w jednym mieszkaniu;
                - kraj (wiele miast) <->  miasto (może byc tylko w jednym kraju);
                - właściciel (może mieć wiele zwierząt) <-> zwierze (może mieć tylko jednego właściciela);

               Co nie jest one-to-many:
                - Klient może kupić wiele produktów <-> produkty mogę byc kupione przez wielu klientów;
                - książka może mieć wielu autorów <-> autor może napisać wiele książek;
                - komputer (może mieć jeden procesor) <-> procesor (jeden w jednym kompie)

        -> many-to-many (wielu do wielu) relacja między dwiema encjami A i B, w której A może być powiązana z wieloma
            wystąpieniami B i na odwrót;
                Jeżeli chodzi o stworzenie tej relacji w bazie danych, to sytuacja taka jest specyficzna. Podczas
            omawiania diagramów UML i relacji padło stwierdzenie:
            W praktyce wprowadza się klasę, która sama w sobie oznacza taką relację. Czyli możemy mieć Samochód i
            Właściciela. Właściciel może mieć wiele samochodów, a Samochód może mieć wielu właścicieli. Tworzymy klasę
            Ownership, w której określamy zależności.
                W przypadku tworzenia tabel w bazach danych, rozwiązanie relacji many-to-many może wyglądać
            analogicznie. Możemy wprowadzić wtedy trzecią tabelę, która oznacza taką relację samą w sobie;
            Na przykład w sklepie internetowym mając 2 tabele Customer i Product, powinniśmy stworzyć trzecią tabelę
            Purchase, w której będziemy mieć informacje, który klient kupił ile danego produktu.
                Przykłady:
                -> na jednej płycie DVD może być nagranych wiele filmów, a filmy mogą byc na wielu płytach;
                -> mechanik(naprawia wiele samochodów) <-> samochód(naprawiany przez wielu mechaników);
                -> nauczyciel <-> uczeń;

      oraz mogą być:
        -> jednokierunkowe (Unidirectional) -> A wie o B, ale B nie wie o A;
        -> dwukierunkowe (Bidirectional) -> A wie o B i B wie o A;

        Hibernate rekomenduje używanie relacji dwukierunkowych. Oczywiście może się zdarzyć, że domena biznesowa będzie
        od nas wymagać użycia relacji jednokierunkowej, ale w dużych aplikacjach wygodniej jest stosować relacje
        dwukierunkowe. O rodzaju relacji będzie głównie decydować domena biznesowa, jaką musimy zrealizować.
            Przykłady tych relacji w postaci tabel i encji w następnych filmach :)

     */
}
