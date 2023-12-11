package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P3_Bazy_Danych_Transakcje;

public class Main {
    public static void main(String[] args) {
        // Transaction -> jednostkowa zmiana w BD. Pojedyncza operacja logiczna, która zmienia stan bazy danych z
        //                  jednego spójnego na inny spójny. Jest to transakcja atomowa, czyli niepodzielna. W
        //                  obrębie jednej transakcji może być wykonane wiele zapytań/operacji bazodanowych

        // ACID zasady, które muszą spełnić transakcje:
        //      A -> Atomicity (Niepodzielność), każda transakcja jest traktowana jako pojedyncza jednostka pracy, albo
        //          wykona się całkowicie, albo się nie wykona wcale, czyli albo wykonają się wszystkie zapytanie SQL,
        //          albo żadne. Jeśli któreś z zapytań w jednej transakcji się nie wykona to baza danych pozostanie
        //          bez zmian;
        //      C -> Consistency (Spójność), każda transakcja musi zmienić dane, których dotyczy tylko w dozwolony
        //          sposób. Muszą być zachowane wszystkie konstejny, klucze, itp.. Inaczej rozumiejąc po pomyślnej
        //          aktualizacji lub zapisie rekordu każdy odczyt otrzyma najnowsza wartość tego rekordu;
        //      I -> Isolation (Izolacja), określa, w jaki sposób transakcje są widoczne dla siebie nawzajem. Określa,
        //          w jaki sposób użytkownicy widzą wzajemnie zmiany, które wprowadzali w tej aplikacji. Możemy
        //          wyróżnić poziomy izolacji transakcji, które określają jak transakcje widzę zmiany, które są przez
        //          nie wprowadzane. Kiedy transakcje A będą widoczne przez transakcję B. Im wyższe, tym
        //          bezpieczniejsze;
        //      D -> Durability (Trwałość), gwarantuje, że zmiany, które zostały pozytywnie zacomitowane w obrębie
        //          transakcji, nie mogą już z tej bazy danych zostać wycofane, nawet w przypadku awarii systemu;

    }
}
