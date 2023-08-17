package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D1_DESIGN_PRINCIPLES.P4_do_P9_SOLID;

public class Main {
    public static void main(String[] args) {
        /*
        S -> (SRP) Single Responsibility Principle
        O -> (OCP) Open/Closed
        L -> (LSP) Liskov Substitution Principle
        I -> (ISP) Interface Segregation Principle
        D -> (DIP) Dependency Inversion Principle

        SOLID -> zestaw pięciu zasad:
        S -> (SRP) Single Responsibility Principle -> A class should have only onr reason to change.
                - Zasada pojedynczej odpowiedzialności Klas. Każda klasa powinna być odpowiedzialna tylko za jedną
                    rzecz/kwestie. Po to, żebyśmy mieli tylko jeden powód, aby coś w tej klasie zmieniać. Np. za
                    drukowanie czegoś, za łączenie się z BD, za obliczanie czegoś, za przygotowanie/odczyt jakichś
                    danych, wypisanie czegoś na ekranie/do pliku, itp.
                    Nazwa klasy powinna jednoznacznie określać co dana klasa robi, dzięki temu łatwiej jest nam czytać
                    kod oraz szukać konkretnej klasy/funkcjonalności
                                                                            ^
                    Modularność -> określenie dotyczące tej zasady powyżej _|

        O -> (OCP) Open/Closed Principle -> Klasy/metody powinny być otwarte na rozszerzanie/rozszerzenia, ale
                    zamknięte na modyfikacje. Oznacza to, że powinniśmy dodawać swobodnie nowe możliwości i
                    funkcjonalności, ale nie powinniśmy zmieniać/usuwać funkcjonalności starych (podobnie jak robi to
                    Java, która jest kompatybilna wstecznie). Przydaje się to choćby przy tworzeniu bibliotek.

                    P. S.:
                    W praktyce można jeszcze dodać, że jeśli robimy zależności klas, to lepiej jest zrobić to przy
                    wykorzystaniu Interfejsów, w takiej sytuacji możemy zmienić całą klasę implementującą ten interfejs,
                    a zależność nadal będzie działać, bo w nowe klasie implementującej interfejs musimy stworzyć
                    wymagane metody.

                    P. S. 2:
                    Jeśli już musimy zmodyfikować jakąś klasę/metodę/moduł na już działającej aplikacji, to po
                    wprowadzeniu zmian, musimy wykonać 'TESTY REGRESJI', czyli jeszcze raz wszystko przetestować, aby
                    sprawdzić, czy nasze zmiany nie zepsuły czegoś innego.

        L -> (LSP) Liskov Substitution Principle -> Od Barbary Liskov Oznacza to, że jeśli operujemy na klasach bazowych
                    i potem z tych klas dziedziczymy to klasy pochodne (dziedziczące) powinny być w stanie zastępować
                    swoje klasy bazowe bez zmiany zachowania kodu.

        I -> (ISP) Interface Segregation Principle -> Zasada Segregacji Interfejsów. Polega to na tym, że Klasy
                    implementujące Interfejs nie powinny "być zmuszane" do implementowania metod, których nie
                    potrzebują. W związku z powyższym Interfejs powinien posiadać minimum niezbędnych metod, które są
                    wymagane we wszystkich klasach implementujących Interfejs.

        D -> (DIP) Dependency Inversion Principle ->
                    High-level modules should not import anything from low-level modules.
                    Both should depend on abstraction (e.g., interfaces).

                    Abstraction should not depend on details.
                    Details (concrete implementations) should depend on abstractions.

                    Oznacza to, że gdy klasy są zależne od siebie (zależność HAS-A, ale nie dziedziczą po sobie) to,
                    zamiast Klas powinniśmy użyć Interfejsów. Dzięki temu możemy później użyć wszystkich klasy, które
                    implementują dany Interfejs. Daje nam to dużo większą elastyczność działania.

        Rozszerzenie do SOLID-a:

        IoC -> Inversion of Control  (odwrócenie kontroli)
        DI  -> Dependency Injection  (wstrzyknięcie dependencji) jest to niejako implementacja IoC
        IoC Container -> rodzaj Framework-a, który będzie w sposób automatyczny implementował DI (Dependency Injection).
                    To znaczy, że taki Framework byłby odpowiedzialny za zarządzanie i wstrzykiwanie tych obiektów
                    zależnie od siebie. Czyli nie musielibyśmy tworzyć takiej klasy jak Factory i tworzyć tego
                    wszystkiego ręcznie. Będzie to poruszane np. w Spring-u.
        */
    }
}
