package WARSZTATY.Warsztat_4_Bazy_Danych.P15_Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class DatabaseRunner {
    private static final String URL = "jdbc:postgresql://localhost:5432/zajavka";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private static final String SQL_INSERT = "INSERT INTO TODOLIST (NAME, DESCRIPTION, DEADLINE, PRIORITY) VALUES (?, ?, ?, ?);";
    private static final String SQL_UPDATE = "UPDATE TODOLIST SET DESCRIPTION = ?, DEADLINE = ?, PRIORITY = ? WHERE NAME =?;";
    private static final String SQL_READ_WHERE = "SELECT * FROM TODOLIST WHERE NAME = ?;";
    private static final String SQL_READ_ALL = "SELECT * FROM TODOLIST;";
    private static final String SQL_DELETE = "DELETE FROM TODOLIST WHERE NAME = ?;";
    private static final String SQL_DELETE_ALL = "DELETE FROM TODOLIST;";

    private final Map<Command.Type, Consumer<Command>> EXECUTION_MAP;

    {
        EXECUTION_MAP = Map.of(
                Command.Type.CREATE, this::runAdd,
                Command.Type.UPDATE, this::runUpdate,
                Command.Type.READ, this::runRead,
                Command.Type.READ_ALL, this::runReadAll,
                Command.Type.DELETE, this::runDelete,
                Command.Type.DELETE_ALL, this::runDeleteAll

        );
    }

    void run(final Command command) {
        System.out.println("##### RUNNING COMMANDS #####");
        Consumer<Command> commandConsumer = Optional.ofNullable(EXECUTION_MAP.get(command.getType()))
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Command: [%s] not supported %n", command.getType())));

        commandConsumer.accept(command);
        System.out.println("##### FINISHED COMMANDS #####\n");
    }

    private void runAdd(final Command command) {
        if (!Command.Type.CREATE.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)
        ) {
            preparedStatement.setString(1, command.getToDoItem().getName());
            preparedStatement.setString(2, command.getToDoItem().getDescription());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(command.getToDoItem().getDeadline()));
            preparedStatement.setInt(4, command.getToDoItem().getPriority());

            int count = preparedStatement.executeUpdate();
            System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), count);
        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }

    private void runUpdate(final Command command) {
        if (!Command.Type.UPDATE.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE)
        ) {
            preparedStatement.setString(1, command.getToDoItem().getDescription());
            preparedStatement.setTimestamp(2, Timestamp.valueOf(command.getToDoItem().getDeadline()));
            preparedStatement.setInt(3, command.getToDoItem().getPriority());
            preparedStatement.setString(4, command.getToDoItem().getName());

            int count = preparedStatement.executeUpdate();
            System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), count);
        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }

    private void runRead(final Command command) {
        if (!Command.Type.READ.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_READ_WHERE)
        ) {
            preparedStatement.setString(1, command.getToDoItem().getName());

            try (ResultSet resultSet = preparedStatement.executeQuery();
            ) {
                List<ToDoItem> readItems = mapToToDoItem(resultSet);
                print(readItems);
                System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), readItems.size());
            }

        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }

    private void runReadAll(final Command command) {
        if (!Command.Type.READ_ALL.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_READ_ALL)
        ) {

            try (ResultSet resultSet = preparedStatement.executeQuery();
            ) {
                List<ToDoItem> readItems = mapToToDoItem(resultSet);
                print(readItems);
                System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), readItems.size());
            }

        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }

    private void print(List<ToDoItem> readItems) {
        System.out.println("PRINTING TODO LIST:");
        String schema = "%-25s%-25s%-25s%-25s%n";
        System.out.printf(
                schema,
                ToDoItem.Field.NAME,
                ToDoItem.Field.DESCRIPTION.name(),
                ToDoItem.Field.DEADLINE.name(),
                ToDoItem.Field.PRIORITY.name()
        );
        readItems.forEach(entry -> System.out.printf(schema,
                entry.getName(), entry.getDescription(), entry.getDeadline(), entry.getPriority()));

    }

    private List<ToDoItem> mapToToDoItem(ResultSet resultSet) throws SQLException {
        List<ToDoItem> result = new ArrayList<>();
        while (resultSet.next()) {
            ToDoItem toDoItem = new ToDoItem();
            toDoItem.setName(resultSet.getString(ToDoItem.Field.NAME.name()));
            toDoItem.setDescription(resultSet.getString(ToDoItem.Field.DESCRIPTION.name()));
            toDoItem.setDeadline(resultSet.getTimestamp(ToDoItem.Field.DEADLINE.name()).toLocalDateTime());
            toDoItem.setPriority(resultSet.getInt(ToDoItem.Field.PRIORITY.name()));
            result.add(toDoItem);
        }

        return result;
    }

    private void runDelete(final Command command) {
        if (!Command.Type.DELETE.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE)
        ) {
            preparedStatement.setString(1, command.getToDoItem().getName());
            int count = preparedStatement.executeUpdate();
            System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), count);
        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }

    private void runDeleteAll(final Command command) {
        if (!Command.Type.DELETE_ALL.equals(command.getType())) {
            throw new IllegalArgumentException(command.getType().getName());
        }

        try (
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_ALL)
        ) {
            int count = preparedStatement.executeUpdate();
            System.out.printf("Run [%s] successfully, modified: [%s] rows %n", command.getType(), count);
        } catch (SQLException e) {
            System.err.printf("[%s] errorrrrrrrrrrr. Message: [%s] %n", command.getType(), e.getMessage());
        }
    }
}
