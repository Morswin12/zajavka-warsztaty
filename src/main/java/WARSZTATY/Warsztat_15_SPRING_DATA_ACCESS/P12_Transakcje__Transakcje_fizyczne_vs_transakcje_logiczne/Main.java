package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P12_Transakcje__Transakcje_fizyczne_vs_transakcje_logiczne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);
        TransactionTemplateExample contextBean = context.getBean(TransactionTemplateExample.class);
        contextBean.someMethod();
    }
}
