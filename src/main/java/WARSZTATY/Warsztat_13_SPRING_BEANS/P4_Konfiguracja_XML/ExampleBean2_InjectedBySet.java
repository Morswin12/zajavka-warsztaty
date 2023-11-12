package WARSZTATY.Warsztat_13_SPRING_BEANS.P4_Konfiguracja_XML;

public class ExampleBean2_InjectedBySet {
    private InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;

    public void setInjectedBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
        System.out.println("Calling setInjectedBean()");
    }

    public void setAnotherInjectedBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling setAnotherInjectedBean()");
    }

    public void exampleMethod22() {
        System.out.println("Calling exampleMethod22()");
    }
}
