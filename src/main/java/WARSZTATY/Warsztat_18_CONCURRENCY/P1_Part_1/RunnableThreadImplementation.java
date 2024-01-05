package WARSZTATY.Warsztat_18_CONCURRENCY.P1_Part_1;

public class RunnableThreadImplementation implements Runnable{
    @Override
    public void run() {
        System.out.println("Siemanko po raz drugi w Runnable");
        System.out.println(Thread.currentThread().getName());
    }
}
