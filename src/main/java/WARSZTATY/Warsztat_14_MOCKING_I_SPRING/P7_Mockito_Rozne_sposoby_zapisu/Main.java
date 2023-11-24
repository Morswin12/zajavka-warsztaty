package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P7_Mockito_Rozne_sposoby_zapisu;

public class Main {
    // 2 Różne Zapisy Mockito:
    /*
    1)
        Mockito
                .when(injectedBeanService6.anotherSampleMethod6(ArgumentMatchers.anyString()))
                .thenThrow(new RuntimeException("jaba daba du exception"));
        Mockito
                .when(...)
                .thenResult(...);


     2)
        Mockito
                .doThrow()
                .when(injectedBeanService6)
                .anotherSampleMethod6(ArgumentMatchers.anyString());
        Mockito
                .doResult()
                .when(...)
                .jakaśMetodaNaZamockowanejKlasie;

     */
    public static void main(String[] args) {

    }
}
