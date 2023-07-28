package WARSZTATY.Warsztat_4_Bazy_Danych.P13_JDBC___Prepared_Statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {

        // długie ->  3  3  - 6  (6)
        // skośne ->  4  5  - 9  (9)
        // krótkie -> 2  2  - 4  (6)
//        String address = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String address = "jdbc:postgresql://localhost:5432/zajavka";
        String dbUsername = "postgres";
        String dbPassword = "postgres";

//        String username = "jczajkowski22";
        String username = "ntinner27";
        // SQL Injection
//        String username = "whatewer' or 1=1 or USER_NAME = 'whateverAgain";  - wywołanie tego przy zwykłym Statement
//                                                    spowoduje usunięcie wszyctkich użytkowników i danych

        String query1 = "DELETE FROM OPINION WHERE CUSTOMER_ID IN (SELECT ID FROM CUSTOMER WHERE USER_NAME = ?);";
        String query2 = "DELETE FROM PURCHASE WHERE CUSTOMER_ID IN (SELECT ID FROM CUSTOMER WHERE USER_NAME = ?);";
        String query3 = "DELETE FROM CUSTOMER WHERE USER_NAME = ?;";

        try (
                Connection connection = DriverManager.getConnection(address, dbUsername, dbPassword);
//                Statement statement = connection.createStatement();
                PreparedStatement statement1 = connection.prepareStatement(query1);
                PreparedStatement statement2 = connection.prepareStatement(query2);
                PreparedStatement statement3 = connection.prepareStatement(query3);
        ) {
            statement1.setString(1, username);
            int count1 = statement1.executeUpdate();
            System.out.println("Changed " + count1 + " rows.");

            statement2.setString(1, username);
            int count2 = statement2.executeUpdate();
            System.out.println("Changed " + count2 + " rows.");

            statement3.setString(1, username);
            int count3 = statement3.executeUpdate();
            System.out.println("Changed " + count3 + " rows.");
        } catch (Exception e) {
            System.err.println(e.getMessage() + " o w dupe");
            ;
        }
    }
}
