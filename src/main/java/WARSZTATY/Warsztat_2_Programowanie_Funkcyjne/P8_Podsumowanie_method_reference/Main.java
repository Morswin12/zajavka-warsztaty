package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P8_Podsumowanie_method_reference;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        IYacht yacht = model -> System.out.println("Currently sailing on " + model);
        IYacht yacht2 = Main::someMethod;
        IYacht yacht3 = main::someMethod2;
        yacht3.sail("asdf");

        yacht.sail("Regat");
        yacht2.sail("Kombat");

        main.run();
    }

    private void run() {
        IYacht yacht = System.out::println;
    }

    static void someMethod(String s) {
        System.out.println("Calling static method " + s);
    }
    void someMethod2(String s) {
        System.out.println("Calling nonstatic method " + s);
    }
}
