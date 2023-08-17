package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P11_SINGLETON;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;


    private LazyInitializationSingleton() {
        System.out.println("Constructor of   LazyInitializationSingleton()");
    }

    public static LazyInitializationSingleton getInstance() {
        System.out.println("LazyInitializationSingleton getInstance()");
        if (instance == null) {
            instance = new LazyInitializationSingleton();
            System.out.println("Create constructor because LIS is null");
        }
        return instance;
    }

    public static void someStaticMethod() {
        System.out.println("Calling some static method ");
    }

    @Override
    public String toString() {
        return "LazyInitializationSingleton{}";
    }
}
