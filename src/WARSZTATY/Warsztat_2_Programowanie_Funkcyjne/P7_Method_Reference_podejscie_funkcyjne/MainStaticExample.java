package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P7_Method_Reference_podejscie_funkcyjne;

public class MainStaticExample {

    public static void main(String[] args) {

//        MilkProducer producer = () -> "asdf";

        MilkProducer producer = MainStaticExample::someMilkReference1;

//        MilkConsumer consumer = arg1 -> {
//            System.out.println("Calling consumer");
//            return "someMilkConsume: " + arg1;
//        };

        MilkConsumer consumer = MainStaticExample::someMilkReference2;

        System.out.println(producer.producer());
        System.out.println(consumer.consume("Chocko"));

    }

    public static String someMilkReference1() {
        System.out.println("Calling someMilkReference1");
        return "someMilkFromMethod";
    }

    public static String someMilkReference2(String arg1) {
        System.out.println("Calling someMilkReference2");
        return "consumeMilkFromMethod: " + arg1;
    }

    @FunctionalInterface
    interface MilkProducer {
        String producer();
    }

    @FunctionalInterface
    interface MilkConsumer {
        String consume(String toCosume);
    }
}
