package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P16_PROJEKT__InterfejsyFunkcyjne;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Wiatrak wiatrak = new Wiatrak(342);
        Supplier mySupplayer = Producer.getSupplyerImpl(wiatrak);
        System.out.println(mySupplayer.get());

        Producer.getConsumerImpl(32);

    }

    private static class Wiatrak {
        private final int number;

        public Wiatrak(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Wiatrak{" +
                    "number=" + number +
                    '}';
        }
    }

}
