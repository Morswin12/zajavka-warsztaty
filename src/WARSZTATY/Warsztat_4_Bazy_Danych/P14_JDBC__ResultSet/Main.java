package WARSZTATY.Warsztat_4_Bazy_Danych.P14_JDBC__ResultSet;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String query1 = "SELECT * FROM CUSTOMER WHERE NAME LIKE ?;";
        String parametr = "%me%";

        String address = "jdbc:postgresql://localhost:5432/zajavka";
        String dbUsername = "postgres";
        String dbPassword = "postgres";

        try (
                Connection connection = DriverManager.getConnection(address, dbUsername, dbPassword);
                PreparedStatement preparedStatement = connection.prepareStatement(query1);

        ) {
            preparedStatement.setString(1, parametr);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Customer> customers = CustomerMapper.mapToCostumers(resultSet);
                customers.forEach(customer -> System.out.println("Customer: " + customer));
            }

        } catch (SQLException e) {
            System.err.printf("Motyla noga SQL State:  %s, ERRORCode: %s, Exception message: %s%n", e.getSQLState(), e.getErrorCode(), e.getMessage());
        }

    }
}

