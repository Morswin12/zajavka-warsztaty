package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P10_Transakcje__Zarzadzanie_programowalne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
// programowalne zarządzanie transakcją

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);

        TransactionTemplateExample jdbcTemplateExample = context.getBean(TransactionTemplateExample.class);

//        jdbcTemplateExample.example1_IntegerMethodInside();
        jdbcTemplateExample.example2_VoidMethodInside();
    }
}
