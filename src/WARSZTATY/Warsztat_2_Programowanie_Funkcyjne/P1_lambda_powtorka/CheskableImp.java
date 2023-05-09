package WARSZTATY.Warsztat_2_Programowanie_Funkcyjne.P1_lambda_powtorka;

public class CheskableImp implements Checkable{
    @Override
    public boolean myTester(String value) {
        System.out.println("Calling Checkable Implementation");
        return value.contains("zajavka");
    }
}
