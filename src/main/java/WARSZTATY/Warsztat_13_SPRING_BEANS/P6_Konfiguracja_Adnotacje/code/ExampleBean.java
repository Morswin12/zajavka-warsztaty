package WARSZTATY.Warsztat_13_SPRING_BEANS.P6_Konfiguracja_Adnotacje.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    public InjectedBean injectedBean;
    public AnotherInjectedBean anotherInjectedBean;

    public ExampleBean() {
        System.out.println("Calling ExampleBean() Empty");
    }

    public ExampleBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    @Autowired  // - dzięki temu możemy wskazać, który konstruktor będzie wykonany przez Springa. Od wersji 4.3, gdy
                //      mamy tylko jeden konstruktor, to nie musimy dodawać adnotacji @Autowired. Natomiast, gdy mamy 2
                //      konstruktory, to bez jej podania zostanie uruchomiony konstruktor bezparametrowy.
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling ExampleBean() with parameters");
    }

    public void someMethodExampleBean() {
        System.out.println("Calling someMethodExampleBean()  " + injectedBean + "  " + anotherInjectedBean);
    }
}
