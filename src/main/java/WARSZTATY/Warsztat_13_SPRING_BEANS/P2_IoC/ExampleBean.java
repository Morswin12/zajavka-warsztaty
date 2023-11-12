package WARSZTATY.Warsztat_13_SPRING_BEANS.P2_IoC;

public class ExampleBean {


    private InjectedBean injectedBean;


    /*
    Jest to przykład kontroli nie odwróconej, bo to ExampleBean decyduje niejako na sztywno jaka instancja zostanie
            stworzona w konstruktorze (new InjectionBean()) trochę na sztywno, bo nie mamy możliwości paratryzowania co
            tu tak naprawdę zostanie stworzone i do tej zależności przypisane.
     */

    /*
    public ExampleBean() {
        this.injectedBean = new InjectedBean();
    }
    */
     /*
     A teraz kontrola odwrócona gdzie dajemy elastyczność poprzez przymus wstrzyknięcia w konstruktorze instancje
            klasy InjectedBean
      */

    public ExampleBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }
}
