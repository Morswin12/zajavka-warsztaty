package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P11_SINGLETON;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception thrown while creating instance");
        }
    }

    private StaticBlockSingleton() {
        System.out.println("Constructor StaticBlockSingleton()");
    }

    public static StaticBlockSingleton getInstance() {
        System.out.println("getInstance() StaticBlockSingleton()");
        return instance;
    }

    public void someStaticMethod() {
        System.out.println("Calling someStaticMetod()");
    }

    @Override
    public String toString() {
        return "StaticBlockSingleton{From toString}";
    }
}