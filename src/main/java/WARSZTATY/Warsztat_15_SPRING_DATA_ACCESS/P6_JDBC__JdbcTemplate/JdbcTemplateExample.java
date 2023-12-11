package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P6_JDBC__JdbcTemplate;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class JdbcTemplateExample {

    private final SimpleDriverDataSource simpleDriverDataSource;

    public void insert() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(simpleDriverDataSource);
//        String sql = "INSERT INTO PERSON (ID, NAME, AGE) VALUES (?, ?, ?)"; - nie musimy określać nr id, bo spring
//                                                                              zrobi to za nas
        String sql = "INSERT INTO PERSON (NAME, AGE) VALUES (?, ?)";
        jdbcTemplate.update(sql, "Andrzej", 36);
    }


    public void update() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(simpleDriverDataSource);
        String sql = "UPDATE PERSON SET AGE = ? WHERE NAME = ?";
        jdbcTemplate.update(sql, 39, "Romanow");

    }

    public void select() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(simpleDriverDataSource);
        String sql = "SELECT * FROM PERSON";
        RowMapper<Person> personRowMapper = (resultSet, rowNumber) -> Person.builder()
                .id(resultSet.getLong("ID"))
                .name(resultSet.getString("NAME"))
                .age(resultSet.getInt("AGE"))
                .build();
        List<Person> result1 = jdbcTemplate.query(sql, personRowMapper);
        System.out.println(result1);

        BeanPropertyRowMapper<Person> personBeanPropertyMapper
                = BeanPropertyRowMapper.newInstance(Person.class);

        List<Person> result2 = jdbcTemplate.query(sql, personBeanPropertyMapper);
        System.out.println(result2);
    }

    public void delete() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(simpleDriverDataSource);
        String sql = "DELETE FROM PERSON WHERE NAME = ?";
        int result = jdbcTemplate.update(sql, "Roman");

        System.out.println(result);
    }
}
