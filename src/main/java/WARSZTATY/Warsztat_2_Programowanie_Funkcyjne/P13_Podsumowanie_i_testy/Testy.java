package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P13_Podsumowanie_i_testy;

import java.util.function.Function;

public class Testy {
    public static void main(String[] args) {
        quizQuestion();
    }

    private static void quizQuestion() {
//        Function<String, Integer> someReplaced1 = Testy::someMethod1;
        Function<String, Integer> someReplaced2 = Testy::someMethod2;
        System.out.println(someReplaced2);
//        Function<String, Integer> someReplaced3 = Testy::new someMethod2();
    }

    private static void someMethod1(String s, Integer i) {
        System.out.println(s + i);
    }

    private static Integer someMethod2(String s) {
        return s.length();
    }
}
