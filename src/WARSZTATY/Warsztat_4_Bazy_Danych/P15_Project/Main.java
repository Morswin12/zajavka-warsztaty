package WARSZTATY.Warsztat_4_Bazy_Danych.P15_Project;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringCommands = List.of(
                "DELETE ALL",
                "CREATE;NAME=TASK1;DESCRIPTION=SOME DESCRIPTION1;DEADLINE=11.02.2021 20:10;PRIORITY=0",
                "CREATE;NAME=TASK2;DESCRIPTION=SOME DESCRIPTION2;DEADLINE=12.02.2021 20:10;PRIORITY=1",
                "CREATE;NAME=TASK3;DESCRIPTION=SOME DESCRIPTION3;DEADLINE=12.02.2021 20:10;PRIORITY=2",
                "CREATE;NAME=TASK4;DESCRIPTION=SOME DESCRIPTION4;DEADLINE=14.02.2021 20:10;PRIORITY=3",
                "CREATE;NAME=TASK5;DESCRIPTION=SOME DESCRIPTION5;DEADLINE=14.02.2021 20:10;PRIORITY=4",
//                "UPDATE;NAME=TASK3;DESCRIPTION=SOME NEW DESCRIPTION;DEADLINE=14.02.2021 20:10;PRIORITY=10",
//                "READ;NAME=TASK1",
//                "READ ALL;SORT=PRIORITY,DESC",
//                "DELETE;NAME=TASK4",
//                "READ ALL;"
//                "DELETE ALL;"
                "READ GROUPED"
        );

        CommandBuilder commandBuilder = new CommandBuilder();

        List<Command> commands = stringCommands.stream()
//                .map(command -> commandBuilder.buildCommand(command));
                .map(commandBuilder::buildCommand)
//                .filter(command -> command.isPresent())
                .filter(Optional::isPresent)
//                .map(command -> command.get())
                .map(Optional::get)
                .collect(Collectors.toList());

        DatabaseRunner databaseRunner = new DatabaseRunner();
        commands.forEach(command -> databaseRunner.run(command));
        commands.forEach(databaseRunner::run);

//        commands.forEach(System.out::println);

//        String address = "jdbc:postgresql://localhost:5432/todo_list";
//
//        String query1 = "SELECT * FROM TODO;";
//        String dbUsername = "postgres";
//        String dbPassword = "postgres";
//
//        try (
//                Connection connection = DriverManager.getConnection(address, dbUsername, dbPassword);
//                PreparedStatement preparedStatement = connection.prepareStatement(query1);
//
//                ) {
//
//        } catch (SQLException e) {
//            System.err.println("some exception: " +e.getMessage() + " SQL State: " + e.getSQLState());
//        }
    }
}
