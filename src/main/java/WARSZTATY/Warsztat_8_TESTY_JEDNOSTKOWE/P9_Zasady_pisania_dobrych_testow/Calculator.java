package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P9_Zasady_pisania_dobrych_testow;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Calculator {
    private final IAnotherCalculator anotherCalculator;

    public int add(int a, int b) {
        int result = anotherCalculator.run();
        return a + b + result;
    }

}
