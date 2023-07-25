package WARSZTATY.Warsztat_4_Bazy_Danych.P15_Project;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommandBuilder {
    Optional<Command> buildCommand(final String line) {
        String[] split = line.split(";");
        String commandType = split[0];
        if (!Command.Type.valuesAsList().contains(commandType)) {
            System.err.printf("User prowide unknown command: [%s]%n ", commandType );
            return Optional.empty();
        }

        List<String> stringCommandWithParamsExtracted = Arrays.asList(split).subList(1, split.length);
        var parameterMap = stringCommandWithParamsExtracted.stream()
                .map(item -> item.split("="))
                .filter(paramSplit -> !ToDoItem.Field.SORT.name().equals(paramSplit[0])) // filtrowanie, żeby nie uwzględniał to SORT-a
                .collect(Collectors.toMap(
                        itemSplit -> itemSplit[0],
                        itemSplit -> itemSplit[1]
                ));

        Optional<String[]> sorting = stringCommandWithParamsExtracted.stream()
                .map(item -> item.split("="))
                .filter(paramSplit -> ToDoItem.Field.SORT.name().equals(paramSplit[0])) // filtrowanie, żeby uwzględniał tylko SORT-a
                .findAny();

        ///////////////////////////////
        // minuta 13:12 filmu
        //////////////////////////////


        ToDoItem toDoItem = buildToDoItem(parameterMap);
        return Optional.of(new Command(Command.Type.from(commandType),toDoItem, null, null));
    }

    private ToDoItem buildToDoItem(final Map<String, String> parametersMap) {
        ToDoItem toDoItem = new ToDoItem();
        Optional.ofNullable(parametersMap.get(ToDoItem.Field.NAME.name()))
                .ifPresent(toDoItem::setName);
        Optional.ofNullable(parametersMap.get(ToDoItem.Field.DESCRIPTION.name()))
                .ifPresent(toDoItem::setDescription);
        Optional.ofNullable(parametersMap.get(ToDoItem.Field.DEADLINE.name()))
                .ifPresent(deadline -> toDoItem.setDeadline(LocalDateTime.parse(deadline, ToDoItem.DATE_FORMAT)));
        Optional.ofNullable(parametersMap.get(ToDoItem.Field.PRIORITY.name()))
                .ifPresent(priority -> toDoItem.setPriority(Integer.valueOf(priority)));

        return toDoItem;
    }
}
