package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P30_Queue_ArrayDeque_Stack_Zaawansowane_kolekcje;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Stos {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 9, 1, 5, 28, 1, 62, 2);

        Deque<Integer> stack = new ArrayDeque<>();
        for (Integer integer : input) {
            stack.push(integer);
            System.out.println(stack);
        }

        int size = stack.size();
        for (Integer integer : stack) {
            System.out.println("stack.peek() " + stack.peek());
            System.out.println(stack);
            System.out.println("stack.pop() " + stack.pop());
            System.out.println(stack);
        }

        System.out.println();

        Deque<Integer> stack2 = new ArrayDeque<>();
        for (Integer integer : input) {
            stack2.push(integer);
//            System.out.println(stack2);
        }

        int size2 = stack2.size();
        for (Integer integer : stack2) {
            System.out.println("stack2.peek() " + stack2.peek());
            System.out.println(stack2);
            System.out.println("stack2.poll() " + stack2.poll());
            System.out.println(stack2);
        }
    }
}
