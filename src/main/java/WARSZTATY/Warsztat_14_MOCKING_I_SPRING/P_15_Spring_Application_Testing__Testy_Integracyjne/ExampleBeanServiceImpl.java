package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_15_Spring_Application_Testing__Testy_Integracyjne;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ExampleBeanServiceImpl implements ExampleBeanService {

    private InjectedBeanService injectedBeanService;

    @Override
    public boolean sampleMethod() {
        return injectedBeanService.anotherSampleMethod();
    }

}
