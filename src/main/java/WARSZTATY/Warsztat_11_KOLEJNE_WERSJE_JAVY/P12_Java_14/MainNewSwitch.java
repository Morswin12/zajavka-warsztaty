package WARSZTATY.Warsztat_11_KOLEJNE_WERSJE_JAVY.P12_Java_14;

import java.util.Map;
import java.util.function.Function;

public class MainNewSwitch {
    public static void main(String[] args) {
        // nowy switch
        //  -> nie trzeba używać break
        //  -> now instrukcja yield
        //  -> przy jednym case możemy definiować więcej stałych
        //  -> wyrażenie default przestało byc obowiązkowe, ale jest obowązkowe rzy
        //  -> zapis przypominający lambdę

        oldSwitch("A");
        oldSwitch("E");
        oldSwitch("G");

        newSwitch1("A");
        newSwitch1("E");
        newSwitch1("G");

        newSwitch2("A");
        newSwitch2("E");
        newSwitch2("G");

        Map<String, Function<Integer, String>> map = Map.of(
                "A", (Integer value) ->  value.toString(),
                "B", (Integer value) ->  value.toString()
        );
        map.get("A").apply(3);
    }

    private static void oldSwitch(String input) {
        int result = 0;
        switch (input) {
            case "A":
            case "B":
            case "C":
                result = 1;
                break;
            case "D":
            case "E":
            case "F":
                result = 2;
                break;
        }
        System.out.println("Your input is: " + input + ", old switch: " + result);
    }

    private static void newSwitch1(String input) {
        int result = switch (input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> 0;
        };
        System.out.println("Your input is: " + input + ", new switch: " + result);
    }

    private static void newSwitch2(String input) {
        int result = switch (input) {
            case "A", "B", "C":
                yield 1;
            case "D", "E", "F":
                yield 2;
            default:
                yield 0;
        };
        System.out.println("Your input is: " + input + ", new switch: " + result);
    }

    private static void newSwitchMix(String input) {
        int result = switch (input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> {
                if (input.length() < 10) {
                    yield 100;
                } else {
                    yield 300;
                }
            }

        };
        System.out.println("Your input is: " + input + ", new switch: " + result);
    }
}
