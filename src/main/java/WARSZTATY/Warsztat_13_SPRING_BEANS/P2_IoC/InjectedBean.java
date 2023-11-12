package WARSZTATY.Warsztat_13_SPRING_BEANS.P2_IoC;

public class InjectedBean {

    private ExampleBean exampleBean;

    public InjectedBean(ExampleBean exampleBean) {
        this.exampleBean = exampleBean;
    }
}
