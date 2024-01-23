package WARSZTATY.Warsztat_16_ORM_I_HIBERNATE.P_25_Querying_JPQL_Named_Query;

public class Main {
    /*
    todo
        Named queries - mechanizm pomaga w grupowaniu zapytań sql i umieszczeniu ich w jakimś jednym centralnym miejscu
            (czystrzy kod) po to żeby potem móc się do tych zapytań odwoływać na zasadzie identyfikatorów/nazw.
            Zwiększa to możliwość ich wielokrotnego wykorzystania.
            Składnia takich zapytań jest sprawdzana na etapie tworzenia SessionFactory, co powoduje, że aplikacja
            wyrzuci nam błąd już na etapie jej uruchamiania. Ma to wielkie znaczenie, gdy aplikacja taka będzie
            uruchamiana na serwerze.
                Używamy ich dzięki adnotacji @NamedQuery, która to adnotacja jest osadzana w Klasach z adnotacjami
            @Entity.
     */
}
