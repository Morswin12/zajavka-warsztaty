package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P30_Queue_ArrayDeque_Stack_Zaawansowane_kolekcje;

import java.util.*;

public class ExampleQueue {
    /*
    Przydatne metody z interfejsu Queue:
                                                                                                                               Kolejka  Stos
    boolean add(E e)   - dodaje element e na końcu kolejki i zwraca true albo wyrzuca wyjatek (np. bo jest za mało miejsca)    tak      nie
    E elemnet()        - Zwraca nastepny element lub rzuca wyjątek jeżeli kolejka jest pusta                                   tak      nie
    boolean offer(E e) - Dodaje element na końcu kolejki i zwraca true jesli sie udalo                                         tak      nie
    E remove()         - Usuwa i zwraca nastepny element lub rzuca wyjątek jeżeli kolejka jest pusta                           tak      nie
    void push(E e)     - Dodaje elementy na początku kolejki                                                                   tak      tak
    E poll()           - Usuwa i zwraca nastepny element lub zwraca null jeżeli kolejka jest pusta                             tak      nie
    E peek()           - Zwraca nastepny element lub zwraca null jeżeli kolejka jest pusta                                     tak      tak
    P pop()            - Usuwa i zwraca nastepny element lub rzuca wyjatek jeżeli kolejka jest pusta                           nie      tak
     */
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 9, 1, 5, 28, 1, 62, 2);

        Queue<Integer> queue = new ArrayDeque<>();

        for (Integer integer : input) {
            boolean offer = queue.offer(integer);
//            System.out.println("queue.offer: " + offer + ", add element: " + integer);
//            System.out.println(queue);
        }

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("queue.peek()"+ queue.peek());
            System.out.println(queue);
            System.out.println("queue.poll()"+ queue.poll());
            System.out.println(queue);
        }


//        Queue<Integer> queue2 = new LinkedList<>();
//        List<Integer> queue2 = new LinkedList<>();
        LinkedList<Integer> queue2 = new LinkedList<>();
//        ArrayDeque<Integer> queue2 = new ArrayDeque<>();
//        Deque<Integer> queue2 = new ArrayDeque<>();
//        Deque<Integer> queue2 = new LinkedList<>();

        System.out.println();

        for (Integer integer : input) {
            boolean offer2 = queue2.offer(integer);
//            System.out.println("queue2.offer: " + offer2 + ", add element: " + integer);
//            System.out.println(queue2);
        }

        System.out.println(queue2);
        queue2.addFirst(2345);
        System.out.println(queue2);
        queue2.addLast(222222222);
        System.out.println(queue2);

    }


}
