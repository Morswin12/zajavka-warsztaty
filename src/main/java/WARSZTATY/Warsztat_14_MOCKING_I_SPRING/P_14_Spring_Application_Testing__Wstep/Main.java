package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_14_Spring_Application_Testing__Wstep;

public class Main {

    // Jeśli będziemy testować przez Mockito projekt/klasy Springowe z uwzględnieniem contextu Springowego
    // to już nie będą to testy jednostkowe tylko testy integracyjne;
    // Czyli:
    // Samo Mockito -> Java + JUnit5 + Mockito -> są to testy jednostkowe (nie podnosimy tutaj Springa;
    // Spring test  -> Java + JUnit5 + Mockito + Spring context -> to jest to już test integracyjny, ponieważ
    //                                                          podnieśliśmy już Bean-y i te obiekty muszą się jakoś
    //                                                          ze sobą integrować;

    // Spring test ma większe możliwości mockowania i możemy wyróżnić kilka części np.:
    //      -> Environment - ten moduł będzie odpowiedzialny za mockowanie obiektów na podstawie klasy:
    //          org.springframework.core.env.Environment, lub:
    //          org.springframework.core.env.PropertySource, np. gdybyśmy pracowali ze zmiennymi środowiskowymi;
    //
    //      -> Servlet API - przyszłość;
    //      -> Spring Web Reactive - przyszłość;
}
