package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P5_Mockito__Bledna_konfiguracja_Mockito;

public class InjectedBeanServiceIMPL implements InjectedBeanService {

    @Override
    public String anotherSampleMethod(String input) {
        return "some value: " + input;
    }
}
