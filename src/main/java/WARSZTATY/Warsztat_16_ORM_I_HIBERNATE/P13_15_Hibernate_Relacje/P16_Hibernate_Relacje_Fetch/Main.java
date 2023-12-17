package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P13_15_Hibernate_Relacje.P16_Hibernate_Relacje_Fetch;

public class Main {
    /*
    Zjawisko lazy loadung-u -> Wcześniej widzieliśmy już, że Java Stream są lazy. Stream nie zostanie wykonany do
                momentu, gdy nie zostanie uruchomiona operacja terminująca. Przykład poniżej też służy do implementacji
                lazy loading-u. Polega w skrócie to na tym, że wyciągamy informacje/dane dopiero w momencie, kiedy
                jest ona potrzebna. Parametr fetch służy do tego, abyśmy sami zdecydowali czy dana zależność ma być
                dociągnięta jako lazy, czy w inny sposób.
                    Kiedy się to przydaje w praktyce? Tak naprawdę to mamy z tym do czynienia cały czas. Gdy kupujemy
                coś w internecie, to aplikacja nie ładuje wszystkich szczegółów każdego produktu na raz. Zaciągane są
                tylko niezbędne informacje, teksty i grafiki. Dopiero po wejściu w konkretny produkt przeglądarka
                dociąga szczegóły danego produktu. Gdyby było odwrotnie to miałoby to tragiczny wpływ na wydajność
                aplikacji. Analogicznie działa to w przypadku Hibernate. Na przykład w Costumer możemy zdecydować, czy
                adres, który jest zdefiniowany w innej tabeli/encji ma być dociągany zawsze, czy tylko gdy jest on
                wywoływany.

    Fetch -> Relacje w Bazie danych są wykorzystywane przy użyciu @Join (one-to-one, one-to-many, many-to-many). W
                momencie gdy, korzystamy z takich relacji, konfigurując mapowanie encji w Hibernate, możemy zdefiniować
                fetch. Parametr ten specyfikuje, czy mają zostać załadowane wszystkie dane dotyczące relacji od razu
                (EAGER), czy może, dopiero gdy będą one potrzebne (LAZY). W kodzie źródłowym każdej adnotacji można
                zobaczyć, czy parametr domyślny jest EAGER, czy LAZY (trzeba zwrócić uwagę, że różne adnotacje, mają to
                ustawione w różny sposób).
                    * FetchType.EAGER -> pobierz encje podrzędne w relacji wraz z pobieraniem encji rodzica. Zwalnia
                        aplikacje i wykorzystuje więcej pamięci, ale przydaje się, gdy chcemy zaznaczyć, że dane z
                        podrzędnej encji są absolutnie niezbędne do realizacji logiki biznesowej.
                    * FetchType.LAZY  -> pobierz encje podrzędne w relacji leniwie, czyli dopier wtedy, gdy są one
                        faktycznie potrzebne. Zwiększa wydajność aplikacji i ogranicza zapchanie pamięci.
     */
}
