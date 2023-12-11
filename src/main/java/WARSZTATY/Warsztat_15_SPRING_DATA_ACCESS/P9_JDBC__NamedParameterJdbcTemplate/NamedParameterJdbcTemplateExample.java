package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P9_JDBC__NamedParameterJdbcTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class NamedParameterJdbcTemplateExample {

    private final SimpleDriverDataSource simpleDriverDataSource;

    void exampleGoro() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(simpleDriverDataSource);

        String sql = "INSERT INTO PERSON (NAME, AGE) VALUES (:name, :age)";

        // Parametry możemy uzupełnić na kilka sposobów
        // Sposób 1:
        Map<String, Object> params1 = new HashMap<>();
        params1.put("name", "Józef");
        params1.put("age", 57);

        int result = template.update(sql, params1);
        System.out.println(result);

        // Sposób 2:
        MapSqlParameterSource params2 = new MapSqlParameterSource()
                .addValue("name", "Tomek")
                .addValue("age", 45);
        int result2 = template.update(sql, params2);
        System.out.println(result2);

        // Sposób 3:

        Person person = Person.builder()
                .name("Łukasz")
                .age(99)
                .build();

        BeanPropertySqlParameterSource params3 = new BeanPropertySqlParameterSource(person);

        int result3 = template.update(sql, params3);
        System.out.println(result3);
    }
}
