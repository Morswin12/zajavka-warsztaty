package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P1_Przypomnienie_JDBC;

import java.sql.SQLException;

public class Main {

    // JDBC -> Java DataBase Connectivity
    // JDBC URL -> <protokol>:<rodzaj_bazy_danych>://<adres>/<nazwa_bazy -jest to taki adres, który pozwala nam połączyć się z bazą danych
    // np.: jdbc:postgresql://localhost:5432/zajavka

    public static void main(String[] args) throws SQLException {

/*
        String url = "np.: jdbc:postgresql://localhost:5432/zajavka";
        String user = "postgresql";
        String password = "postgresq";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        int i = statement.executeUpdate(query);
        ResultSet resultSet = statement.executeQuery(query);
        boolean execute = statement.execute(query);
*/

        /* Rodzaje zapytań SQL:
        DDL -> Data Definition Language
        DML -> Data Manipulation Language
        DQL -> Data Query Language
        DCL -> Data Control language

                            DDL             DML             DQL             DCL
        execute()           TAK,            TAK,            TAK,            TAK,
        executeUpdate()     TAK,            TAK,            NIE,            NIE,
        executeQuery()      NIE,            NIE,            TAK,            NIE,

        DDL ->  CREATE (tworzenie tabeli bazy danych),
                DROP (usuwanie tabeli BD),
                ALTER (modyfikacja struktury BD np. dodać/usunąć kolumnę),
                TRUNCATE (usunięcie wszystkich danych tabeli bez usuwania samej tabeli)
        DML ->  INSERT (wkładanie danych do BD),
                UPDATE (aktualizacja rekordów w BD),
                DELETE (usuwanie rekordów w BD)
        DQL ->  SELECT (pobieranie rekordów w BD)
        DCL ->  GRANT (nadawanie uprawnień użytkownikowi BD),
                REVOKE (usuwanie uprawnień użytkownikowi BD),


         */
    }
}
