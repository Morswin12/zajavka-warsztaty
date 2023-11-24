package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P3_Mockito_Przyklady;

public class Main {
    public static void main(String[] args) {
        InjectedBeanServiceImpl injectedBeanService = new InjectedBeanServiceImpl();
        ExampleBeanService exampleBeanService = new ExampleBeanServiceImpl();
        exampleBeanService.setInjectedBeanService(injectedBeanService);
        System.out.println(exampleBeanService.sampleMethod());
    }
}
