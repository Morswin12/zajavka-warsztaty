package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P31_Queue_PriorityQueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePiorityQoeue {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 9, 1, 5, 28, 1, 62, 2);

        Queue<Integer> priority = new PriorityQueue<>();
        for (int i : input) {
            priority.offer(i);
            System.out.println(priority);
        }

        int size = priority.size();
        for (int i = 0; i < size; i++) {
            System.out.println("priority.peek() " + priority.peek());
            System.out.println(priority);
            System.out.println("priority.poll() " + priority.poll());
            System.out.println(priority);
        }


        Queue<Dog> priority2 = new PriorityQueue<>((o1, o2) -> o1.name.compareTo(o2.name));
        priority2.offer(new Dog("Stefan"));
    }

    private static class Dog {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Dog: " + name;
        }
    }

}
