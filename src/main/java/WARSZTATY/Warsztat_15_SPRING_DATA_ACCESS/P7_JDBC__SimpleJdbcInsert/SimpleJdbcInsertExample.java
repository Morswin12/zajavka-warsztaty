package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P7_JDBC__SimpleJdbcInsert;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class SimpleJdbcInsertExample {

    private final SimpleDriverDataSource simpleDriverDataSource;

    public void simpleJdbcInsertExample() {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(simpleDriverDataSource);
        simpleJdbcInsert.setTableName("PERSON");

        Person goro = Person.builder()
                .name("Goro")
                .id(34L)
                .age(35)
                .build();

        BeanPropertySqlParameterSource parameterSourceGoro = new BeanPropertySqlParameterSource(goro);

        Map<String, Object> params = new HashMap<>();
        params.put("ID", 15);
        params.put("NAME", "Karol1");
        params.put("AGE", 38);

        int result1 = simpleJdbcInsert.execute(params);
        int result2 = simpleJdbcInsert.execute(parameterSourceGoro);
        System.out.println(result1);
        System.out.println(result2);
    }
}
