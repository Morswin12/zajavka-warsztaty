package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_22_Querying_JPQL_SELECT1;

public class Main {
    /*
    TODO
    DTO - (Data Transfer Object) spotkamy się z tym w praktyce. Są to zwykłe obiekty tak jak POJO. Są strukturami,
            które nie zawierają żadnej logiki biznesowej. Zawierają metody dostępowe służące do pobierania danych
            i służą do transportu danych. W BD klasy takie mogą być tworzone i wykorzystywane, gdy dane chcemy pobrać
            w charakterystyczny sposób ("widok"). Jest to pewna reprezentacja danych, które pobieramy z BD, ale ta
            reprezentacja jest charakterystyczna z jakiegoś powodu (np. zawiera tylko określone pola, albo jakieś
            wyliczone wartości) i może być wtedy nazywana widokiem.
                Wykorzystana u nas klasa(record) OwnerTemp jest przykładem DTO, który przedstawiał nam szczególny
            widok na dane. Widok ten przedstawiał tylko klucz główny i imię właściciela.
                Określenie DTO jest częściej używane, gdy wystawiamy własne API, żeby móc komunikować się z naszą
            aplikacją przez Internet, natomiast można też użyć tego stwierdzenia w odniesieniu do konkretnego
            spojrzenia na dane z BD.
                Jak to było pokazane dzięki HQL, możemy stworzyć taki DTO przy wykorzystaniu konstruktora w
            zapytaniu HQL. Byłoby to również potrzebne gdybyśmy np. zastosowali klauzulę GROUP BY. Wtedy musimy
            stworzyć DTO, który będzie w stanie przetransportować otrzymany wynik.
                W przypadku wystawienia swoich danych "na zewnątrz", DTO są przydatne, bo przecież nie ma potrzeby
            żebyśmy wystawiali wszystkie swoje dane "na zwenątrz" - zawsze dobrze jest takie dane ograniczyć tylko do
            absolutnie niezbędnych. Natomiast kontekst DTO został tutaj przywołany, bo można powiedzieć, że OwnerTemp
            jest DTO, bo służy do transportu danych w dalszej części aplikacji.
     */
    /*
        Ograniczanie ilości rekordów. Możemy użyć na query metod takich jak:
            -> setFirstResult(int i) -> metoda ta przyjmuje int, który odnosi sie do pierwszego wiersza w zwracanym
                    ResultSet, czyli od którego wyniku maja się nam wyświetlać wyniki. Przy czym pierwszy wiersz ma
                    wartość 0. Lub inaczej int i mówi nam ile pierwszych wierszy pominąć. np setFirstResult(2)
                    wyświetli wyniki od wiersza trzeciego lub inaczej mówiąc pominie pierwsze 2 wiersze (wyniki).
            -> setMaxResult(int i) -> metoda ta określa maksymalną ilość wierszy, które chcemy zwrócić;
       Dzięki tym metodą możemy zastosować paginację.

        Paginacja -> dzielenie rekordów na strony które możemy po koleji załadowywac, aby nie obciążać zasobów
                ograniczając pobrane dane np. do 10 pozycji, na każde jednorazowe wyświetlenie. Jak na stronach
                internetowych, gdzie po przejrzeniu 10 pozycji przechodzimy do kolejnych 10 itp. Przy paginacji zawsze
                musimy dodać sortowanie, żeby na kolejnych stronach wyniki wyświetlały sie po kolei, a nie losowo.
                Dzięki temu mamy gwarancje, że przechodząc po wszystkich stronach zobaczymy wszystkie wyniki, a w
                dodatku wyniki nie będą się powielać.
     */
}
