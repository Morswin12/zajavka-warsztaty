package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P9_JDBC__NamedParameterJdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);

        NamedParameterJdbcTemplateExample example = context.getBean(NamedParameterJdbcTemplateExample.class);

        example.exampleGoro();
    }
}
