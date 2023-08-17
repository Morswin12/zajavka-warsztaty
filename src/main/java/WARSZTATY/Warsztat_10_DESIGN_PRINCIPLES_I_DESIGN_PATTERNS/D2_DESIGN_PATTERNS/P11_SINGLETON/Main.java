package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P11_SINGLETON;

public class Main {
    public static void main(String[] args) {
        /* SINGLETON:
               1. eager Singleton -> jest tworzony niezależnie czy jest potrzebny, czy też nie.
               2. lazy Singleton  -> instancja będzie utworzona, dopiero gdy będzie nam w kodzie potrzebny.
        */

        /*
            Używamy go, gdy chcemy, żeby u nas w kodzie istniała tylko jedna instancja danej klasy. Nawet jeśli
            będziemy chcieli stworzyć instancje tej klasy wielokrotnie to powinna nam zostać zwrócona istniejąca już
            instancja.
            Przykładem takiej sytuacji w życiu codziennym może być np. papież, prezydent Polski, itp.
            Jest to taki "globalny" obiekt, który występuje raz.

         Zasady:
            1. konstruktor takiej klasy powinien być prywatny;
            2. Musimy gdzieś przetrzymywać instancje, która będzie występować tylko raz:
                w zmiennej private static w tej klasie.
            3. Statyczna metoda publiczna, która będzie pozwalała nam otrzymać instancję tej klasy.
            4. klasa będzie final (aby nie móc dziedziczyć i narobić innych dziwnych rzeczy.

         Singleton, który będziemy tu tworzyć dotyczy aplikacji jednowątkowych. W przypadku wielowątkowości kilka trzeba
            będzie kilka rzeczy zmienić, aby nasz singleton był "thread safe", czyli wątkowo bezpieczny singleton.
         */

/*
        StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
        System.out.println(instance);
        instance.someStaticMethod();
*/

/*
        LazyInitializationSingleton.someStaticMethod();
        System.out.println();
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.someStaticMethod();
        System.out.println(instance2);
*/

        LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();
        System.out.println(instance1);
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
        System.out.println(instance2);
        LazyInitializationSingleton instance3 = LazyInitializationSingleton.getInstance();
        System.out.println(instance3);
        LazyInitializationSingleton instance4 = LazyInitializationSingleton.getInstance();
        System.out.println(instance4);
        LazyInitializationSingleton instance5 = LazyInitializationSingleton.getInstance();
        System.out.println(instance5);

        System.out.println(instance1== instance1);

        System.out.println(instance2== instance1);

        System.out.println(instance3== instance1);

        System.out.println(instance4== instance1);

        System.out.println(instance5== instance1);


    }
}
