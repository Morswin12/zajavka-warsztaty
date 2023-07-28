package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P16_PROJEKT__InterfejsyFunkcyjne;

import java.util.function.Supplier;

public class Producer {

    public static <T> Supplier getSupplyerImpl(T t) {
        return ()-> t;
        }

        public static <T> void getConsumerImpl(T t) {
            System.out.println(t);
        }


}
