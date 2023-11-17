package WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.configuration;

import WARSZTATY.Warsztat_13_SPRING_BEANS.P_10_Wlasciwosci_Bean_Scope.code.InjectedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype")
public class ExamplePrototypeBean {

    private InjectedBean injectedBean;

    @Autowired
    public ExamplePrototypeBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void exampleMethod() {
        injectedBean.someMetod();
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
