package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P19_PROXY;

public class Main {
    /* PROXY
         -> Gdy chcemy mieć kontrolowany dostęp do jakiegoś zasobu, czyli w sposób kontrolowany określać, czy jakaś
            metoda (lub fragment kodu) powinna zostać wykonana, czy też nie. Czyli np. gdy mamy jakąś metodę to
            zostanie ona wykonana pod warunkiem, że ktoś, kto próbuje tę metodę wykonać spełnia jakieś założenia lub
            ma odpowiednie uprawnienia.

            1. kontrolowany dostęp do zasobów
            2. my       -> proxy    -> źródło (Proksy keszuje dane, czyli zapisuje do momentu aż w źródle się zmienią)
               Klient   -> Kelner   -> Chef  >> kelner ju na etapie zamówienia może odpowiedzieć na pytanie o
                                                braku dostępności niektórych potraw, zamiast o wszystko pytać chef'a

     */
    public static void main(String[] args) {

        PizzaBaker executor = new PizzaBakerProxy(new PizzaBakerImpl());
        executor.bake("Pepperoni");
        executor.bake("Margaritta");
        executor.bake("Hawaiian");

        System.out.println(executor);
    }
}
