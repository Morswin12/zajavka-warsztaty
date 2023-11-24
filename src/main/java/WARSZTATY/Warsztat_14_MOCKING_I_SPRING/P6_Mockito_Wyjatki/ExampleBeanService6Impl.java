package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P6_Mockito_Wyjatki;

public class ExampleBeanService6Impl implements ExampleBeanService6 {

    private InjectedBeanService6 injectedBeanService6;
    @Override
    public void setInjectedBeanService6(InjectedBeanService6 injectedBeanService6) {
        this.injectedBeanService6 = injectedBeanService6;
    }

    @Override
    public String sampleMethod6() {
        return injectedBeanService6.anotherSampleMethod6("goro");
    }
}
