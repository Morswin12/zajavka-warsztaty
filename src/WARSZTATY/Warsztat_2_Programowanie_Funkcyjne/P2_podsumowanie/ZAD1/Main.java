package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P2_podsumowanie.ZAD1;

public class Main {
    public static void main(String[] args) {
        Exe1Interface exe1Interface = a -> String.valueOf(a);
        Exe1Interface exe1Interface2 = a -> "Liczba: "+a;
        System.out.println(exe1Interface.zad1test(23));
        System.out.println(exe1Interface2.zad1test(23));

        Exe2Interface exe2Interface = (int i, String s) -> s + i;
        System.out.println(exe2Interface.zad2test(88, "Pawel: "));

        Exe3Interface exe3Interface = (i1, i2, s) -> s.substring(i1, i2);
        System.out.println(exe3Interface.zad3test(2,6, "Jestem z miasta"));

        Exe3Interface exe3Interface2 = new Exe3Impl();
        System.out.println(exe3Interface2.zad3test(2, 9, "adasdsadsadasdsa"));

    }
}
