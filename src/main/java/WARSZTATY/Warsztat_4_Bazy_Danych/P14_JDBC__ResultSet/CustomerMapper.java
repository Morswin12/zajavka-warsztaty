package WARSZTATY.Warsztat_4_Bazy_Danych.P14_JDBC__ResultSet;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {

//    static List<Customer> mapToCostumers(ResultSet resultSet) {
//        List<Customer> result = new ArrayList<>();
//        try {
//            while (resultSet.next()) {
//                result.add(new Customer(
//                        resultSet.getString("id"),
//                        resultSet.getString("user_name"),
//                        resultSet.getString("email"),
//                        resultSet.getString("name"),
//                        resultSet.getString("surname"),
//                        LocalDate.parse(resultSet.getString("date_of_birth")),
//                        resultSet.getString("telephone_number")
//
//                ));
//            }
//        } catch (Exception e) {
//            System.err.println("Duży błąd kolego: Error while mapping resultSet to list:  " + e.getMessage() );
//        }
//
//        return result;
//    }

    static List<Customer> mapToCostumers(ResultSet resultSet) {
        List<Customer> result = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Object column1 = resultSet.getObject(1);
                if (column1 instanceof Integer) {
                    Integer col1Int = (Integer) column1;
                    System.out.println(col1Int);
                }
                if (column1 instanceof String) {
                    String col1Str = (String) column1;
                    System.out.println(col1Str);
                }
                result.add(new Customer(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getDate(6).toLocalDate(),
                        resultSet.getString(7)

                ));
            }
        } catch (Exception e) {
            System.err.println("Duży błąd kolego: Error while mapping resultSet to list:  " + e.getMessage() );
        }

        return result;
    }
}
