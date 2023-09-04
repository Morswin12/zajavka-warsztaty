package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.StandardHandler;

public class Main {
    public static void main(String[] args) {
        /*
        Chain Of Responsibility-> pozwala nam na zaprojektowanie łańcucha obiektów, które będą służyły do przetworzenia
                                jakiegoś zagadnienia, jakiegoś fragmentu logiki. Każdy element tego łańcucha może
                                decydować, czy mamy kontynuować i przejść do kolejnego elementu, czy też przerwać
                                przetwarzanie tej logiki/ algorytmu.
                                Czyli tworzymy taki łańcuch obiektów, które będą w stanie obsłużyć jakąś prośbę przez
                                klienta.
                                Np. łańcuch stanowisk w zakładzie produkcyjnym samochodów.
                                Trochee jak streamy, ale nie musi to być kolekcja
                                każdy element w łańcuchy wie tylko o kolejnym elemencie

            Handler
            Concrete Handler

            klient -> 0 -> 0 -> 0 -> 0 -> 0
         */
    }
}
