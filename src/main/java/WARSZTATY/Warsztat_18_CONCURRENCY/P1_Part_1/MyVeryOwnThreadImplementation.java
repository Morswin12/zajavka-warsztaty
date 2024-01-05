package WARSZTATY.Warsztat_18_CONCURRENCY.P1_Part_1;

public class MyVeryOwnThreadImplementation extends Thread {
    @Override
    public void run() {
        System.out.println("Siemanko MyVeryOwnThreadImplementation");
        System.out.println(Thread.currentThread().getName());
    }
}
