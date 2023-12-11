package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P10_Transakcje__Zarzadzanie_programowalne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassicJdbcExample {
    private final String url = "jdbc:postgresql://localhost:5432/zajavka";
    private final String user = "postgres";
    private final String password = "postgres";

    public void classicJdbcUseExample() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        try {
            connection.setAutoCommit(false); //musimy wyłączyć Auto Commit, aby zrobić transakcję z kilkoma zapytaniami.
                                            // Po ustawieniu false wszystko, co dalej będzie traktowane jako jedna
                                            // transakcja, nie musimy nic więcej pisać, żadnego start itp.
            someMethod(); // to możemy mieć kilka zapytań
            connection.commit(); // jeśli się uda to wykona się commit
        } catch (SQLException e) {
            connection.rollback();  // jeśli się nie uda, to musimy zrobić rollback-a
        }
    }

    private void someMethod() {
//  tu jakieś zapytania bazodanowe
    }
}
