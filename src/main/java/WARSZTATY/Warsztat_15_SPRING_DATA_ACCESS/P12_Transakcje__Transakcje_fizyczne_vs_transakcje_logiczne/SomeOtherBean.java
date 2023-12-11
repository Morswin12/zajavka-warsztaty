package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P12_Transakcje__Transakcje_fizyczne_vs_transakcje_logiczne;

import WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P11_Transakcje__Zarzadzanie_deklaratywne.Person;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class SomeOtherBean {

    private static final String SQL = "INSERT INTO PERSONGORO (NAME, AGE) VALUES (:name, :age)";

    private SimpleDriverDataSource simpleDriverDataSource;

    @Transactional(
            // Najlepiej z tego nie korzystać i zostawić ustawienia domyślne
            propagation = Propagation.REQUIRED, // Możemy ustawić tu sposób jeden z 7 rodzajów działania z zagnieżdżonymi transakcjami
            isolation = Isolation.DEFAULT           // Możemy ustawić tu poziom izolacji dla danej transakcji jeden z 5 dostępnych
    )
    public Integer example() {

        int result = 0;
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(simpleDriverDataSource);

        Person person1 = Person.builder().name("Wiesiu").age(55).build();
        Person person2 = Person.builder().name("Czesiu").age(44).build();
        Person person3 = Person.builder().name("Wiesiu2").age(33).build();

        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person1));
        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person2));
        result += jdbcTemplate.update(SQL, new BeanPropertySqlParameterSource(person3));
        return result;
    }
}
