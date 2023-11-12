package WARSZTATY.Warsztat_13_SPRING_BEANS.P2_IoC;

public class Main {
    /*
    Java Beans
    -> wszystkie pola prywatne
    -> getX, setX (getery i setery)
    -> public no-arguments constructor
    -> implements Serializable
     */
    /*
    Spring Beans
    -> są to takie obiekty w tej nasze aplikacji, które tworzą szkielet tej aplikacji i które są zarządzane przez
            kontener Spring IoC (Spring Invention of Control container)
    -> czyli żeby cos było Spring Bean'em musi zostać wychwycone przez Spring IoC container, jeśli nie to po prostu jest
            Java Bean'em
    -> czyli trzeba tak pisać fragmenty kodu, żeby Spring wiedział, że on ma zarządzać jakimiś klasami, obiektami
            stworzonymi na podstawie danych klas. I te obiekty są Spring Bean'ami

    IoC -> Invention of Control (Odwrócenie kontroli). U nas w tym przypadku, to Spring będzie zarządzał zależnościami,
            a nie my
    DI -> Dependency Injection  (wstrzykiwanie zależności)

     */
    public static void main(String[] args) {

    }
}
