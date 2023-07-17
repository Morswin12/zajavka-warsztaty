package WARSZTATY.Warsztat_4_Bazy_Danych.P11_i_P12__JDBC__Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // <protokół>:<baza_danych>://<adres_bazy_danych>/<nazwa_bazy_danych>
        // jdbc:postgresql://localhost:5432/zajavka
        // jdbc:postgresql://127.0.0.1:5432/zajavka

//        Class.forName("java.sql.OracleDriver"); - jakiś stary zapis, który można spotkać sprawdzający, czy klasy sql zostały załadowane, nie jest potrzebny

        String address = "jdbc:postgresql://localhost:5432/zajavka";
        String username = "postgres";
        String password = "postgres";

        String query1 = "INSERT INTO PRODUCER (ID, PRODUCER_NAME, ADDRESS)"
                + "VALUES (6, 'Zajavka Group 6', 'Zajavkowa 15, Warszawa')";
        String query2 = "UPDATE PRODUCER SET ADDRESS = 'Nowy adres siedziby' WHERE ID = 1";
        String query3 = "DELETE FROM PRODUCER  WHERE ID IN (3, 4)";
        String query4 = "SELECT * FROM PRODUCER";

        try (
                Connection connection = DriverManager.getConnection(address, username, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query4);
        ) {

            if (resultSet.next()) {
                String producerName = resultSet.getString("producer_name");
                String producerName2 = resultSet.getString("address");
                System.out.println(producerName + ", " + producerName2);
            }

            //            boolean execute = statement.execute(query2);
//            if (execute) {
//                ResultSet resultSet = statement.getResultSet();
//            } else {
//                int updateCount = statement.getUpdateCount();
//            }
//            System.out.println(execute);
        } catch (Exception e) {
            System.err.println("Exceptionn: " + e.getMessage());


        }
    }
}


// minuta filmu nr 12 :  -> 11:38