package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P1_ORM_intro;

public class Main {
    // OOP (Object-Oriented Programing) - Podejście do definiowania programów za pomocą obiektów odzwierciedlających
    //              rzeczywistość. Podejście to jest związane z: Hermetyzacją, polimorfizmem, abstrakcją, dziedziczenie

    // ORM (Object-Relational Mapping) - Mapowanie Obiektowo relacyjne, czyli jak wpakować obiekt do relacyjnej
    //          bazy danych i z powrotem. Nie jest t takie łatwe, bo koncept obiektów i relacyjnych baz danych to dwa
    //          różne światy, które nie zawsze można odwzorować jeden do jednego. Pojęcie ORM nie dotyczy tylko Javy,
    //          ale ogólnie obiektowego podejścia w programowaniu.
    //      Zalety:
    //          - Zmniejsza ilość kodu i przyspiesza proces tworzenia oprogramowania;
    //          - Pomaga spełniać zasadę DRY eliminując potrzebę powtarzania SQL;
    //          - Zwiększa bezpieczeństwo, utrudniając przeprowadzenie SQL Injection;
    //          - Pozwala zmianę bazę danych bez dokonywania zmian w kodzie (w teorii);
    //          - Robi wiele za nas - np. wie, jak przygotować SQL pod konkretną bazę danych.
    //      Wady:
    //          - Gorsza wydajność dla skomplikowanych zapytań- wymaga pracy nad konkretnymi przypadkami, żeby tę
    //            wydajność poprawić;
    //          - Robi wiele za nas- programista traci kontrolę nad tym, co sie dzieje, co często prowadzi do trudnych
    //            do znalezienia błędów. Inaczej takie zjawisko w pracy nazywa się "magia";
    //      Przykłady ORM-ów:
    //          - Java -> EclipseLink, TopLink, Hibernate;
    //          - .NET -> Entity Framework, NHibernate;
    //          - Python -> SQLAlchemy, Django ORM;
    //          - PHP -> Doctrine, Propel;.

    // Entity (Encja) -> Stwierdzenie encja będzie używane w odniesieniu do POJO (Plane Old Java Object), które będzie
    //          używane do mapowania klas Javy na bazę danych. Czyli inaczej mówiąc, jeżeli mówimy encja, to mamy na
    //          myśli klasę, która będzie używana w takim mapowaniu między Javą a bazą danych. Jeszcze inaczej można
    //          powiedzieć, że encje to są takie specjalne POJO, które odzwierciedlają tabele w relacyjnej bazie danych.


    // JPA
    // Hibernate

    public static void main(String[] args) {

    }
}
