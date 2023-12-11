package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P6_JDBC__JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // JDBC Template
        ApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfiguration.class);

        JdbcTemplateExample example = context.getBean(JdbcTemplateExample.class);
//        example.insert();
//        example.update();
        example.delete();
        example.select();

    }
}
