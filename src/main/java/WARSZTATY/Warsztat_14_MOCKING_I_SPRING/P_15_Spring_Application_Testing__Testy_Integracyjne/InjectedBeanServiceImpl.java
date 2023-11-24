package WARSZTATY.Warsztat_14_MOCKING_I_SPRING.P_15_Spring_Application_Testing__Testy_Integracyjne;

import org.springframework.stereotype.Service;

@Service
public class InjectedBeanServiceImpl implements InjectedBeanService {

    @Override
    public boolean anotherSampleMethod() {
        System.out.println("InjectedBeanServiceImpl#anotherSampleMethod()");
        return false;
    }
}
