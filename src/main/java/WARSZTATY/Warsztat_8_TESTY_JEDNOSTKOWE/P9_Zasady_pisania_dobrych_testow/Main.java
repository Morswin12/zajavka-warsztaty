package WARSZTATY.Warsztat_8_TESTY_JEDNOSTKOWE.P9_Zasady_pisania_dobrych_testow;

public class Main {
    public static void main(String[] args) {
        // Zasady pisania dobrych testów jednostkowych (powinny być szybkie proste i ograniczone do malej części kodu-klasy, metody):
        // 1. Nie używaj infrastruktury, czyli jeśli nasz fragment testowanego kodu łączy się z Bazą danych lub Jakimś innym systemem zewnętrznym to powinniśmy BD, lub ten system zaślepić;
        // 2. Testy powinny być wyizolowane, czyli np. jeśli nasza testowana klasa zależy od innych klas to te klasy powinniśmy zaślepić;
        // 3. Powinny być małe;
        // 4. Testuj nie tylko pozytywne scenariusze, ale także corner case, czyli scenariusze krytyczne. Można sprawdzić, czy wyjątek, który zostanie rzucony jest taki, jaki powinien być;
        // 5. Testy powinny być niezależne od siebie, wynik jednego testu, nie może mieć wpływy na inne testy;
        //

        Calculator calculator = new Calculator(new RealAnotherCalculator());

        int add = calculator.add(4, 9);
        System.out.println(add);
    }
}
