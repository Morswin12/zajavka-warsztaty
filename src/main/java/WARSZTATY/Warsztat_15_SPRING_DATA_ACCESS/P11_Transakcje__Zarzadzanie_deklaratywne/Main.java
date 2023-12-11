package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P11_Transakcje__Zarzadzanie_deklaratywne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        TransactionTemplateExample exampleBean = context.getBean(TransactionTemplateExample.class);

        exampleBean.someMethod();
    }
}
