package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P24_OBSERVER;

public class Main {
    public static void main(String[] args) {
        // Observer:
        // 1. Observer
        // 2. Observable, Subject

        NewsTopic subject = new NewsTopic();

        Observer observer1 = new NewSubscriber("goro");
        Observer observer2 = new NewSubscriber("kmieciu");
        Observer observer3 = new NewSubscriber("adasz");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.setNews("Some new news!!");
        subject.unregister(observer2);
        subject.setNews(null);


        // Lambda:

        NewsTopic subject2 = new NewsTopic();

        Observer observer4 = news -> System.out.printf("Message: %s%n", news);
        Observer observer5 = news -> System.out.printf("Message: %s%n", news);
        Observer observer6 = news -> System.out.printf("Message: %s%n", news);

        subject2.register(observer4);
        subject2.register(observer5);
        subject2.register(observer6);

        subject2.setNews("Ja prdle");

    }
}
