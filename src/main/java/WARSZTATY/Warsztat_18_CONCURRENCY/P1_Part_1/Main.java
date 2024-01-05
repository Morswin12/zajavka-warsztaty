package WARSZTATY.Warsztat_18_CONCURRENCY.P1_Part_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread myVeryFirstThread = new MyVeryOwnThreadImplementation();
        myVeryFirstThread.start();
        System.out.println("Siemanko main");
        System.out.println(Thread.currentThread().getName());

        Runnable myRunnable = new RunnableThreadImplementation();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
        System.out.println(Thread.currentThread().getName());

        Thread thread3 = new Thread(() -> {
            System.out.println("Siemanko po raz trzeci w lambda");
            System.out.println(Thread.currentThread().getName());});
        thread3.start();
        System.out.println(Thread.currentThread().getName());

    }
}
