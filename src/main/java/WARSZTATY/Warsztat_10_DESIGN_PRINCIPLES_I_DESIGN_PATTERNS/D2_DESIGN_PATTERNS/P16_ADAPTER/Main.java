package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P16_ADAPTER;

public class Main {
    public static void main(String[] args) {
        /* Adapter — używamy np. gdy mamy 2 niezwiązane ze sobą interfejsy i chcemy te interfejsy zachęcić do wspólnej
               pracy. Lub inaczej możemy mieć jakąś zewnętrzną Bibliotekę, która dostarcza nam jakieś API (Application
               Programming Interface- umożliwia programistą korzystanie z funkcji i usług dostarczonych przez inne
               oprogramowanie lub platformy bez konieczności rozumienia wszystkich szczegółów ich wewnętrznego
               działania. W skrócie API działa jako Interfejs komunikacyjne między różnymi komponentami oprogramowania),
               ale nam to API się nie podoba i chcemy je dostosować, zaadoptować do naszych potrzeb do naszych
               interfejsów, czyli mamy wtedy Interfejsy z tej biblioteki, mamy Interfejsy nasze i wykorzystujemy wtedy
               wzorzec projektowy adaptera po to, żeby zadatować te interfejsy tak, aby działały one wspólnie ze sobą.
               Czyli napisalibyśmy kod, który by sprawił, że biblioteka będzie działała po naszemu.

               Inny przykład wykorzystania: Jeżeli korzystalibyśmy z biblioteki zewnętrznej to dobrze by było taką
               bibliotekę adaptować do naszego projektu. Jeśli tego byśmy nie zrobili to biblioteka może wymusić na
               naszym kodzie fakty istnienia lub nieistnienia jakichś konstrukcji albo to, jak my mamy u siebie budować
               nasz kod.

               Cyli adapter to taka przejściówka np.
               nasz kod             -->     adapter         -->     biblioteka lub jakiś zewnętrzny program
               klucz grzechotka     -->     nasadka         -->     śruba
               wyjście usb-C        -->     przejściówka    -->     słuchawki z końcówką jack

               1. Zmusić do pracy 2 interfejsy niezależne od siebie
               2. Ewentualnie piszemy adapter, zanim dostaniemy źródło danych
         */

        Dimension dimension = new SonyTV();
        DimensionAdapter dimensionAdapter = new DimensionAdapterImpl(dimension);

        System.out.println("Original inch " + dimension.getDimension() + " inch");
        System.out.println("Adapted to m  " + dimensionAdapter.getDimension() + " m");

        DimensionAdapterCm dimensionAdapterCm = new DimensionAdapterCmImpl(dimension);

        System.out.println("Adapted to cm " + dimensionAdapterCm.getDimensionCm() + " cm");

    }}
