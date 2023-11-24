package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P5_Mockito__Bledna_konfiguracja_Mockito;

public class ExampleBeanServiceImpl implements ExampleBeanService {

    private InjectedBeanService injectedBeanService;

    public void setInjectedBeanService(InjectedBeanService injectedBeanService) {
        this.injectedBeanService = injectedBeanService;
    }

    public String sampleMethod() {
        return injectedBeanService.anotherSampleMethod("goro");
    }
}
