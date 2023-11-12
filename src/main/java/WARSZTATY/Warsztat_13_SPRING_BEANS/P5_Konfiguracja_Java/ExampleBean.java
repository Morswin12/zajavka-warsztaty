package WARSZTATY.Warsztat_13_SPRING_BEANS.P5_Konfiguracja_Java;

public class ExampleBean {
    private final InjectedBean injectedBean;
    private final AnotherInjectedBean anotherInjectedBean;

    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling ExampleBean()");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod()");
    }
}
