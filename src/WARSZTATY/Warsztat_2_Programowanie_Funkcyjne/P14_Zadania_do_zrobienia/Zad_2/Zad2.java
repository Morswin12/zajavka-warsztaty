package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P14_Zadania_do_zrobienia.Zad_2;

public class Zad2 {
    public static void main(String[] args) {
        SomeFunctionalInterface<String, Integer, SomeSuperClass, Integer> someFI = (s, i, x) -> calculate(s, i, x);
        System.out.println("Długość to: " + someFI.integerResumeMethod("Goro", 24, new SomeSuperClass()));
        SomeFunctionalInterface<String, Integer, SomeSuperClass, Integer> someFI2 = (s, i, x) -> calculate2(s, i, x);
        System.out.println("Długość to: " + someFI2.integerResumeMethod("ania", 24, new SomeSuperClass()));
    }

    private static Integer calculate(String s, Integer i, SomeSuperClass x) {
        System.out.println("String: " + s + ", Integer: " + i + ", Class: " + x);
        return s.length() + i + x.toString().length();
    }
    private static Integer calculate2(String s, Integer i, SomeSuperClass x) {
        System.out.println("String: " + s + ", Integer: " + i + ", Class: " + x);
        Integer counter = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                counter++;
            }
        }
        Integer counter2 = 0;
        for (int j = 0; j < x.toString().length(); j++) {
            char c = x.toString().charAt(j);
            if (c == ',' || c == '=') {
                counter2++;
            }
        }
        return counter + i + counter2;
    }

    private static class SomeSuperClass {
        @Override
        public String toString() {
            return "SomeSuperClass={,}";
        }
    }

}
